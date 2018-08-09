/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Modelo.M_Trabajador;
import Modelo.M_Veterinario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ecastillo
 */
public class C_Trabajador {
    
    public C_Trabajador(){
    }
    
    public void guardarTrabajador(M_Trabajador trabajador){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        trabajador.setCedula("V"+trabajador.getCedula());
        bd.store(trabajador);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del trabajador");
        c.cerrarConexion();
    }
    
    public void eliminarTrabajador(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0);
        ObjectSet result = bd.queryByExample(trabajador);
        M_Veterinario encontrado = (M_Veterinario) result.next();
        bd.delete(encontrado);
        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del trabajador");
        c.cerrarConexion();
    }
    
    public void modificarTrabajador(String cedula, M_Trabajador t){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0);
        ObjectSet result = bd.queryByExample(trabajador);
        M_Veterinario encontrado = (M_Veterinario) result.next();

        encontrado.setNombre(t.getNombre());
        encontrado.setApellido(t.getApellido());
        encontrado.setCedula(t.getCedula());
        encontrado.setEdad(t.getEdad());
        encontrado.setAnosExperiencia(t.getAnosExperiencia());
        encontrado.setProfesion(t.getProfesion());
        encontrado.setNivelInstruccion(t.getNivelInstruccion());
        encontrado.setRIF(t.getRIF());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al trabajador");

        c.cerrarConexion();
    }
    
    public void verTrabajador(String cedula){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0);
        ObjectSet resultado = bd.queryByExample(trabajador);
        JOptionPane.showMessageDialog(null, resultado.next());
        c.cerrarConexion();
    }
    
    public void listarTrabajadores(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Trabajador trabajador = new M_Trabajador(null, null, null, null, 0, null, null, 0);
        ObjectSet resultado = bd.queryByExample(trabajador);
        System.out.println("Tengo " + resultado.size() + " trabajadores");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
}
