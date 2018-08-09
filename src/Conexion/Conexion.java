
package Conexion;

import Modelo.M_Propietario;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;

public class Conexion {
    
    private static Conexion modelo;
    private String direccionSandra = "C:\\Users\\brenda\\Desktop\\PeluditosPET\\peluditospet.yap";
    private String direccionGenova = "C:\\Users\\Ecastillo\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditospet.yap";
    public ObjectContainer bd;
    
    public Conexion(){
        bd = Db4oEmbedded.openFile(direccionGenova);
    }
        
    public void cerrarConexion(){
        bd.close();
    }
    
    public void guardar(Object e){
        bd.store(e);
    }
    
    public ObjectContainer getObjectContainer(){
        return bd;
    }
    
    public static Conexion getInstancia(){
        if(modelo == null)
            modelo = new Conexion();

        return modelo;
    }
    
    public ObjectSet buscar(Object e){
        return bd.queryByExample(e);
    }
    
    public void eliminar (Object e){
        bd.delete(e);
    }
    
}
