
package Controlador;
import Conexion.Conexion;
import Modelo.M_Trabajador;
import Modelo.M_Natural;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

public class C_Persona {
    
    public boolean personaExiste(String cedula){
        try{
            M_Trabajador trabajador = new M_Trabajador(null, null, cedula, null, 0, null, null, 0, null, 0);
            M_Natural natural = new M_Natural(null, null, null, null, cedula);
            
            ObjectSet resultado = Conexion.getInstancia().buscar(trabajador);
            ObjectSet resultado1 = Conexion.getInstancia().buscar(natural);
            
            if (resultado.isEmpty() && resultado1.isEmpty())
                return false;
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Persona->personaExiste "+ e);
            return false;  
        }      
    }
    
}
