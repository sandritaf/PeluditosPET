
package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

public class C_Juridico {
   
    public C_Juridico(){
    }
    
    public void guardarJuridico(M_Juridico juridico){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        bd.store(juridico);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del propietario");
        c.cerrarConexion();
    }
    
    public void modificarJuridico(String pk, M_Juridico j){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Propietario juridico = new M_Juridico(pk, null, null, null, null, null, null);
        ObjectSet result = bd.queryByExample(juridico);
        M_Juridico encontrado = (M_Juridico) result.next();

        encontrado.setNombre(j.getNombre());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el registro" );

        c.cerrarConexion();
    }
    
    public void verJuridico(String pk){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario juridico = new M_Juridico(pk, null, null, null, null, null, null);
        ObjectSet resultado = bd.queryByExample(juridico);
        JOptionPane.showMessageDialog(null, resultado.next());
        c.cerrarConexion();
    }
    
    public void listarJuridicos(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario juridico = new M_Juridico(null, null, null, null, null, null, null);
        ObjectSet resultado = bd.queryByExample(juridico);
        System.out.println("Tengo " + resultado.size() + " personas juridicas");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
    public void eliminarNatural(String rif){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Propietario busqueda = new M_Juridico(null, null, null, null, null, rif, null);
        ObjectSet resultado = bd.queryByExample(busqueda);
        M_Juridico encontrado = (M_Juridico) resultado.next();
        bd.delete(encontrado);
        System.out.println("Eliminado: " + encontrado);
        
        JOptionPane.showMessageDialog(null,"Eliminado cliente natural exitosamente");
        c.cerrarConexion();
    }
    
}
