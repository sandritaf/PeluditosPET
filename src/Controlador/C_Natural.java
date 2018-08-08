package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

public class C_Natural {
    
    public C_Natural(){
    }
    
    public void guardarNatural(M_Natural natural){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        natural.setCedula("V"+natural.getCedula());
        bd.store(natural);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        c.cerrarConexion();
    }
    
    public void eliminarNatural(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
        ObjectSet result = bd.queryByExample(natural);
        M_Natural encontrado = (M_Natural) result.next();
        bd.delete(encontrado);
        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del propietario");
        c.cerrarConexion();
    }
    
    public void modificarNatural(String cedula, M_Natural n){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
        ObjectSet result = bd.queryByExample(natural);
        M_Natural encontrado = (M_Natural) result.next();

        encontrado.setPrimerNombre(n.getPrimerNombre());
        encontrado.setSegundoNombre(n.getSegundoNombre());
        encontrado.setPrimerApellido(n.getPrimerApellido());
        encontrado.setSegundoApellido(n.getSegundoApellido());
        encontrado.setCedula(n.getCedula()); //?????
        encontrado.setEdad(n.getEdad());
        encontrado.setDireccion(n.getDireccion());
        encontrado.setTelefono(n.getTelefono());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al cliente natural" );

        c.cerrarConexion();
    }
    
    public void verNatural(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
        ObjectSet resultado = bd.queryByExample(natural);
        JOptionPane.showMessageDialog(null, resultado.next());
        c.cerrarConexion();
    }
    
    public void listarNaturales(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, null);
        ObjectSet resultado = bd.queryByExample(natural);
        System.out.println("Tengo " + resultado.size() + " personas naturales");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
//    public void eliminarNatural(String cedula){
//        Conexion c = new Conexion();
//        ObjectContainer bd = c.getObjectContainer();
//        
//        M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
//        ObjectSet resultado = bd.queryByExample(natural);
//        M_Natural encontrado = (M_Natural) resultado.next();
//        bd.delete(encontrado);
//        System.out.println("Eliminado: " + encontrado);
//        
//        JOptionPane.showMessageDialog(null,"Eliminado cliente natural exitosamente");
//        c.cerrarConexion();
//    }
}
