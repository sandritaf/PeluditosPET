package Controlador;

import Modelo.M_Cita;
import Conexion.Conexion;
import Modelo.M_Estilista;
import Modelo.M_Factura;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Trabajador;
import Modelo.M_Veterinario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.sun.swing.internal.plaf.metal.resources.metal;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class C_Cita {

    public C_Cita() {
    }
    
    private void guardar(M_Cita cita){
        try{
              Conexion.getInstancia().guardar(cita);
              JOptionPane.showMessageDialog(null, "Se ha almacenado la cita");
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "error en C_Cita->guardar: "+ e);
          }
    }
    
    public void guardarCita(M_Cita cita){
          try{
              //Cada nueva ejecucion del proyecto se vuelve el contador a 0
              //Esta condicion es que cuando el contador sea 0 pero en la BDD hayan citas guardadas
              if (cita.getCantidad() == 0 && getNumCitasExistentes() > 0){
                  cita.setCantidad(getCitas().length);
              }
              cita.aumentarCantidad(); //Se aumenta la cita
              cita.setId(cita.getCantidad()); //Se actualiza el numero de cita
              guardar(cita);
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "error en C_Cita->guardarCita: "+ e);
          }
        
    }
    
    public void eliminarCita(int codigo){
        try{
            M_Cita c = new M_Cita(codigo,null,null,null,null,null,null);
            ObjectSet resultado = Conexion.getInstancia().buscar(c);
            M_Cita encontrado = (M_Cita) resultado.next();
                        
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente la cita");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public int getNumCitasExistentes(){
        try{
            M_Cita c = new M_Cita(0, null, null, null, null, null, null);            
            ObjectSet result = Conexion.getInstancia().buscar(c);
            if (!result.isEmpty()){
                return result.size();
            }
            return 0;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en C_Cita->getNumCitasExistentes: "+e);
            return 0;
        }
    }
    
    public int getNumCitasCanceladas(){
        try{
            M_Cita c = new M_Cita(0, null, null, null, null, null, null, true);            
            ObjectSet result = Conexion.getInstancia().buscar(c);
            if (!result.isEmpty()){
                return result.size();
            }
            return 0;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en C_Cita->getNumCitasExistentes: "+e);
            return 0;
        }
    }
    
    public void modificarCita(int id, M_Cita c){
        try{    
            M_Cita cita = new M_Cita(id, null, null, null, null, null, null);            
            ObjectSet result = Conexion.getInstancia().buscar(cita);
            if (!result.isEmpty()){
                M_Cita encontrado = (M_Cita) result.next();

                encontrado.setDiagnosticoFinal(c.getDiagnosticoFinal());
                encontrado.setFecha(c.getFecha());
                encontrado.setMascota(c.getMascota());
                encontrado.setServicio(c.getServicio());
                encontrado.setTrabajador(c.getTrabajador());
                encontrado.setTratamiento(c.getTratamiento());
                encontrado.setId(id);
                
                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "Se ha modificado la cita" );
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en C_cita->modificarCita: "+e);
        }
    }
    
    public M_Cita getCita(int id){
        try{
            M_Cita cita = new M_Cita(id, null, null, null, null, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(cita);
            if (resultado.isEmpty())
                return null;
            M_Cita encontrado = (M_Cita) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }
    
    public void listarCitas(){
        try{
            M_Cita c = new M_Cita(0, null, null, null, null, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(c);
            System.out.println("Tengo " + resultado.size() + " citas.\n");
            while(resultado.hasNext()){
               //System.out.println(((M_Cita)resultado.next()).toString());// imprimir();
               System.out.println(((M_Cita)resultado.next()).imprimirT());// toString());// imprimir();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Cita->listarCitas() "+e);
        }      
    }
    
    
    public M_Cita[] getCitas(){
        try {
            M_Cita[] c = null;
            M_Cita j = new M_Cita(0, null, null, null, null, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(j);
            int i = 0;
            if (resultados.hasNext()) {
                c = new M_Cita[resultados.size()];
                while (resultados.hasNext()) {
                    c[i] = (M_Cita) resultados.next();
                    i++;
                }
            }
            return c;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Citas->getCitas: "+e);
            return null;
        }
    }
    
    public M_Cita[] getCitas(String dueno, String mascota){
        try {
            C_Mascota cmascota = new C_Mascota();
            M_Cita[] c = null;
            M_Cita j = new M_Cita(0, cmascota.getMascota(mascota, dueno), null, null, null, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(j);
            int i = 0;
            if (resultados.hasNext()) {
                c = new M_Cita[resultados.size()];
                while (resultados.hasNext()) {
                    c[i] = (M_Cita) resultados.next();
                    i++;
                }
            }
            return c;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Citas->getCitas(dueno,mascota): "+e);
            return null;
        }
    }
    
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"ID","Mascota","Propietario","Trabajador", "Servicio", "Fecha", "Cancelado"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Cita[] p = getCitas();
            if (p != null) {
                for (M_Cita per : p) {
                    Object[] cli = new Object[7];
                    cli[0] = per.getId();
                    cli[1] = per.getMascota().getNombre();
                    cli[2] = per.getMascota().getDueno().nombreCompleto();
                    cli[3] = per.getTrabajador().nombreApellido();
                    cli[4] = per.getServicio().toString();
                    cli[5] = C_Fecha.deDateToString(per.getFecha());
                    cli[6] = per.estacancelado();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Cita->cargarTabla: "+e);
            return null;
        }
    }

    public void cargarMascotas(JComboBox combito, String dueno){
        try {
            M_Mascota mascotica = new M_Mascota(0,dueno, null, null, null, 0, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(mascotica);
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux = "";
            combito.setModel(aModel);
            
            if(resultados.size() >0){
                combito.setEnabled(true);
                while(resultados.hasNext() ){
                    aux = ((M_Mascota)resultados.next()).printNombreID();// toString();
                    aModel.addElement(aux);
                }
            } else combito.setEnabled(false);
            
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->getMascotas(M_Propietario): "+e);
        }
    }
    
    public void cargarCitasSinCancelar(JComboBox combito){
        try {
            M_Cita m = new M_Cita(0,null, null, null, null, null, null,false);
            ObjectSet resultados = Conexion.getInstancia().buscar(m);
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            M_Cita modelo = null;
            String aux = "";
            combito.setModel(aModel);
            
            if(resultados.size() >0){ 
                combito.setEnabled(true);
                while(resultados.hasNext() ){ 
                    modelo = (M_Cita)resultados.next();
                    if (!modelo.isCancelado()){
                        aux = modelo.toString();
                        aModel.addElement(aux);                        
                    }
                }
            } else combito.setEnabled(false);
            
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->getMascotas(M_Propietario): "+e);
        }
    }
    
    public DefaultTableModel cargarCitasCanceladas(String idVeterinario, Date fechai, Date fechaf){
        try{
            String titulos[] = {"Mascota","Diagnóstico Final","Tratamiento","Servicio", "Fecha", "Total"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Factura[] p = Conexion.getInstancia().buscarResultadosSODA(fechai, fechaf);            
            
            if (p != null) {
                for (M_Factura result : p) {
                    M_Cita per = result.getCita();
                    Object[] cli = new Object[6];
                    
                    //Si el veterinario correspondiente a la cita es el mismo que selecciono el usuario
                    if(per.getTrabajador().getCedula().compareTo(idVeterinario) == 0){
                        cli[0] = per.getMascota().getNombre();
                        cli[1] = per.getDiagnosticoFinal();
                        cli[2] = per.getTratamiento();
                        cli[3] = per.getServicio().toString();
                        cli[4] = C_Fecha.deDateToString(per.getFecha());
                        cli[5] = result.getTotal();
                        dtm.addRow(cli);
                    }
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Cita->cargarTabla: "+e);
            return null;
        }
    }
    
    public void cargarTrabajadores(JComboBox combito, String servicio){
        try {
            
            M_Trabajador trabajador = null;
            M_Trabajador trabajador1 = null;
            
            if(servicio.equals("Veterinario"))
                trabajador = new M_Veterinario(null, null, null, null, null, null, 0, null, null, 0, null, 0);
            else{
                trabajador = new M_Estilista(null, null, null, null, 0, null, null, 0, null, 0, true);
                trabajador1 = new M_Estilista(null, null, null, null, 0, null, null, 0, null, 0, false);
            }
            
            ObjectSet resultados = Conexion.getInstancia().buscar(trabajador);
            
            if(trabajador1 != null){
                ObjectSet resultados1 = Conexion.getInstancia().buscar(trabajador1);
            }
            
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux = "";
            combito.setModel(aModel);
            
            if(resultados.size() >0){
                combito.setEnabled(true);
                while(resultados.hasNext() ){
                    aux = ((M_Trabajador)resultados.next()).toString();
                    aModel.addElement(aux);
                }
            } else combito.setEnabled(false);
            
            if(trabajador1 != null){
                ObjectSet resultados1 = Conexion.getInstancia().buscar(trabajador1);
            
                if(resultados1.size() >0){
                    combito.setEnabled(true);
                    while(resultados.hasNext() ){
                        aux = ((M_Trabajador)resultados1.next()).toString();
                        aModel.addElement(aux);
                    }
                } else combito.setEnabled(false);
            }
            
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Cita->cargarTrabajadores: "+e);
        }
    }
}
