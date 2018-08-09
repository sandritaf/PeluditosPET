
package Controlador;

import Conexion.Conexion;
import Modelo.M_Estilista;
import Modelo.M_Veterinario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Estilista {
 
    public void guardarEstilista(M_Estilista estilista){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        estilista.setCedula("V"+estilista.getCedula());
        bd.store(estilista);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del estilista");
        c.cerrarConexion();
    }
    
    public void eliminarEstilista(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Estilista estilista = new M_Estilista(null, null, cedula, null, 0, null, null, 0, null);
        ObjectSet result = bd.queryByExample(estilista);
        M_Estilista encontrado = (M_Estilista) result.next();
        bd.delete(encontrado);
        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del estilistas");
        c.cerrarConexion();
    }
    
    public void modificarEstilista(String cedula, M_Estilista e){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Estilista estilista = new M_Estilista(null, null, cedula, null, 0, null, null, 0, null);
        ObjectSet result = bd.queryByExample(estilista);
        M_Estilista encontrado = (M_Estilista) result.next();

        encontrado.setNombre(e.getNombre());
        encontrado.setNombre(e.getApellido());
        encontrado.setCedula(e.getCedula());
        encontrado.setTelefono(e.getTelefono());
        encontrado.setNivelInstruccion(e.getNivelInstruccion());
        encontrado.setProfesion(e.getProfesion());
        encontrado.setEdad(e.getEdad());
        encontrado.setAnosExperiencia(e.getAnosExperiencia());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al estilista" );

        c.cerrarConexion();
    }
    
    public void verEstilista(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Estilista estilista = new M_Estilista(null, null, cedula, null, 0, null, null, 0, null);
        ObjectSet result = bd.queryByExample(estilista);
        JOptionPane.showMessageDialog(null, result.next());
        c.cerrarConexion();
    }
    
    public void listarEstilistas(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Estilista estilista = new M_Estilista(null, null, null, null, 0, null, null, 0, null);
        ObjectSet resultado = bd.queryByExample(estilista);
        System.out.println("Tengo " + resultado.size() + " estilistas");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
    public M_Estilista[] getEstilistas(){
        try {
            M_Estilista[] personas = null;
            M_Estilista estilista = new M_Estilista(null, null, null, null, 0, null, null, 0, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(estilista);
            int i = 0;
            if (resultados.hasNext()) {
                personas = new M_Estilista[resultados.size()];
                while (resultados.hasNext()) {
                    personas[i] = (M_Estilista) resultados.next();
                    i++;
                }
            }
            return personas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Estilista->getEstilistas: "+e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"Cedula", "Nombre","Apellido","Teléfono"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Estilista[] p = getEstilistas();
            if (p != null) {
                for (M_Estilista per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getCedula();
                    cli[1] = per.getNombre();
                    cli[2] = per.getApellido();
                    cli[3] = per.getTelefono();
//                    cli[5] = per.getNumMascotas();
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
