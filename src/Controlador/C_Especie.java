package Controlador;

import Conexion.Conexion;
import Modelo.M_Especie;
import Modelo.M_Estilista;
import Modelo.M_Juridico;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Especie {

    public C_Especie() {
    }
    
    public void guardar(M_Especie nuevo){
        try{
            Conexion.getInstancia().guardar(nuevo);
            JOptionPane.showMessageDialog(null, "Se han almacenado la especie");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Especie->guardar: "+e);
        }
    }
    
    public void modificar(String especie, String raza, M_Especie es){
        try{
            M_Especie nuevo = new M_Especie(especie,null);            
            ObjectSet result = Conexion.getInstancia().buscar(nuevo);
            
            if (!result.isEmpty()){ //Si existen coincidencias con la especie
                M_Especie encontrado = (M_Especie)result.next();  
                encontrado.setNombre(es.getNombre());
                encontrado.setRaza(raza);
                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "Se han almacenado la especie");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Especie->guardar: "+e);
        }
    }
    
    
    public void listarEspecies(){
       try{
            M_Especie x = new M_Especie(null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(x);
            System.out.println("Tengo " + resultado.size() + " especies: ");
            while(resultado.hasNext()){
                ((M_Especie)resultado.next()).imprimir();
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    
    public M_Especie[] getEspecies(){
        try {
            M_Especie[] array = null;
            M_Especie x = new M_Especie(null, null);
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
            M_Especie p = new M_Especie(null,null);
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
    
}
