
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
    
    public void eliminarMascota(String nombre, M_Propietario p){
//        Conexion c = new Conexion();
//        ObjectContainer bd = c.getObjectContainer();
//        
//        M_Propietario prop = 
//        
//        ObjectSet result = bd.queryByExample(mascota);
//        
//        JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del animal");
//        c.cerrarConexion();
    }
    
    public void modificarMascota(String nombre, M_Mascota m, M_Propietario p){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        
        M_Mascota mascota = new M_Mascota(nombre, null, null, 0, null, p);
        ObjectSet result = bd.queryByExample(mascota);
        M_Mascota encontrado = (M_Mascota) result.next();

        encontrado.setNombre(m.getNombre());
        encontrado.setEspecie(m.getEspecie());
        encontrado.setRaza(m.getRaza());
        encontrado.setObservaciones(m.getObservaciones());
        encontrado.setEdad(m.getEdad());
        encontrado.setDueno(m.getDueno());

        bd.store(encontrado);

        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el registro" );

        c.cerrarConexion();
    }
    
    public void verMascota(String nombre, M_Propietario p){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Mascota mascota = new M_Mascota(nombre, null, null, 0, null, p);
        ObjectSet resultado = bd.queryByExample(mascota);
        JOptionPane.showMessageDialog(null, resultado.next());
        c.cerrarConexion();
    }
    
    public void listarMascotas(){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        M_Mascota m = new M_Mascota(null, null, null, 0, null, null);
        ObjectSet resultado = bd.queryByExample(m);
        System.out.println("Tengo " + resultado.size() + " mascotas");
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        c.cerrarConexion();
    }
    
    public void cargarDuenos(JComboBox duenos, String opc){
        Conexion c = new Conexion();
        ObjectContainer bd = c.getObjectContainer();
        DefaultComboBoxModel aModel = new DefaultComboBoxModel();
        M_Propietario p = null;
        M_Propietario p1 = null;
        String aux;
        
        duenos.setModel(aModel);

    //    if(opc.equals("Natural")){
            p = new M_Natural(null, null, null, null, null);
    //    }
    //    if (opc.equals("Juridico"))
    //    {
            p1 = new M_Juridico(null, null, null, null, null, null, null);
    //    }    

        ObjectSet rs = bd.queryByExample(p);
        ObjectSet rs1 = bd.queryByExample(p1);

        while(rs.hasNext() ){
           aux = rs.next().toString();
           aModel.addElement(aux);
        }
        while(rs1.hasNext() ){
           aux = rs1.next().toString();
           aModel.addElement(aux);
        }
        
        c.cerrarConexion();
    }
    
    
}
