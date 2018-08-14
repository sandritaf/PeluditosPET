package Controlador;

import Conexion.Conexion;
import Modelo.M_Veterinario;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Veterinario {

    public C_Veterinario(){
    }
    
    public void guardarVeterinario(M_Veterinario veterinario){
        try{
            veterinario.setCedula("V"+veterinario.getCedula());
            Conexion.getInstancia().guardar(veterinario);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del veterinario");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarVeterinario(String cedula){
       try{
            M_Veterinario veterinario = new M_Veterinario(null, null, null, null, cedula, null, 0, null, null, 0, null, 0);
            ObjectSet result = Conexion.getInstancia().buscar(veterinario);
            M_Veterinario encontrado = (M_Veterinario) result.next();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del veterinario");
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarVeterinario(String cedulaVieja, String cedula, M_Veterinario v){
        try{        
            M_Veterinario veterinario = new M_Veterinario(null, null, null, null, cedulaVieja, null, 0, null, null, 0, null, 0);
            ObjectSet result = Conexion.getInstancia().buscar(veterinario);
            M_Veterinario encontrado = (M_Veterinario) result.next();

            encontrado.setNombre(v.getNombre());
            encontrado.setApellido(v.getApellido());
            encontrado.setCedula(cedula);
            encontrado.setEdad(v.getEdad());
            encontrado.setAniosExperiencia(v.getAniosExperiencia());
            encontrado.setUniversidad(v.getUniversidad());
            encontrado.setEspecializacion(v.getEspecializacion());
            encontrado.setProfesion(v.getProfesion());
            encontrado.setNivelInstruccion(v.getNivelInstruccion());
            encontrado.setRIF(v.getRIF());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al veterinario" );

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /*public void verVeterinario(String cedula){
        try{
            M_Veterinario veterinario = new M_Veterinario(null, null, null, null, cedula, null, 0, null, null, 0, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(veterinario);
            JOptionPane.showMessageDialog(null, resultado.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }*/
    
    public M_Veterinario[] getVeterinarios(){
        try {
            M_Veterinario[] personas = null;
            M_Veterinario veterinario = new M_Veterinario(null, null, null, null, null, null, 0, null, null, 0, null, 0);
            ObjectSet resultados = Conexion.getInstancia().buscar(veterinario);
            int i = 0;
            if (resultados.hasNext()) {
                personas = new M_Veterinario[resultados.size()];
                while (resultados.hasNext()) {
                    personas[i] = (M_Veterinario) resultados.next();
                    i++;
                }
            }
            return personas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Veterinario->getVeterinarios: "+e);
            return null;
        }
    }
    
    
    public void listarVeterinarios(){
        try{
            M_Veterinario veterinario = new M_Veterinario(null, null, null, null, null, null, 0, null, null, 0, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(veterinario);
            System.out.println("Tengo " + resultado.size() + " veterinarios");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"Cedula","Nombre","Apellido","Teléfono","Profesion","Egresado de"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Veterinario[] p = getVeterinarios();
            if (p != null) {
                for (M_Veterinario per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getCedula();// subString(1); ??
                    cli[1] = per.getNombre();
                    cli[2] = per.getApellido();
                    cli[3] = per.getTelefono();
                    cli[4] = per.getProfesion();
                    cli[5] = per.getUniversidad();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public M_Veterinario getPersona(String cedula){
        try{
    //        M_Veterinario veterinario = new M_Veterinario(null, null, null, null, "V"+cedula, null, 0, null, null, 0, null, 0);
            M_Veterinario veterinario = new M_Veterinario(null, null, null, null, cedula, null, 0, null, null, 0, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(veterinario);
            if (resultado.isEmpty())
                return null;
            M_Veterinario encontrado = (M_Veterinario) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }
    
}
