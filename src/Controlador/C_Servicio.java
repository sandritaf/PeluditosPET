
package Controlador;

import Conexion.Conexion;
import Modelo.M_Servicio;
import com.db4o.ObjectSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class C_Servicio {

    public C_Servicio() {
    }

    public void guardarServicio(M_Servicio servicio){
          try{
              servicio.getNombre().toLowerCase();
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
    
    public void modificarServicio(String nombre, M_Servicio s){
        try{    
            nombre.toLowerCase();
            M_Servicio servicio = new M_Servicio(nombre, null, null,0);
            
            ObjectSet result = Conexion.getInstancia().buscar(servicio);
            if (!result.isEmpty()){
                M_Servicio encontrado = (M_Servicio) result.next();

                encontrado.setNombre(s.getNombre().toLowerCase());
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
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            servicios.setModel(aModel);
            M_Servicio p = new M_Servicio(null, null, null, 0);
            ObjectSet rs = Conexion.getInstancia().buscar(p);

            // si hay propietarios naturales
            if(rs.size() >0){
                while(rs.hasNext() ){
                    aux = ((M_Servicio)rs.next()).getNombre();
                    aModel.addElement(aux);
                }
            }
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

    
}
