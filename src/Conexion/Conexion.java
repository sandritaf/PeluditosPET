
package Conexion;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Conexion {
    
    public ObjectContainer bd;
    String direccionSandra = "C:\\Users\\brenda\\Desktop\\PeluditosPET\\peluditospet.yap";
    String direccionGenova = "C:\\Users\\Ecastillo\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditospet.yap";
    
    public Conexion(){
        bd = Db4oEmbedded.openFile(direccionGenova);
    }
    
    public void cerrarConexion(){
        bd.close();
    }
    
    public ObjectContainer getObjectContainer(){
        return bd;
    }
    
    
}
