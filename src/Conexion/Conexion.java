
package Conexion;

import Modelo.M_Cita;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import java.util.Date;
import java.util.Vector;

public class Conexion {
    
    private static Conexion modelo;
    
    private String direccionGenova = "C:\\Users\\Ecastillo\\Documents\\NetBeansProjects\\PeluditosPET\\src\\Conexion\\peluditospet.db4o";
    private ObjectContainer bd;
    
    public Conexion(){
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        bd = Db4oEmbedded.openFile(config,direccionGenova);
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
        
    public M_Cita[] buscarResultadosSODA(Date fechaI, Date fechaF /*, M_Trabajador trabajador*/ ) { 
      //  Vector<M_Cita> resultado = new Vector<M_Cita>();
        M_Cita[] arrayCita = null;
        int i = 0;
        
        Query consulta = bd.query(); 
        consulta.constrain(M_Cita.class);     
        
        Constraint c = consulta.descend("fecha").constrain(fechaF).smaller();
        
       // Constraint d = consulta.descend("trabajador").constrain((trabajador));
        
        consulta.descend("fecha").constrain((fechaI)).greater().and(c); //.and(d); ??
        
        ObjectSet resultados = consulta.execute();
        
        if (resultados.hasNext()) {
            arrayCita = new M_Cita[resultados.size()];
            while (resultados.hasNext()) {
                arrayCita[i] = (M_Cita) resultados.next();
                i++;
            }
        }
        
//        while(resultados.hasNext()) { 
//            resultado.add((M_Cita)resultados.next()); 
//        } 
//        for(int i=0; i<resultado.size(); i++){
//            System.out.println((i+1)+".- "+resultado.elementAt(i));
//        }

          return arrayCita;
    } 
    
}
