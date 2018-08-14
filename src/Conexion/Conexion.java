
package Conexion;

import Modelo.M_Especie;
import Modelo.M_Mascota;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Constraint;
import com.db4o.query.Query;

public class Conexion {
    
    private static Conexion modelo;
    
    private String direccionSandra = "C:\\Users\\brenda\\Desktop\\PeluditosPET\\peluditospet.yap";
    private String direccionSandra2 = "C:\\Users\\brenda\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditospet.db4o";
    private String direccionGenova = "C:\\Users\\Ecastillo\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditospet.db4o";
    private ObjectContainer bd;
    
    public Conexion(){
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        bd = Db4oEmbedded.openFile(config,direccionSandra2);
//        bd = Db4oEmbedded.openFile(direccionSandra2);
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
    
    public void soda(String a){
        Query query = bd.query();
        query.constrain(M_Especie.class);
        query.descend("nombre").constrain(a);
        ObjectSet result = query.execute();
        ((M_Especie)result.next()).imprimir();
    }
    
}
