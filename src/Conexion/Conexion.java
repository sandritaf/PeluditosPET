
package Conexion;

import Modelo.M_Propietario;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;

public class Conexion {
    
    public ObjectContainer bd;
    String direccionSandra = "C:\\Users\\brenda\\Desktop\\PeluditosPET\\peluditospet.yap";
    String direccionGenova = "C:\\Users\\Ecastillo\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditospet.yap";
    
    public Conexion(){
//        EmbeddedConfiguration configuration = Db4oEmbedded.newConfiguration();
//        configuration.common().objectClass(M_Propietario.class).updateDepth(3);
//        bd = Db4oEmbedded.openFile(configuration,direccionSandra);
        bd = Db4oEmbedded.openFile(direccionSandra);
    }    
        
    public void cerrarConexion(){
        bd.close();
    }
    
    public ObjectContainer getObjectContainer(){
        return bd;
    }
    
    
    
    
    
}
