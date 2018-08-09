
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
    
    public C_Mascota() {
    }    

    public void guardarMascota(M_Mascota mascota){
        try{
            Conexion.getInstancia().guardar(mascota);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void eliminarMascota(String pk){
        try{
            M_Mascota mascota = new M_Mascota(pk, null, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(mascota);
        
            M_Mascota encontrado = (M_Mascota) result.next();
            Conexion.getInstancia().eliminar(encontrado);

            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del animal");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarMascota(String id, M_Mascota m){
        try{
            M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(mascota);
            M_Mascota encontrado = (M_Mascota) result.next();

            encontrado.setNombre(m.getNombre());
            encontrado.setEspecie(m.getEspecie());
            encontrado.setRaza(m.getRaza());
            encontrado.setObservaciones(m.getObservaciones());
            encontrado.setEdad(m.getEdad());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el animalito" );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void verMascota(String id, M_Propietario p){
        try{
            M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            JOptionPane.showMessageDialog(null, resultado.next());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void listarMascotas(){
        try{
            M_Mascota m = new M_Mascota(null, null, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(m);
            System.out.println("Tengo " + resultado.size() + " mascotas");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void cargarDuenos(JComboBox duenos/*, String opc*/){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            duenos.setModel(aModel);

        //    if(opc.equals("Natural")){
            M_Propietario p = new M_Natural(null, null, null, null, null, null, null, null);
        //    }
        //    if (opc.equals("Juridico"))
        //    {
            M_Propietario p1 = new M_Juridico(null, null, null, null, null, null);
        //    }    

            ObjectSet rs = Conexion.getInstancia().buscar(p);
            ObjectSet rs1 = Conexion.getInstancia().buscar(p1);

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
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean idExiste(String id){
        try{    
            M_Mascota mascota = new M_Mascota(id, null, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            if(!resultado.next().equals(""))
                return true;
            return false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
}
