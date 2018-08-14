package Controlador;

import Conexion.Conexion;
import Modelo.M_Especie;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Especie {

    private M_Especie modelo;
    
    public C_Especie(){
    }
    
    
    public void guardarEspecie(String especie, String raza){
        try{
            if(especieExiste(especie)){
                JOptionPane.showMessageDialog(null, "La especie ya existe. Intente con otro");
            }
            else{
                modelo = new M_Especie(especie,raza);
                Conexion.getInstancia().guardar(modelo);
                JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos de la especie");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Especie->guardar: "+e);
        }
    }
    
    
//    public void eliminarEspecie(String nombre){
//        try{
//            M_Especie especie = new M_Especie(nombre, null);
//            ObjectSet result = Conexion.getInstancia().buscar(especie);
//            M_Especie encontrado = (M_Especie) result.next();
//            encontrado.eliminarRazas();
//            Conexion.getInstancia().eliminar(encontrado);
//            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos de la especie");
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
        
    public void modificarEspecie(String nombreViejo, String nombre, String razaNueva){
        try{
            M_Especie esp = new M_Especie(nombreViejo);
            ObjectSet result = Conexion.getInstancia().buscar(esp);
            M_Especie x = (M_Especie)result.next(); 
            
            if (!result.isEmpty()){ //Si existen coincidencias con la especie    
                if (x.getNumRazas() == x.MAX_RAZAS)
                    JOptionPane.showMessageDialog(null, "El sistema no soporta más razas para la especie "+nombre);
                else {
                    x.setNombre(nombre);
                    x.agregarRaza(razaNueva);
                    Conexion.getInstancia().guardar(x);
                    JOptionPane.showMessageDialog(null, "Se han almacenado la raza nueva");
                }
            }
         }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error modificando especie: "+ex);
        }
    }
        
    public void verEspecie(String nombre){
        try{
            M_Especie especie = new M_Especie(nombre);
            ObjectSet result = Conexion.getInstancia().buscar(especie);
            JOptionPane.showMessageDialog(null, result.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean especieExiste(String especie){
        try{
            M_Especie e = new M_Especie(especie);
            ObjectSet resultado = Conexion.getInstancia().buscar(e);
            if (resultado.isEmpty())
                return false;
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;  
        }  
    }
    
    public M_Especie modeloExiste(String especie){
        try{
            M_Especie e = new M_Especie(especie, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(e);
            if (resultado.isEmpty())
                return null;
            M_Especie encontrado = (M_Especie) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }  
    }
    
    public void listarEspecies(){
       try{
            M_Especie x = new M_Especie(null);
            ObjectSet resultado = Conexion.getInstancia().buscar(x);
            System.out.println("Tengo " + resultado.size() + " especies: ");
            while(resultado.hasNext()){
                ((M_Especie)resultado.next()).imprimirLista();
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error listando especies:" +e);
       }
    }
    
    public M_Especie[] getEspecies(){
        try {
            M_Especie[] array = null;
            M_Especie x = new M_Especie(null);
            ObjectSet resultados = Conexion.getInstancia().buscar(x);
            int i = 0;
            if (resultados.hasNext()) {
               array = new M_Especie[resultados.size()];
                while (resultados.hasNext()) {
                    array[i] = (M_Especie) resultados.next();
                    i++;
                }
            }
            return array;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Especie->getEspecies: "+e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"Especie", "Razas Existentes"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Especie[] p = getEspecies();
            if (p != null) {
                for (M_Especie per : p) {
                    Object[] cli = new Object[2];
                    cli[0] = per.getNombre();
                    cli[1] = per.getNumRazas();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public void cargarEspecies(JComboBox especies){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            especies.setModel(aModel);
            M_Especie p = new M_Especie(null);
            ObjectSet rs = Conexion.getInstancia().buscar(p);

            // si hay propietarios naturales
            if(rs.size() >0){
                while(rs.hasNext() ){
                    aux = ((M_Especie)rs.next()).getNombre();
                    aModel.addElement(aux);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public M_Especie getEspecie(String nombre){
        try{
            M_Especie especie = new M_Especie(nombre);
            ObjectSet resultado = Conexion.getInstancia().buscar(especie);
            if (resultado.isEmpty())
                return null;
            M_Especie encontrado = (M_Especie) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }
    
}
    

