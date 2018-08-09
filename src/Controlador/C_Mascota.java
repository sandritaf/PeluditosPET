
package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class C_Mascota {
    
    public C_Mascota() {
    }    

    public void guardarMascota(M_Mascota mascota, M_Propietario dueno){
        try{
            Conexion.getInstancia().guardar(mascota);
            
            if (dueno instanceof M_Natural){
                C_Natural c1 = new C_Natural();
                M_Natural n = (M_Natural)dueno;
                c1.agregarMascota(mascota, n, n.getCedula());
                JOptionPane.showMessageDialog(null, "Se agrego en Natural la mascota");
            } else {
                C_Juridico c2 = new C_Juridico();
                M_Juridico j = (M_Juridico)dueno;
                c2.agregarMascota(j.getRIF(), j, mascota);
                JOptionPane.showMessageDialog(null, "Se agrego a un cliente juridico la mascota");
            }
                        
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        
    }
      
    public void eliminarMascota(String pk){
        try{
            M_Mascota mascota = new M_Mascota(pk, null, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(mascota);
        
            M_Mascota encontrado = (M_Mascota) result.next();
            Conexion.getInstancia().eliminar(encontrado);

            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del animal");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarMascota(String id, M_Mascota m){
        try{
            M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(mascota);
            M_Mascota encontrado = (M_Mascota) result.next();

            encontrado.setNombre(m.getNombre());
            encontrado.setEspecie(m.getEspecie());
            encontrado.setRaza(m.getRaza());
            encontrado.setObservaciones(m.getObservaciones());
            encontrado.setEdad(m.getEdad());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el animalito" );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void verMascota(String id, M_Propietario p){
        try{
            M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            JOptionPane.showMessageDialog(null, resultado.next());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void listarMascotas(){
        try{
            M_Mascota m = new M_Mascota(null, null, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(m);
            System.out.println("Tengo " + resultado.size() + " mascotas");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void cargarDuenos(JComboBox duenos/*, String opc*/){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            duenos.setModel(aModel);

    //    if(opc.equals("Natural")){
        M_Propietario p = new M_Natural(null, null, null, null, null, null);
    //    }
    //    if (opc.equals("Juridico"))
    //    {
        M_Propietario p1 = new M_Juridico(null, null, null, null, null, null);
    //    }    

            ObjectSet rs = Conexion.getInstancia().buscar(p);
            ObjectSet rs1 = Conexion.getInstancia().buscar(p1);

            // si hay propietarios naturales
            if(rs.size() >0){
                while(rs.hasNext() ){
                    aux = rs.next().toString();
                    aModel.addElement(aux);
                }
            }
            // si hay propietarios juridicos
            if(rs1.size() > 0){ 
                while(rs1.hasNext() ){
                   aux = rs1.next().toString();
                   aModel.addElement(aux);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean idExiste(String id){
        try{    
            M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            if(!resultado.next().equals(""))
                return true;
            return false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
    public M_Mascota[] getMascotas(){
        try {
            M_Mascota[] mascotas = null;
            M_Mascota mascotica = new M_Mascota(null, null, null, null, 0, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(mascotica);
            int i = 0;
            if (resultados.hasNext()) {
                mascotas = new M_Mascota[resultados.size()];
                while (resultados.hasNext()) {
                    mascotas[i] = (M_Mascota) resultados.next();
                    i++;
                }
            }
            return mascotas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->getMascotas: "+e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"ID", "Nombre","Especie","Raza", "Edad","Observaciones"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Mascota[] p = getMascotas();
            if (!p.equals(null)) {
                for (M_Mascota per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getId();
                    cli[1] = per.getNombre();
                    cli[2] = per.getEspecie();
                    cli[3] = per.getRaza();
                    cli[4] = per.getEdad();
                    cli[5] = per.getObservaciones();
                    dtm.addRow(cli);
                }
                return dtm;
            } else {
                JOptionPane.showMessageDialog(null, "NO HAY MASCOYAS");
            }
            return null;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarTabla: " +e);
            return null;
        }
    }
    
}
