
package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
    public M_Juridico[] getJuridicos(M_Juridico objeto){
        try {
            //CONSULTAMOS LOS OBJETOS ALMACENADOS EN LA BASE DE DATOS Y LOS RETORNAMOS EN UN ARREGLO DE TIPO M_Juridico
            Conexion c = new Conexion();
            ObjectContainer bd = c.getObjectContainer();
            M_Juridico[] personas = null;
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, null, null);
        //    ObjectSet resultados = bd.queryByExample(objeto);
            ObjectSet resultados = bd.queryByExample(juridico);
            int i = 0;
            if (resultados.hasNext()) {
                personas = new M_Juridico[resultados.size()];
                while (resultados.hasNext()) {
                    personas[i] = (M_Juridico) resultados.next();
                    i++;
                }
            }
            c.cerrarConexion();
            return personas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.insertarPersona() : " + e);
            return null;
        }
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
    
    public void agregarMascota(String rif, M_Juridico j, M_Mascota mascotica){
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
        encontrado.setMascoticas(mascotica);

        bd.store(encontrado);
        JOptionPane.showMessageDialog(null, "Se ha añadido la mascota al cliente juridico");
        
        c.cerrarConexion();
    }
    
    public DefaultTableModel cargarTabla() {
        String titulos[] = {"RIF", "Nombre", "Razon Social"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        M_Juridico persona = null;
        M_Juridico[] p = getJuridicos(persona);
        if (p != null) {
            for (M_Juridico per : p) {
                Object[] cli = new Object[3];
                cli[0] = per.getRIF();
                cli[1] = per.getNombre();
                cli[2] = per.getRazonSocial();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }
    
}
