package Controlador;

import Conexion.Conexion;
import Modelo.M_Especie;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Especie {

    //private ArrayList <String> Razas;
    
    public C_Especie(){
    //    Razas = new ArrayList<>();
    }
    
//    public void guardarEspecie(M_Especie especie, String raza){
//        try{
//            if(!especieExiste(especie.getNombre())){
//                Conexion.getInstancia().guardar(especie);
//            }
//            else
//                //modificarEspecie(especie.getNombre(), raza, especie);
//            guardarRaza(especie.getNombre(), raza);
//            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos de la especie");
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    
    public void guardarEspecie(M_Especie especie/*, String raza*/){
        try{
            JOptionPane.showMessageDialog(null, "Entré");
            if(modeloExiste(especie.getNombre()) != null)// especieExiste(especie.getNombre()))
            {
                JOptionPane.showMessageDialog(null, "Si existo");
                M_Especie aux = modeloExiste(especie.getNombre());
                System.out.println("Aux Lista");aux.imprimirLista(aux.getNombre(), aux.Razas);
                System.out.println("Especie Lista: ");especie.imprimirLista(especie.getNombre(), especie.Razas);
                especie.setRazitas(especie.concatLista(aux.Razas, especie.Razas));
                System.out.println("Mix Lista: "); especie.imprimirLista(especie.getNombre(), especie.Razas);
//                ArrayList<String> lista = especie.concatLista(especie.Razas, aux.Razas);
//                System.out.println("AuxImprimir: ");//especie.imprimir();
//                System.out.println("");
//                modificarEspecie(especie);
//                especie.imprimir();// getRazas().toString();
                Conexion.getInstancia().guardar(especie);
            }
            else
                Conexion.getInstancia().guardar(especie);
                JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos de la especie");
//            }//especie.imprimir();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarEspecie(String nombre){
        try{
            M_Especie especie = new M_Especie(nombre, null);
            ObjectSet result = Conexion.getInstancia().buscar(especie);
            M_Especie encontrado = (M_Especie) result.next();
            encontrado.eliminarRazas();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos de la especie");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
//    public void guardarRaza(String nombre, String raza){
//        try{
//            M_Especie especie = new M_Especie(nombre, null);
//            ObjectSet result = Conexion.getInstancia().buscar(especie);
//            M_Especie encontrado = (M_Especie) result.next();
//            
//            encontrado.setNombre(nombre);
//            encontrado.setRaza(raza);
//            
//            Conexion.getInstancia().guardar(encontrado);
//
//            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente la especie" );
//            encontrado.imprimir();
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    
    public void modificarEspecie(M_Especie e/*,ArrayList razaNueva*/){
        try{
            M_Especie especie = new M_Especie(e.getNombre(), null);
            ObjectSet result = Conexion.getInstancia().buscar(especie);
            M_Especie encontrado = (M_Especie) result.next();
            
            encontrado.setNombre(e.getNombre());
//            encontrado.setRaza(razaNueva);
            encontrado.setRazitas(e.getRazas());
            encontrado.setCantRazas(e.getCantRazas());
            
            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente la especie" );

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        
    public void verEspecie(String nombre){
        try{
            M_Especie especie = new M_Especie(nombre, null);
            ObjectSet result = Conexion.getInstancia().buscar(especie);
            JOptionPane.showMessageDialog(null, result.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean especieExiste(String especie){
        try{
            M_Especie e = new M_Especie(especie, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(e);
            if (resultado.isEmpty())
                return false;
            M_Especie encontrado = (M_Especie) resultado.next();
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
    
//    public void guardar(M_Especie nuevo){
//        try{
//            Conexion.getInstancia().guardar(nuevo);
//            JOptionPane.showMessageDialog(null, "Se han almacenado la especie");
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error en C_Especie->guardar: "+e);
//        }
//    }
    
//    public void modificar(String especie, String raza, M_Especie es){
//        try{
//            M_Especie nuevo = new M_Especie(especie,null);            
//            ObjectSet result = Conexion.getInstancia().buscar(nuevo);
//            
//            if (!result.isEmpty()){ //Si existen coincidencias con la especie
//                M_Especie encontrado = (M_Especie)result.next();  
//                encontrado.setNombre(es.getNombre());
//                encontrado.setRaza(raza);
//                Conexion.getInstancia().guardar(encontrado);
//                JOptionPane.showMessageDialog(null, "Se han almacenado la especie");
//            }
//            
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error en C_Especie->guardar: "+e);
//        }
//    }
    
    
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
    
    
    
//    public void listarEspecies(){
//       try{
//            M_Especie especie = new M_Especie(null, null);
//            ObjectSet resultado = Conexion.getInstancia().buscar(especie);
//            System.out.println("Tengo " + resultado.size() + " especies");
//            while(resultado.hasNext()){
//                System.out.println(resultado.next());
//            }
//       }catch(Exception e){
//           JOptionPane.showMessageDialog(null, e);
//       }
//    }
//    
//    public M_Especie[] getEspecies(){
//        try {
//            M_Especie[] personas = null;
//            M_Especie especie = new M_Especie(null, null);
//            ObjectSet resultados = Conexion.getInstancia().buscar(especie);
//            int i = 0;
//            if (resultados.hasNext()) {
//                personas = new M_Especie[resultados.size()];
//                while (resultados.hasNext()) {
//                    personas[i] = (M_Especie) resultados.next();
//                    i++;
//                }
//            }
//            return personas;
//        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
//            JOptionPane.showMessageDialog(null, "Error en C_Especie->getEspecies: "+e);
//            return null;
//        }
//    }
//    
//    public DefaultTableModel cargarTabla() {
//        try{
//            String titulos[] = {"Nombre"/*,"Raza"*/};
//            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
//            M_Especie[] p = getEspecies();
//            if (p != null) {
//                for (M_Especie per : p) {
//                    Object[] cli = new Object[4];
//                    cli[0] = per.getNombre();
//                    //cli[1] = per.getNombre();
//                    dtm.addRow(cli);
//                }
//            }
//            return dtm;
//        }catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            return null;
//        }
//    }
//    
    
//    
//    
//    public void cargarEspecies(JComboBox especies){
//        try{
//            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
//            String aux;
//            especies.setModel(aModel);
//
//            M_Especie e = new M_Especie(null, null);
//    
//            ObjectSet rs = Conexion.getInstancia().buscar(e);
//
//            // si hay propietarios naturales
//            if(rs.size() >0){
//                while(rs.hasNext() ){
//                    aux = rs.next().toString();
//                    aModel.addElement(aux);
//                }
//            }
//            
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
//    
//    public M_Especie getPersona(String nombre){
//        try{
//            M_Especie especie = new M_Especie(nombre, null);
//            ObjectSet resultado = Conexion.getInstancia().buscar(especie);
//            if (resultado.isEmpty())
//                return null;
//            M_Especie encontrado = (M_Especie) resultado.next();
//            return encontrado;
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//            return null;  
//        }      
//    }

