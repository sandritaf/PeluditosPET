
package Controlador;

import Conexion.Conexion;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class C_Mascota {
    
    public C_Mascota() {
    }    

    public void guardarMascota(M_Mascota mascota, M_Propietario dueno){
        try{
            Conexion.getInstancia().guardar(mascota);
            agregarMascotaCliente(dueno,mascota);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        
    }
      
    public void eliminarMascota(String pk, String nombre, String observaciones, M_Propietario dueno){
        try{
            M_Mascota mascota = new M_Mascota(pk, nombre, null, null, 0, observaciones);
            ObjectSet result = Conexion.getInstancia().buscar(mascota);        
            M_Mascota encontrado = (M_Mascota) result.next();
            
            eliminarMascotaCliente(dueno,mascota);            
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente la mascotica");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->eliminarMascota: "+e);
        }
    }
    
    public void modificarMascota(String viejaID, String nombreViejo, String observacionesViejas, M_Mascota m, String nuevaID, M_Propietario p){
        try{
            M_Mascota mascota = new M_Mascota(viejaID, nombreViejo, null, null, 0, observacionesViejas);
            ObjectSet result = Conexion.getInstancia().buscar(mascota);
            ObjectSet result2 = Conexion.getInstancia().buscar(mascota);            
            
            if(!result.isEmpty()){
                M_Mascota encontrado = (M_Mascota) result.next(); //El nuevo que se va a guardar
                M_Mascota encontrado2 = (M_Mascota) result2.next(); //El que se va a eliminar
                
                encontrado.setNombre(m.getNombre());
                encontrado.setEspecie(m.getEspecie());
                encontrado.setRaza(m.getRaza());
                encontrado.setObservaciones(m.getObservaciones());
                encontrado.setEdad(m.getEdad());
                encontrado.setDueno(m.getDueno());
                encontrado.setId(nuevaID);
                
                if (viejaID.compareTo(nuevaID)!=0){ //Si los id son diferentes, hubo cambio de dueño
                    agregarMascotaCliente(m.getDueno(),encontrado); //Se le agrega a un nuevo cliente
                    eliminarMascotaCliente(p,encontrado2); //Se elimina del antiguo dueño
                }                
                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el animalito" );
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error modificando mascota: "+e);
        }
    }
    
    public void agregarMascotaCliente(M_Propietario dueno, M_Mascota mascota){
        try{
            if (dueno instanceof M_Natural){ //Si su nuevo dueño es un cliente Natural se le agrega 
                C_Natural c1 = new C_Natural();
                M_Natural n = (M_Natural)dueno;
                c1.agregarMascota(mascota, n, n.getCedula());
            } else {
                C_Juridico c2 = new C_Juridico(); //Si su nuevo dueño es un cliente Juridico se le agrega
                M_Juridico j = (M_Juridico)dueno;
                c2.agregarMascota(j.getRIF(), j, mascota);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error C_Mascota->agregarMascotaCliente: "+e);
        }
    }
    
    public void eliminarMascotaCliente(M_Propietario dueno, M_Mascota mascota){
        try{
            if (dueno instanceof M_Natural){ //Si el anterior dueño era cliente natural
                C_Natural c3 = new C_Natural();
                M_Natural n = (M_Natural)dueno;
                c3.eliminarMascota(mascota, n, n.getCedula());
            } else {
                C_Juridico c4 = new C_Juridico(); //Si su dueño anterior era un cliente Juridico 
                M_Juridico j = (M_Juridico)dueno;
                c4.eliminarMascota(j.getRIF(), j, mascota);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error C_Mascota->eliminarMascotaCliente: "+e);
        }
    }
    
    public void modificarDuenoMascota(String viejoID, M_Propietario m, String nuevoID){
        try{
            M_Mascota mascota = new M_Mascota(viejoID, null, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(mascota);
            M_Mascota encontrado = (M_Mascota) result.next();

            encontrado.setId(nuevoID);
            encontrado.setDueno(m);

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
    
    public M_Propietario buscarDueno(String id, String nombre){
        try{
            M_Mascota mascota = new M_Mascota(id, nombre, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            return ((M_Mascota)resultado.next()).getDueno();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
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
        M_Propietario p = new M_Natural(null, null, null, null, null, null);
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
    
    
    public void recorrerMascotasParaEliminarlas(String id,M_Propietario dueno) {
        try{
            M_Mascota[] p = getMascotas(id);
            if (p != null) {
                for (M_Mascota per : p) {
                    eliminarMascota(id,per.getNombre(),per.getObservaciones(),dueno);
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->recorrerMascotas: " +e);
        }
    }
    
    public void recorrerMascotasParaModificarDueno(String viejoID,M_Propietario dueno,String nuevoID) {
        try{
            M_Mascota[] p = getMascotas(viejoID);
            if (p != null) {
                for (M_Mascota per : p) {
                    modificarDuenoMascota(viejoID,dueno,nuevoID);
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->recorrerMascotas: " +e);
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
    
    public M_Mascota[] getMascotas(String dueno){
        try {
            M_Mascota[] mascotas = null;
            M_Mascota mascotica = new M_Mascota(dueno, null, null, null, 0, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(mascotica);
            int i = 0;
            if (resultados.hasNext()) {
                mascotas = new M_Mascota[resultados.size()];
                while (resultados.hasNext()) {
                    mascotas[i] = (M_Mascota) resultados.next();
                    i++;
                }
            }
            return mascotas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->getMascotas(M_Propietario): "+e);
            return null;
        }
    }
   
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"ID", "Nombre","Especie","Raza", "Edad","Observaciones"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Mascota[] p = getMascotas(null);
            if (p != null) {
                for (M_Mascota per : p) {
                    Object[] cli = new Object[6];
                    cli[0] = per.getId();
                    cli[1] = per.getNombre();
                    cli[2] = per.getEspecie();
                    cli[3] = per.getRaza();
                    cli[4] = per.getEdad();
                    cli[5] = per.getObservaciones();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarTabla: " +e);
            return null;
        }
    }
    
    
    //Selecciona en un combo box la opcion que corresponde a un codigo PK dado.
    public void setComboSelected(String codigoPK, JComboBox combito){
        //Obtengo la longitud de mi combo
        int largoCombo = combito.getItemCount();
        String textoCombo = "";
        //Recorro el arraycollection
        for (int i = 0; i < largoCombo; i++) {
            textoCombo = combito.getItemAt(i).toString();
            int limite = textoCombo.indexOf(" -");
           //Comparo los objetos de mi combo con el codigo del item que buscaba
           if (textoCombo.substring(0, limite).compareTo(codigoPK) == 0)  {
              //Si encuentra el item le asigno su index a mi combo
              combito.setSelectedIndex(i);              
              break;
           }
        }
    }
    
    
    
}
