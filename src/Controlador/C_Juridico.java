
package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Juridico {
   
    public C_Juridico(){
    }
    
    public void guardarJuridico(M_Juridico juridico){
          try{
              juridico.setRIF("J"+juridico.getRIF());
              Conexion.getInstancia().guardar(juridico);
              JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del propietario");
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
        
    }
    
    public void eliminarJuridico(String rif){
        try{
            M_Juridico juridico = new M_Juridico(null, null, null, null, rif, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            M_Juridico encontrado = (M_Juridico) resultado.next();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos del propietario "+ 
                                                encontrado.getNombre() + " RIF: "+encontrado.getRIF());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarJuridico(String rif, M_Juridico j){
        try{    
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
            ObjectSet result = Conexion.getInstancia().buscar(juridico);
            M_Juridico encontrado = (M_Juridico) result.next();

            encontrado.setNombre(j.getNombre());
            encontrado.setNombreGerente(j.getNombreGerente());
            encontrado.setTelefono(j.getTelefono());
            encontrado.setRazonSocial(j.getRazonSocial());
            encontrado.setRIF(j.getRIF());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el cliente jurídico" );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void verJuridico(String rif){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public M_Juridico getPersona(String rif){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            M_Juridico encontrado = (M_Juridico) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }      
    }
    
    public M_Juridico[] getJuridicos(){
        try {
            M_Juridico[] personas = null;
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, null, null);
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
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(juridico);
            System.out.println("Tengo " + resultado.size() + " personas juridicas");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public boolean idExiste(String rif){
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
    }
    
    public void agregarMascota(String rif, M_Juridico j, M_Mascota mascotica){
        try{
            M_Propietario juridico = new M_Juridico(null, null, null, null, null, rif, null);
            ObjectSet result = Conexion.getInstancia().buscar(juridico);
            M_Juridico encontrado = (M_Juridico) result.next();

            encontrado.setNombre(j.getNombre());
            encontrado.setNombreGerente(j.getNombreGerente());
            encontrado.setTelefono(j.getTelefono());
            encontrado.setRazonSocial(j.getRazonSocial());
            encontrado.setRIF(j.getRIF());
            encontrado.setMascoticas(mascotica);

            Conexion.getInstancia().guardar(encontrado);
            JOptionPane.showMessageDialog(null, "Se ha añadido la mascota al cliente juridico");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"RIF", "Nombre","Telefono","Gerente", "Razon Social","Mascotaa registradas"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Juridico[] p = getJuridicos();
            if (p != null) {
                for (M_Juridico per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getRIF();
                    cli[1] = per.getNombre();
                    cli[2] = per.getTelefono();
                    cli[3] = per.getNombreGerente();
                    cli[4] = per.getRazonSocial();
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
    
}
