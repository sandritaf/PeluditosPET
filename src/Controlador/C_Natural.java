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
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        natural.setCedula("V"+natural.getCedula());
        bd.store(natural);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del propietario");
        c.cerrarConexion();
    }
    
    public void eliminarNatural(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario natural = new M_Natural(null, null, null, null, null, cedula);
        ObjectSet result = bd.queryByExample(natural);
        M_Natural encontrado = (M_Natural) result.next();
        bd.delete(encontrado);
        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del propietario");
        c.cerrarConexion();
    }
    
    public void modificarNatural(String cedula, M_Natural n){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Propietario natural = new M_Natural(null, null, null, null, null, cedula);
        ObjectSet result = bd.queryByExample(natural);
        M_Natural encontrado = (M_Natural) result.next();

        encontrado.setNombre(n.getNombre());
        encontrado.setApellido(n.getApellido());
        encontrado.setCedula(n.getCedula());
        encontrado.setEdad(n.getEdad());
        encontrado.setDireccion(n.getDireccion());
        encontrado.setTelefono(n.getTelefono());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente propietario" );

        c.cerrarConexion();
    }
    
    public void verNatural(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario natural = new M_Natural(null, null, null, null, null, cedula);
        ObjectSet resultado = bd.queryByExample(natural);
        JOptionPane.showMessageDialog(null, resultado.next());
        c.cerrarConexion();
    }
    
    public void listarNaturales(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario natural = new M_Natural(null, null, null, null, null, null);
        ObjectSet resultado = bd.queryByExample(natural);
        System.out.println("Tengo " + resultado.size() + " personas naturales");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
    public void agregarMascota(M_Mascota mascotica, M_Natural n, String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Propietario natural = new M_Natural(null, null, null, null, null, cedula);
        ObjectSet result = bd.queryByExample(natural);
        M_Natural encontrado = (M_Natural) result.next();

        encontrado.setNombre(n.getNombre());
        encontrado.setApellido(n.getApellido());
        encontrado.setCedula(n.getCedula()); //?????
        encontrado.setEdad(n.getEdad());
        encontrado.setDireccion(n.getDireccion());
        encontrado.setTelefono(n.getTelefono());
        encontrado.setMascoticas(mascotica);

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha añadido la mascota al cliente natural" );

        c.cerrarConexion();
    }
    
}
