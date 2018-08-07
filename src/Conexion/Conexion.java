
package Conexion;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Conexion {
    
    public ObjectContainer bd;
    
    public Conexion(){
        String direccion = "C:\\Users\\brenda\\Desktop\\PeluditosPET\\peluditospet.yap";
        bd = Db4oEmbedded.openFile(direccion);
    }
    
    public void cerrarConexion(){
        bd.close();
    }
    
    public ObjectContainer getObjectContainer(){
        return bd;
    }
    
    
}
