
package Controlador;

import Conexion.Conexion;
import Modelo.M_Servicio;
import Modelo.M_Trabajador;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Servicio {

    public C_Servicio() {
    }

    public void guardarServicio(M_Servicio servicio){
          try{
                String nombre = servicio.getNombre().toLowerCase();
                servicio.setNombre(nombre);
//              juridico.setRIF("J"+juridico.getRIF());
              Conexion.getInstancia().guardar(servicio);
              JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del cliente jurídico");
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "error en C_Servicio->guardarServicio: "+e);
          }
        
    }
    
    public void eliminarServicio(String nombre){
        try{
            M_Servicio servicio = new M_Servicio(nombre, null, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(servicio);
            M_Servicio encontrado = (M_Servicio) resultado.next();
            
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del servicio");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en C_Servicio->eliminarServicio: "+e);
        }
    }
    
    public void modificarServicio(String nombre, String viejoNombre, M_Servicio s){
        try{    
            
            viejoNombre = viejoNombre.toLowerCase();
            nombre = nombre.toLowerCase();
            
            M_Servicio servicio = new M_Servicio(viejoNombre, null, null, 0);
            
            ObjectSet result = Conexion.getInstancia().buscar(servicio);
            if (!result.isEmpty()){
                M_Servicio encontrado = (M_Servicio) result.next();

                encontrado.setNombre(nombre);
                encontrado.setDescripción(s.getDescripción());
                encontrado.setObservaciones(s.getObservaciones());
                encontrado.setPrecio(s.getPrecio());
                
                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el servicio" );
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en C_Servicio->modificarServicio: "+e);
        }
    }
    
    public void cargarServicios(JComboBox servicios){
        try{
            M_Servicio p = new M_Servicio(null, null, null, 0);
            ObjectSet rs = Conexion.getInstancia().buscar(p);
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            if(rs.size() >0){ 
                servicios.setEnabled(true);
                String aux = null;
                servicios.setModel(aModel);
                // si hay servicios
                while(rs.hasNext()){
                    aux = ((M_Servicio)rs.next()).getNombre();
                    aModel.addElement(aux);
                }
            }
            else servicios.setEnabled(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Servicio->CargarServicios: "+e);
        }
    }
    
    public M_Servicio getServicio(String nombre){
        try{
            M_Servicio servicio = new M_Servicio(nombre, null, null, 0);
            ObjectSet resultado = Conexion.getInstancia().buscar(servicio);
            if (resultado.isEmpty())
                return null;
            M_Servicio encontrado = (M_Servicio) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }
    
    public M_Servicio[] getServicios(){
        try {
            M_Servicio[] servicios = null;
            M_Servicio servicio = new M_Servicio(null, null, null, 0);
            ObjectSet resultados = Conexion.getInstancia().buscar(servicio);
            int i = 0;
            if (resultados.hasNext()) {
                servicios = new M_Servicio[resultados.size()];
                while (resultados.hasNext()) {
                    servicios[i] = (M_Servicio) resultados.next();
                    i++;
                }
            }
            return servicios;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Servicio->getServicios: "+e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"Nombre","Precio","Descripción"};//,"RIF", "Profesión"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Servicio[] p = getServicios();
            if (p != null) {
                for (M_Servicio per : p) {
                    Object[] cli = new Object[3];
                    cli[0] = per.getNombre();
                    cli[1] = per.getPrecio();
                    cli[2] = per.getDescripción();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Servicio->cargarTabla: "+e);
            return null;
        }
    }
    
    
}
