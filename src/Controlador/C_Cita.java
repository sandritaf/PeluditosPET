package Controlador;

import Conexion.Conexion;
import Modelo.M_Cita;
import Modelo.M_Juridico;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Cita {

    public C_Cita() {
    }
    
    public void guardarCita(M_Cita cita){
          try{
              Conexion.getInstancia().guardar(cita);
              JOptionPane.showMessageDialog(null, "Se ha almacenado la cita");
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
    
    
    public void listarCitas(){
        try{
            M_Cita c = new M_Cita(0, null, null, null, null, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(c);
            System.out.println("Tengo " + resultado.size() + " citas.\n");
            while(resultado.hasNext()){
                ((M_Cita)resultado.next()).imprimir();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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
    
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"Codigo", "Servicio","Mascota","Dueño", "Fecha","Conclusion"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Cita[] p = getCitas();
            if (p != null) {
                for (M_Cita per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getId();
                    cli[1] = per.getServicio().getNombre();
                    cli[2] = per.getMascota().getNombre();
                    cli[3] = per.getMascota().getDueno().toString();
                    cli[4] = per.getFecha();
                    cli[4] = per.getDiagnosticoFinal();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
