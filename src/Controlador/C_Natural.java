package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Natural;
import Modelo.M_Mascota;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

public class C_Natural {
    
    public C_Natural(){
    }
    
    public void guardarNatural(M_Natural natural){
        try{
            natural.setCedula("V"+natural.getCedula());
            Conexion.getInstancia().guardar(natural);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del cliente natural");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarNatural(String cedula){
        try{
            M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del cliente natural");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarNatural(String cedula, M_Natural n){
        try{
            M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();

            encontrado.setPrimerNombre(n.getPrimerNombre());
            encontrado.setSegundoNombre(n.getSegundoNombre());
            encontrado.setPrimerApellido(n.getPrimerApellido());
            encontrado.setSegundoApellido(n.getSegundoApellido());
            encontrado.setCedula(n.getCedula()); 
            encontrado.setEdad(n.getEdad());
            encontrado.setDireccion(n.getDireccion());
            encontrado.setTelefono(n.getTelefono());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al cliente natural" );

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void verNatural(String cedula){
        try{
            M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
            ObjectSet resultado = Conexion.getInstancia().buscar(natural);
            JOptionPane.showMessageDialog(null, resultado.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void listarNaturales(){
        try{
            M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(natural);
            System.out.println("Tengo " + resultado.size() + " personas naturales");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void agregarMascota(M_Mascota mascotica, M_Natural n, String cedula){
        try{        
            M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();

            encontrado.setPrimerNombre(n.getPrimerNombre());
            encontrado.setSegundoNombre(n.getSegundoNombre());
            encontrado.setPrimerApellido(n.getPrimerApellido());
            encontrado.setSegundoApellido(n.getSegundoApellido());
            encontrado.setCedula(n.getCedula()); //?????
            encontrado.setEdad(n.getEdad());
            encontrado.setDireccion(n.getDireccion());
            encontrado.setTelefono(n.getTelefono());
            encontrado.setMascoticas(mascotica);

            Conexion.getInstancia().guardar(encontrado);
            JOptionPane.showMessageDialog(null, "Se ha añadido la mascota al cliente natural" );

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
