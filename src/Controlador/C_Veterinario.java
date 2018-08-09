package Controlador;

import Conexion.Conexion;
import Modelo.M_Natural;
import Modelo.M_Veterinario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

public class C_Veterinario {

    public C_Veterinario(){
    }
    
    public void guardarVeterinario(M_Veterinario veterinario){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        veterinario.setCedula("V"+veterinario.getCedula());
        bd.store(veterinario);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        c.cerrarConexion();
    }
    
    public void eliminarVeterinario(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Veterinario veterinario = new M_Veterinario(null, null, null, null, cedula, null, 0, null, null, 0, null);
        ObjectSet result = bd.queryByExample(veterinario);
        M_Veterinario encontrado = (M_Veterinario) result.next();
        bd.delete(encontrado);
        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del veterinario");
        c.cerrarConexion();
    }
    
    public void modificarVeterinario(String cedula, M_Veterinario v){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Veterinario veterinario = new M_Veterinario(null, null, null, null, cedula, null, 0, null, null, 0, null);
        ObjectSet result = bd.queryByExample(veterinario);
        M_Veterinario encontrado = (M_Veterinario) result.next();

        encontrado.setNombre(v.getNombre());
        encontrado.setApellido(v.getApellido());
        encontrado.setCedula(v.getCedula()); //?????
        encontrado.setEdad(v.getEdad());
        encontrado.setAnosExperiencia(v.getAnosExperiencia());
        encontrado.setUniversidad(v.getUniversidad());
        encontrado.setEspecializacion(v.getEspecializacion());
        encontrado.setProfesion(v.getProfesion());
        encontrado.setNivelInstruccion(v.getNivelInstruccion());
        encontrado.setRIF(v.getRIF());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al cliente natural" );

        c.cerrarConexion();
    }
    
    public void verVeterinario(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Veterinario veterinario = new M_Veterinario(null, null, null, null, cedula, null, 0, null, null, 0, null);
        ObjectSet resultado = bd.queryByExample(veterinario);
        JOptionPane.showMessageDialog(null, resultado.next());
        c.cerrarConexion();
    }
    
    public void listarVeterinarios(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Veterinario veterinario = new M_Veterinario(null, null, null, null, null, null, 0, null, null, 0, null);
        ObjectSet resultado = bd.queryByExample(veterinario);
        System.out.println("Tengo " + resultado.size() + " veterinarios");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
}
