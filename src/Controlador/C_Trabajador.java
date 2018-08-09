
package Controlador;

import Conexion.Conexion;
import Modelo.M_Trabajador;
import Modelo.M_Veterinario;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

public class C_Trabajador {
    
    public C_Trabajador(){
    }
    
    public void guardarTrabajador(M_Trabajador trabajador){
        try{
            trabajador.setCedula("V"+trabajador.getCedula());
            Conexion.getInstancia().guardar(trabajador);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del trabajador");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarTrabajador(String cedula){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(trabajador);
            M_Veterinario encontrado = (M_Veterinario) result.next();
            Conexion.getInstancia().guardar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del trabajador");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarTrabajador(String cedula, M_Trabajador t){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(trabajador);
            M_Veterinario encontrado = (M_Veterinario) result.next();

            encontrado.setNombre(t.getNombre());
            encontrado.setApellido(t.getApellido());
            encontrado.setCedula(t.getCedula());
            encontrado.setEdad(t.getEdad());
            encontrado.setAnosExperiencia(t.getAnosExperiencia());
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
            M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(trabajador);
            JOptionPane.showMessageDialog(null, resultado.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void listarTrabajadores(){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, null, null, 0, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(trabajador);
            System.out.println("Tengo " + resultado.size() + " trabajadores");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
