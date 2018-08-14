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
            C_Mascota controladorMascota = new C_Mascota();
            
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            if (!result.isEmpty()){
                M_Natural encontrado = (M_Natural) result.next();
                controladorMascota.recorrerMascotasParaEliminarlas(0,encontrado.getCedula(),encontrado);
                Conexion.getInstancia().eliminar(encontrado);
                JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del cliente natural");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en C_Natural->eliminarNatural()"+ e);
        }
    }
    
    
    public M_Natural getPersona(String cedula){
        try{
            M_Natural n = new M_Natural(null, null, null, null,"V"+ cedula);
            ObjectSet resultado = Conexion.getInstancia().buscar(n);
            if (resultado.isEmpty())
                return null;
            M_Natural encontrado = (M_Natural) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Natural->getPersona():"+e);
            return null;  
        }      
    }
    
    public void modificarNatural(String viejaCedula, String nuevaCedula, M_Natural n){
        try{
            M_Propietario natural = new M_Natural(null, null, null, null, viejaCedula);            
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            
            if (!result.isEmpty()){
                M_Natural encontrado = (M_Natural) result.next();

                encontrado.setNombre(n.getNombre());
                encontrado.setApellido(n.getApellido());
                encontrado.setCedula(nuevaCedula); 
                encontrado.setDireccion(n.getDireccion());
                encontrado.setTelefono(n.getTelefono());

                //Si la cedula se mantiene igual no hay que modificar a la mascota
                if (viejaCedula.compareTo(nuevaCedula)!=0){                     
                    C_Mascota controladorMascota = new C_Mascota();
                    controladorMascota.recorrerMascotasParaModificarDueno(0,viejaCedula,encontrado,nuevaCedula);
                }
                
                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al cliente natural" );
            }

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
    
    public boolean agregarMascota(M_Natural n, String cedula){
        try{        
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            if(!result.isEmpty()){
                M_Natural encontrado = (M_Natural) result.next();

                encontrado.setNombre(n.getNombre());
                encontrado.setApellido(n.getApellido());
                encontrado.setCedula(n.getCedula());
                encontrado.setDireccion(n.getDireccion());
                encontrado.setTelefono(n.getTelefono());
                encontrado.agregarMascota();
                Conexion.getInstancia().guardar(encontrado);
                return true;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error agregando mascota al Cliente Natural: "+e);
        }
        return false;
    }
    
    
    public void eliminarMascota(M_Natural n, String cedula){
        try{        
            M_Propietario natural = new M_Natural(null, null, null, null, cedula);
            ObjectSet result = Conexion.getInstancia().buscar(natural);
            M_Natural encontrado = (M_Natural) result.next();
                        
            encontrado.setNombre(n.getNombre());
            encontrado.setApellido(n.getApellido());
            encontrado.setCedula(n.getCedula()); 
            encontrado.setDireccion(n.getDireccion());
            encontrado.setTelefono(n.getTelefono());
            encontrado.retirarMascota();

            Conexion.getInstancia().guardar(encontrado);

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
            String titulos[] = {"Cedula", "Nombre","Apellido","Telefono","Mascotas"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Natural[] p = getNaturales();
            if (p != null) {
                for (M_Natural per : p) {
                    Object[] cli = new Object[5];
                    cli[0] = per.subString(1);// getCedula();
                    cli[1] = per.getNombre();
                    cli[2] = per.getApellido();
                    cli[3] = per.getTelefono();
                    cli[4] = per.getNumMascotas();
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
