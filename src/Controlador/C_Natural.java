/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public void guardarJuridico(M_Juridico juridico){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        bd.store(juridico);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        c.cerrarConexion();
    }
    
    public void modificarJuridico(String cedula, M_Natural n){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Propietario natural = new M_Natural(null, null, null, null, null, null, null, cedula);
        ObjectSet result = bd.queryByExample(natural);
        M_Natural encontrado = (M_Natural) result.next();

        encontrado.setPrimerNombre(n.getPrimerNombre());
        encontrado.setSegundoNombre(n.getSegundoNombre());
        encontrado.setPrimerApellido(n.getPrimerApellido());
        encontrado.setSegundoApellido(n.getSegundoApellido());
        encontrado.setCedula(n.getCedula());
        encontrado.setEdad(n.getEdad());
        encontrado.setDireccion(n.getDireccion());
        encontrado.setTelefono(n.getTelefono());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el registro" );

        c.cerrarConexion();
    }
    
    public void verJuridico(String cedula){
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
    
}
