
package Controlador;

import Conexion.Conexion;
import Modelo.M_Estilista;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Estilista {
 
    public void guardarEstilista(M_Estilista estilista, String tipo){
        try{
            estilista.setCedula(tipo+estilista.getCedula());
            Conexion.getInstancia().guardar(estilista);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del estilista");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarEstilista(String cedula){
        try{
            M_Estilista estilista = new M_Estilista(null, null, cedula, null, 0, null, null, 0, null, 0, false);
            ObjectSet result = Conexion.getInstancia().buscar(estilista);
            M_Estilista encontrado = (M_Estilista) result.next();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del estilistas");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarEstilista(String cedulaVieja, String cedula, M_Estilista e){
        try{
            M_Estilista estilista = new M_Estilista(null, null, cedulaVieja, null, 0, null, null, 0, null, 0, false);
            ObjectSet result = Conexion.getInstancia().buscar(estilista);
            M_Estilista encontrado = (M_Estilista) result.next();

            encontrado.setNombre(e.getNombre());
            encontrado.setApellido(e.getApellido());
            encontrado.setCedula(cedula);
            encontrado.setTelefono(e.getTelefono());
            encontrado.setNivelInstruccion(e.getNivelInstruccion());
            encontrado.setProfesion(e.getProfesion());
            encontrado.setEdad(e.getEdad());
            encontrado.setAniosExperiencia(e.getAniosExperiencia());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al estilista" );

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    public void listarEstilistas(){
       try{
            M_Estilista estilista = new M_Estilista(null, null, null, null, 0, null, null, 0, null, 0, false);
            ObjectSet resultado = Conexion.getInstancia().buscar(estilista);
            System.out.println("Tengo " + resultado.size() + " estilistas");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    
    public M_Estilista[] getEstilistas(){
        try {
            M_Estilista[] personas = null;
            M_Estilista estilista = new M_Estilista(null, null, null, null, 0, null, null, 0, null, 0, false);
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
            String titulos[] = {"Cédula", "Nombre","Apellido","Teléfono"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Estilista[] p = getEstilistas();
            if (p != null) {
                for (M_Estilista per : p) {
                    Object[] cli = new Object[4];
                    cli[0] = per.getCedula();
                    cli[1] = per.getNombre();
                    cli[2] = per.getApellido();
                    cli[3] = per.getTelefono();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public M_Estilista getPersona(String cedula){
        try{
            M_Estilista estilista = new M_Estilista(null, null, cedula, null, 0, null, null, 0, null, 0, false);
            ObjectSet resultado = Conexion.getInstancia().buscar(estilista);
            if (resultado.isEmpty())
                return null;
            M_Estilista encontrado = (M_Estilista) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }
}
