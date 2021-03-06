
package Controlador;

import Conexion.Conexion;
import Modelo.M_Especie;
import Modelo.M_Estilista;
import Modelo.M_Trabajador;
import Modelo.M_Veterinario;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Trabajador {
    
    public C_Trabajador(){
    }
    
    public void guardarTrabajador(M_Trabajador trabajador, String tipo){
        try{
            trabajador.setCedula(tipo+trabajador.getCedula());
            Conexion.getInstancia().guardar(trabajador);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del trabajador");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarTrabajador(String cedula){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0, null, 0);
            ObjectSet result = Conexion.getInstancia().buscar(trabajador);
            M_Veterinario encontrado = (M_Veterinario) result.next();
            Conexion.getInstancia().guardar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del trabajador");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarTrabajador(String cedulaVieja, String cedula, M_Trabajador t){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, cedulaVieja, null, 0, null, null, 0, null, 0);
            ObjectSet result = Conexion.getInstancia().buscar(trabajador);
            M_Trabajador encontrado = (M_Trabajador) result.next();

            encontrado.setNombre(t.getNombre());
            encontrado.setApellido(t.getApellido());
            encontrado.setCedula(cedula);
            encontrado.setEdad(t.getEdad());
            encontrado.setAniosExperiencia(t.getAniosExperiencia());
            encontrado.setProfesion(t.getProfesion());
            encontrado.setNivelInstruccion(t.getNivelInstruccion());
            encontrado.setRIF(t.getRIF());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al trabajador");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void verTrabajador(String cedula){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(trabajador);
            JOptionPane.showMessageDialog(null, resultado.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void listarTrabajadores(){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, null, null, 0, null, null, 0, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(trabajador);
            System.out.println("Tengo " + resultado.size() + " trabajadores");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public M_Trabajador[] getTrabajadores(){
        try {
            M_Trabajador[] personas = null;
            M_Trabajador trabajador = new M_Trabajador(null, null, null, null, 0, null, null, 0, null, 0);
            ObjectSet resultados = Conexion.getInstancia().buscar(trabajador);
            int i = 0;
            if (resultados.hasNext()) {
                personas = new M_Trabajador[resultados.size()];
                while (resultados.hasNext()) {
                    personas[i] = (M_Trabajador) resultados.next();
                    i++;
                }
            }
            return personas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en c_Trabajador->getTrabajadores: "+e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"Cedula","Nombre","Apellido","Teléfono","RIF", "Profesión"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Trabajador[] p = getTrabajadores();
            if (p != null) {
                for (M_Trabajador per : p) {
                    // solo carga a los trabajadores que no son ni estilistas, ni veterinarios
                    if( !(per instanceof M_Estilista) && !(per instanceof  M_Veterinario) ){
                        Object[] cli = new Object[6];
                        cli[0] = per.getCedula(); //subString(1);
                        cli[1] = per.getNombre();
                        cli[2] = per.getApellido();
                        cli[3] = per.getTelefono();
                        cli[4] = per.getRIF();
                        cli[5] = per.getProfesion();
                        dtm.addRow(cli);
                    }
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public M_Trabajador getPersona(String cedula){
        try{
    //        M_Trabajador trabajador = new M_Trabajador(null, null, "V"+cedula, null, 0, null, null, 0, null, 0);
            M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(trabajador);
            if (resultado.isEmpty())
                return null;
            M_Trabajador encontrado = (M_Trabajador) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }

    public void cargarTrabajadores(JComboBox trabajadores){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            trabajadores.setModel(aModel);
            M_Trabajador p = new M_Trabajador(null, null, null, null, 0, null, null, 0, null, 0);
            ObjectSet rs = Conexion.getInstancia().buscar(p);

            // si hay trabajadores
            if(rs.size() >0){
                trabajadores.setEnabled(true);                
                
                while(rs.hasNext() ){
                    M_Trabajador modelo = (M_Trabajador)rs.next();
                    if( !( (modelo instanceof M_Estilista) || (modelo instanceof M_Veterinario) ) ){                    
                        aux = modelo.toString();
                        aModel.addElement(aux);    
                    } 
                }
            } else trabajadores.setEnabled(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Trabajador->CargarTrabajadores: "+e);
        }
    }
    
    public void cargarTrabajador(JComboBox trabajadores){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux = null;
            M_Trabajador modelo = null;
            trabajadores.setModel(aModel);
            M_Trabajador t = new M_Trabajador(null, null, null, null, 0, null, null, 0, null, 0);
            ObjectSet rs2 = Conexion.getInstancia().buscar(t);

            if(rs2.size() >0){
                trabajadores.setEnabled(true);
                while(rs2.hasNext() ){
                    modelo = ((M_Trabajador)rs2.next());
                    if (modelo instanceof M_Veterinario){
                        aux = modelo.toString();
                        aModel.addElement(aux);
                    }else if (modelo instanceof M_Estilista){
                        aux = modelo.toString();
                        aModel.addElement(aux);
                    }
                }
            } else trabajadores.setEnabled(false);

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Trabajador->CargarVetEst: "+e);
        }
    }
    
}
