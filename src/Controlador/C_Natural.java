package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Natural;
import Modelo.M_Mascota;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del cliente natural");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public M_Natural getPersona(String cedula){
        try{
            M_Natural n = new M_Natural(null, null, null, null, cedula);
            ObjectSet resultado = Conexion.getInstancia().buscar(n);
            if (resultado.isEmpty())
                return null;
            M_Natural encontrado = (M_Natural) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }
    
    public void modificarNatural(String cedula, M_Natural n){
        try{
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();

            encontrado.setNombre(n.getNombre());
            encontrado.setApellido(n.getApellido());
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
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet resultado = Conexion.getInstancia().buscar(natural);
            JOptionPane.showMessageDialog(null, resultado.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void listarNaturales(){
        try{
            M_Propietario natural = new M_Natural(null, null, null, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(natural);
            System.out.println("Tengo " + resultado.size() + " clientes naturales");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void agregarMascota(M_Mascota mascotica, M_Natural n, String cedula){
        try{        
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();

            encontrado.setNombre(n.getNombre());
            encontrado.setApellido(n.getApellido());
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
    
    
    public void eliminarMascota(M_Mascota mascotica, M_Natural n, String cedula){
        try{        
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();
                        
            encontrado.setNombre(n.getNombre());
            encontrado.setApellido(n.getApellido());
            encontrado.setCedula(n.getCedula()); 
            encontrado.setEdad(n.getEdad());
            encontrado.setDireccion(n.getDireccion());
            encontrado.setTelefono(n.getTelefono());
            encontrado.retirarMascota(mascotica);

            Conexion.getInstancia().guardar(encontrado);
            JOptionPane.showMessageDialog(null, "Se ha eliminado la mascota del cliente natural" );

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Natural->eliminarMascota: "+e);
        }
    }
    
    
    public M_Natural[] getNaturales(){
        try {
            M_Natural[] personas = null;
            M_Natural natural = new M_Natural(null, null, null, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(natural);
            int i = 0;
            if (resultados.hasNext()) {
                personas = new M_Natural[resultados.size()];
                while (resultados.hasNext()) {
                    personas[i] = (M_Natural) resultados.next();
                    i++;
                }
            }
            return personas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Natural->getNaturales: "+e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"Cedula", "Nombre","Apellido","Telefono", "Edad","Mascotas registradas"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Natural[] p = getNaturales();
            if (p != null) {
                for (M_Natural per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getCedula();
                    cli[1] = per.getNombre();
                    cli[2] = per.getApellido();
                    cli[3] = per.getTelefono();
                    cli[4] = per.getEdad();
                    cli[5] = per.getNumMascotas();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Natural->cargarTabla: " +e);
            return null;
        }
    }
    
}
