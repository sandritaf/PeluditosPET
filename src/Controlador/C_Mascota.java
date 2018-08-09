
package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class C_Mascota {


    public void guardarMascota(M_Mascota mascota){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        bd.store(mascota);
        JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        c.cerrarConexion();
    }
    
    public void eliminarMascota(String pk){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Mascota mascota = new M_Mascota(pk, null, null, null, 0, null);
        ObjectSet result = bd.queryByExample(mascota);
        
        M_Mascota encontrado = (M_Mascota) result.next();
        bd.delete(encontrado);
        
        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del animal");
        c.cerrarConexion();
    }
    
    public void modificarMascota(String id, M_Mascota m){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
        ObjectSet result = bd.queryByExample(mascota);
        M_Mascota encontrado = (M_Mascota) result.next();

        encontrado.setNombre(m.getNombre());
        encontrado.setEspecie(m.getEspecie());
        encontrado.setRaza(m.getRaza());
        encontrado.setObservaciones(m.getObservaciones());
        encontrado.setEdad(m.getEdad());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el registro" );

        c.cerrarConexion();
    }
    
    public void verMascota(String id, M_Propietario p){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
        ObjectSet resultado = bd.queryByExample(mascota);
        JOptionPane.showMessageDialog(null, resultado.next());
        c.cerrarConexion();
    }
    
    public void listarMascotas(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Mascota m = new M_Mascota(null, null, null, null, 0, null);
        ObjectSet resultado = bd.queryByExample(m);
        System.out.println("Tengo " + resultado.size() + " mascotas");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
    public void cargarDuenos(JComboBox duenos/*, String opc*/){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        DefaultComboBoxModel aModel = new DefaultComboBoxModel();
        //M_Propietario p = null;
        //M_Propietario p1 = null;
        String aux;
        
        duenos.setModel(aModel);

    //    if(opc.equals("Natural")){
        M_Propietario p = new M_Natural(null, null, null, null, null, null, null, null);
    //    }
    //    if (opc.equals("Juridico"))
    //    {
        M_Propietario p1 = new M_Juridico(null, null, null, null, null, null);
    //    }    

        ObjectSet rs = bd.queryByExample(p);
        ObjectSet rs1 = bd.queryByExample(p1);
        
        // si hay propietarios naturales
        if(rs.size() >0){
            while(rs.hasNext() ){
                aux = rs.next().toString();
                aModel.addElement(aux);
            }
        }
        // si hay propietarios juridicos
        if(rs1.size() > 0){ 
            while(rs1.hasNext() ){
               aux = rs1.next().toString();
               aModel.addElement(aux);
            }
        }
        c.cerrarConexion();
    }
    
    public boolean idExiste(String id){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
        ObjectSet resultado = bd.queryByExample(mascota);
        if(!resultado.next().equals(""))
            return true;
        c.cerrarConexion();
        return false;
    }
    
}
