
package Conexion;

import Modelo.M_Factura;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import java.util.Date;

public class Conexion {
    
    private static Conexion modelo;
    
    private String direccionSandra = "C:\\Users\\brenda\\Desktop\\PeluditosPET\\peluditospet.yap";
    private String direccionSandra2 = "C:\\Users\\brenda\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditos_pet.db4o";
    private String direccionGenova = "C:\\Users\\Ecastillo\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditospet.db4o";
    private ObjectContainer bd;
    
    public Conexion(){
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        bd = Db4oEmbedded.openFile(config,direccionSandra2);
    }
        
    public void cerrarConexion(){
        bd.close();
    }
    
    public void guardar(Object a){
        try{
            bd.store(a);
        }catch(Exception e){
            System.out.println(e);
        }        
    }
    
    public ObjectContainer getObjectContainer(){
        try{
            return bd;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static Conexion getInstancia(){
        if(modelo == null)
            modelo = new Conexion();

        return modelo;
    }
    
    public ObjectSet buscar(Object a){
        try{
            return bd.queryByExample(a);
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public void eliminar (Object e){
        try{
             bd.delete(e);            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
        
    public M_Factura[] buscarResultadosSODA(Date fechaI, Date fechaF /*, M_Trabajador trabajador*/ ) { 
        M_Factura[] arrayFactura = null;
        int i = 0;
        
        Query consulta = bd.query(); 
        consulta.constrain(M_Factura.class);     
        
        Constraint c = consulta.descend("fecha").constrain(fechaF).smaller();
        consulta.descend("fecha").constrain((fechaI)).greater().and(c);
        
        ObjectSet resultados = consulta.execute();
        
        if (resultados.hasNext()) {
            arrayFactura = new M_Factura[resultados.size()];
            while (resultados.hasNext()) {
                arrayFactura[i] = (M_Factura) resultados.next();
                i++;
            }
        }

          return arrayFactura;
    } 
    
}
