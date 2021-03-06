
package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Controlador.C_Mascota;
import Modelo.M_Propietario;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Juridico extends C_Propietario{
   
    public C_Juridico(){
    }
    
    public void guardarJuridico(M_Juridico juridico, String tipo){
          try{
              juridico.setRIF(tipo+juridico.getRIF());
              Conexion.getInstancia().guardar(juridico);
              JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del cliente jurídico");
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
        
    }
    
    public void eliminarJuridico(String rif){
        try{
            M_Juridico juridico = new M_Juridico(null, null, null, null, rif, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            M_Juridico encontrado = (M_Juridico) resultado.next();
            
            C_Mascota controladorMascota = new C_Mascota();
            controladorMascota.recorrerMascotasParaEliminarlas(0,encontrado.getRIF(),encontrado);
            
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del propietario "+ 
                                                encontrado.getRazonSocial()+ " RIF: "+encontrado.getRIF());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarJuridico(String viejoRIF, M_Juridico j, String rif){
        try{    
            M_Propietario juridico = new M_Juridico(null, null, null, null, viejoRIF, null);
            ObjectSet result = Conexion.getInstancia().buscar(juridico);
            if (!result.isEmpty()){
                M_Juridico encontrado = (M_Juridico) result.next();

                encontrado.setRazonSocial(j.getRazonSocial());
                encontrado.setNombreGerente(j.getNombreGerente());
                encontrado.setTelefono(j.getTelefono());
                encontrado.setMision(j.getMision());
                encontrado.setRIF(rif);
                
                if (rif.compareTo(viejoRIF)!=0){ //Si los rif son iguales no hay que modificar a la mascota
                    C_Mascota controladorMascota = new C_Mascota();
                    controladorMascota.recorrerMascotasParaModificarDueno(0,viejoRIF,encontrado,rif);
                }
               
                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el cliente jurídico" );
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en C_Juridico->modificarJuridico: "+e);
        }
    }
    
    public void verJuridico(String rif){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, rif, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
    public M_Juridico[] getJuridicos(){
        try {
            M_Juridico[] personas = null;
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(juridico);
            int i = 0;
            if (resultados.hasNext()) {
                personas = new M_Juridico[resultados.size()];
                while (resultados.hasNext()) {
                    personas[i] = (M_Juridico) resultados.next();
                    i++;
                }
            }
            return personas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Juridico->getJuridicos: "+e);
            return null;
        }
    }
    
    public void listarJuridicos(){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            System.out.println("Tengo " + resultado.size() + " clientes juridicas");
            while(resultado.hasNext()){
                M_Juridico x = (M_Juridico)resultado.next();
                System.out.println(x);
               // System.out.println(resultado.next());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    /*public boolean idExiste(String rif){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            if(!resultado.next().equals(""))
                return true;
            return false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }*/
    
    public boolean agregarMascota(String rif, M_Juridico j){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, rif,null);
            ObjectSet result = Conexion.getInstancia().buscar(juridico);
            
            if (!result.isEmpty()){
                M_Juridico encontrado = (M_Juridico) result.next(); 
                encontrado.setMision(j.getMision());
                encontrado.setNombreGerente(j.getNombreGerente());
                encontrado.setTelefono(j.getTelefono());
                encontrado.setRazonSocial(j.getRazonSocial());
                encontrado.setRIF(j.getRIF());
                encontrado.agregarMascota();
                Conexion.getInstancia().guardar(encontrado);
                return true;
            }         
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error agregando la mascota al cliente Juridico: "+e);
        }
        return false;
    }
    
    
    public void eliminarMascota(String rif, M_Juridico j){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, rif,null);
            ObjectSet result = Conexion.getInstancia().buscar(juridico);
            
            if (!result.isEmpty()){
                M_Juridico encontrado = (M_Juridico) result.next();
                
                encontrado.setMision(j.getMision());
                encontrado.setNombreGerente(j.getNombreGerente());
                encontrado.setTelefono(j.getTelefono());
                encontrado.setRazonSocial(j.getRazonSocial());
                encontrado.setRIF(j.getRIF());
                encontrado.retirarMascota();

                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "se elimino la mascota del cliente juridico");
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Juridico->eliminarMascota:" +e);
        }
    }
    
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"RIF", "Razón Social","Telefono","Gerente", "Misión","Mascotas"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Juridico[] p = getJuridicos();
            if (p != null) {
                for (M_Juridico per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getRIF();// subString(1);
                    cli[1] = per.getRazonSocial();
                    cli[2] = per.getTelefono();
                    cli[3] = per.getNombreGerente();
                    cli[4] = per.getMision();
                    cli[5] = per.getNumMascotas();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public M_Juridico getPersona(String rif){
        try{
//            M_Juridico juridico = new M_Juridico(null, null, null, null, "J"+rif, null); 
            M_Juridico juridico = new M_Juridico(null, null, null, null, rif, null); 
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            if (resultado.isEmpty())
                return null;
            M_Juridico encontrado = (M_Juridico) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Juridico->getPersona():"+ e);
            return null;  
        }      
    }
    
//    public void cargarDuenoConMascota(JComboBox dueno, String cedula){
//        try{
//            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
//            String aux;
//            dueno.setModel(aModel);
//
//            //if(cedula.startsWith("V", 0))// charAt(0) == "V")
//                M_Mascota[] x = getMascotas();
//            if (x != null) {
//                for (M_Juridico per : x) {
//                    aux = per. getRIF() + " - " + per.getNombre();
//                    aModel.addElement(aux);
//                }
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarRazas: "+e);
//        }
//    }
    
}
