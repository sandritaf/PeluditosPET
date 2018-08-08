
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
        
//        String rif = juridico.getRIF();
//        
//        if(idExiste(rif)){
//            JOptionPane.showMessageDialog(null, "El rif ingresado ya existe en la base de datos. Intente con uno distinto");
//        }
//        else{
            Conexion c = new Conexion();
            ObjectContainer bd = c.getObjectContainer();
            juridico.setRIF("J"+juridico.getRIF());
            bd.store(juridico);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del propietario");
            c.cerrarConexion();
//        }
        
    }
    
    public void eliminarJuridico(String rif){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Juridico juridico = new M_Juridico(null, null, null, null, rif, null);
        ObjectSet resultado = bd.queryByExample(juridico);
        M_Juridico encontrado = (M_Juridico) resultado.next();
        bd.delete(encontrado);
        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del propietario "+ encontrado.getNombre() + " RIF: "+encontrado.getRIF());
        c.cerrarConexion();
    }
    
    public void modificarJuridico(String rif, M_Juridico j){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
        ObjectSet result = bd.queryByExample(juridico);
        M_Juridico encontrado = (M_Juridico) result.next();

        encontrado.setNombre(j.getNombre());
        encontrado.setNombreGerente(j.getNombreGerente());
        encontrado.setTelefono(j.getTelefono());
        encontrado.setRazonSocial(j.getRazonSocial());
        encontrado.setRIF(j.getRIF());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el registro" );

        c.cerrarConexion();
    }
    
    public void verJuridico(String rif){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
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
    
    public boolean idExiste(String rif){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
        ObjectSet resultado = bd.queryByExample(juridico);
        if(!resultado.next().equals(""))
            return true;
        c.cerrarConexion();
        return false;
    }
    
}
