
package Controlador;

import Conexion.Conexion;
import Modelo.M_Especie;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Mascota {
    
    public C_Mascota() {
    }    
    
    private void guardar(M_Mascota mascota){
        try{
            Conexion.getInstancia().guardar(mascota);        
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos del animal");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->guardar: "+e);
        }        
    }

    public void guardarMascota(M_Mascota mascota, M_Propietario dueno){
        try{
            if(mascota.getCantidad()==0 && getNumMascotasExistentes() > 0){
                mascota.setCantidad(getMascotas(null).length);
            }
            mascota.aumentarCantidad();
            mascota.setCodigo(mascota.getCantidad());
            if (agregarMascotaCliente(dueno,mascota)){
                mascota.setDueno(dueno);
                System.out.println(dueno.toString());
                guardar(mascota);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GuardarMascota: "+e);
        }        
    }
      
    public void eliminarMascota(int codigo,String pk, String nombre, M_Propietario dueno){
        try{
            M_Mascota mascota = new M_Mascota(codigo,pk, nombre, null, null, 0, null);
            ObjectSet result = Conexion.getInstancia().buscar(mascota); 
            if(!result.isEmpty()){
                
                M_Mascota encontrado = (M_Mascota) result.next();
                eliminarMascotaCliente(pk,dueno,mascota);    
                
                Conexion.getInstancia().eliminar(encontrado);
                JOptionPane.showMessageDialog(null, "Se han eliminado correctamente la mascotica");
            }            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->eliminarMascota: "+e);
        }
    }
    
    public void modificarMascota(int codigo, String viejaID, String nombreViejo, M_Mascota m, String nuevaID, M_Propietario p){
        try{
            M_Mascota mascota = new M_Mascota(codigo,viejaID, nombreViejo, null, null, 0, null);
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
                encontrado.setCodigo(codigo);
                
                if (viejaID.compareTo(nuevaID)!=0){ //Si los id son diferentes, hubo cambio de dueño
                    agregarMascotaCliente(m.getDueno(),encontrado); //Se le agrega a un nuevo cliente
                    eliminarMascotaCliente(viejaID,p,encontrado2); //Se elimina del antiguo dueño
                }                
                Conexion.getInstancia().guardar(encontrado);
                JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el animalito" );
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error modificando mascota: "+e);
        }
    }
    
    public boolean agregarMascotaCliente(M_Propietario dueno, M_Mascota mascota){
        try{
            System.out.print("Mascota de: ");
            if (dueno instanceof M_Natural){ //Si su nuevo dueño es un cliente Natural se le agrega 
                C_Natural c1 = new C_Natural();
                M_Natural n = (M_Natural)dueno;
                System.out.println(n.getCedula());
                return c1.agregarMascota(n, n.getCedula());
            } else {
                C_Juridico c2 = new C_Juridico(); //Si su nuevo dueño es un cliente Juridico se le agrega
                M_Juridico j = (M_Juridico)dueno;
                System.out.println(j.getRIF());
                return (c2.agregarMascota(j.getRIF(), j));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error C_Mascota->agregarMascotaCliente: "+e);
        }
        return false;
    }
    
    public void eliminarMascotaCliente(String pk, M_Propietario dueno, M_Mascota mascota){
        try{
            if (dueno instanceof M_Natural){ //Si el anterior dueño era cliente natural
                C_Natural c3 = new C_Natural();
                M_Natural n = (M_Natural)dueno;
                c3.eliminarMascota(n, n.getCedula());
            } else {
                C_Juridico c4 = new C_Juridico(); //Si su dueño anterior era un cliente Juridico 
                M_Juridico j = (M_Juridico)dueno;
                c4.eliminarMascota(pk, j);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error C_Mascota->eliminarMascotaCliente: "+e);
        }
    }
    
    public void modificarDuenoMascota(int codigo, String viejoID, M_Propietario m, String nuevoID){
        try{
            M_Mascota mascota = new M_Mascota(codigo, viejoID, null, null, null, 0, null);
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
    
    
    public int getNumMascotasExistentes(){
        try{
            M_Mascota c = new M_Mascota(0,null, null, null, null, 0, null);            
            ObjectSet result = Conexion.getInstancia().buscar(c);
            if (!result.isEmpty()){
                return result.size();
            }
            return 0;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en C_Mascota->getNumMascotasExistentes: "+e);
            return 0;
        }
    }
    
    public void verMascota(int cod, String id, M_Propietario p){
        try{
            M_Mascota mascota = new M_Mascota(cod, id, null, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            JOptionPane.showMessageDialog(null, resultado.next());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en void verMascota "+ e);
        }        
    }
    
    public M_Mascota verMascota(String cod, M_Propietario p){
        try{
            M_Mascota mascota = new M_Mascota(0, cod, null, null, null, 0,null, p);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            return (M_Mascota) resultado;
//            JOptionPane.showMessageDialog(null, resultado.next());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en void M_Mascota verMascota "+ e);
            return null;
        }        
    }
    
    public M_Propietario buscarDueno(String id, String nombre){
        try{
            M_Mascota mascota = new M_Mascota(0,id, nombre, null, null, 0, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            return ((M_Mascota)resultado.next()).getDueno();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error buscando dueño: "+e);
            return null;
        }        
    }
    
    public void listarMascotas(){
        try{
            M_Mascota m = new M_Mascota(0,null, null, null, null, 0, null);
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

    
        M_Natural p = new M_Natural(null, null, null, null, null);
        M_Juridico p1 = new M_Juridico(null, null, null, null, null, null); 

            ObjectSet rs = Conexion.getInstancia().buscar(p);
            ObjectSet rs1 = Conexion.getInstancia().buscar(p1);

            // si hay propietarios naturales
            if(rs.size() > 0){
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
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarDuenos(duenos) "+e);
        }
    }
  
    public void cargarDuenosSinID(JComboBox duenos/*, String opc*/){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            duenos.setModel(aModel);
            
            M_Propietario p = new M_Propietario(null,null);
            ObjectSet rs = Conexion.getInstancia().buscar(p);
            if(rs.size() > 0){
                while(rs.hasNext() ){
                    aux = ((M_Propietario)rs.next()).nombreCompleto();
                    aModel.addElement(aux);
                }
            }

    
            /*M_Natural p = new M_Natural(null, null, null, null, null);
            M_Juridico p1 = new M_Juridico(null, null, null, null, null, null); 

            ObjectSet rs = Conexion.getInstancia().buscar(p);
            ObjectSet rs1 = Conexion.getInstancia().buscar(p1);

            // si hay propietarios naturales
            if(rs.size() > 0){
                while(rs.hasNext() ){
                    aux = ((M_Natural)rs.next()).nombreApellido();
                    aModel.addElement(aux);
                }
            }
            // si hay propietarios juridicos
            if(rs1.size() > 0){ 
                while(rs1.hasNext() ){
                   aux = ((M_Juridico)rs1.next()).getNombre();
                   aModel.addElement(aux);
                }
            }*/
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarDuenos(duenos) "+e);
        }
    }
    
    
    
    public void recorrerMascotasParaEliminarlas(int codigo,String id,M_Propietario dueno) {
        try{
            M_Mascota[] p = getMascotas(id);
            if (p != null) {
                for (M_Mascota per : p) {
                    eliminarMascota(0,id,per.getNombre(),dueno);
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->recorrerMascotas: " +e);
        }
    }
    
    public void recorrerMascotasParaModificarDueno(int codigo, String viejoID,M_Propietario dueno,String nuevoID) {
        try{
            M_Mascota[] p = getMascotas(viejoID);
            if (p != null) {
                for (M_Mascota per : p) {
                    modificarDuenoMascota(codigo,viejoID,dueno,nuevoID);
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->recorrerMascotas: " +e);
        }
    }
    
    
//    public boolean idExiste(String id){
//        try{    
//            M_Mascota mascota = new M_Mascota(0,id, null, null, null, 0, null);
//            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
//            if(!resultado.next().equals(""))
//                return true;
//            return false;
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//            return false;
//        }
//    }
    
    public M_Mascota[] getMascotas(String dueno){
        try {
            M_Mascota[] mascotas = null;
            M_Mascota mascotica = new M_Mascota(0,dueno, null, null, null, 0, null, null);
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
    
    public String[] getRazas(String especie){
        try {
            String[] x = null;
            M_Especie esp = new M_Especie(especie);
            ObjectSet resultados = Conexion.getInstancia().buscar(esp);
            if (resultados.hasNext()) {
                M_Especie e = (M_Especie)resultados.next();
                x = new String[e.getNumRazas()];                
                for (int i=0; i<e.getNumRazas(); i++){
                    x[i] = e.getRaza(i);  
                }
            }
            
            return x;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->getRazas(): "+e);
            return null;
        }
    }
   
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"CodigoIngreso","ID_Dueno", "Nombre","Especie","Raza", "Edad","Observaciones"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Mascota[] p = getMascotas(null);
            if (p != null) {
                for (M_Mascota per : p) {
                    Object[] cli = new Object[7];
                    cli[0] = per.getCodigo();
                    cli[1] = per.getId();
                    cli[2] = per.getNombre();
                    cli[3] = per.getEspecie();
                    cli[4] = per.getRaza();
                    cli[5] = per.getEdad();
                    cli[6] = per.getObservaciones();
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
    public void setComboSelected(String string, JComboBox combito){
        String textoCombo = "";
        for (int i = 0; i < combito.getItemCount(); i++) {
            textoCombo = combito.getItemAt(i).toString();
           //Comparo los objetos de mi combo con el codigo del item que buscaba
           if (string.compareTo(textoCombo) == 0)  {
              //Si encuentra el item le asigno su index a mi combo
              combito.setSelectedIndex(i);              
              break;
           }
        }
    }
    
     //Selecciona en un combo box la opcion que corresponde a un codigo PK dado.
    public void setCodigoComboSelected(String codigoPK, JComboBox combito){
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
    
    public void cargarEspecies(JComboBox especies){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            especies.setModel(aModel);
            M_Especie p = new M_Especie(null);
            ObjectSet rs = Conexion.getInstancia().buscar(p);

            // si hay especies
            if(rs.size() >0){
                while(rs.hasNext() ){
                    aux = ((M_Especie)rs.next()).getNombre();
                    aModel.addElement(aux);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->CargarEspecies: "+e);
        }
    }
    
    public void cargarRazas(JComboBox razas, String especie){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            razas.setModel(aModel);
            String[] x = getRazas(especie);
            if (x != null) {
                for (String per : x) {
                    aux = per.toString();
                    aModel.addElement(aux);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarRazas: "+e);
        }
    }

    public M_Mascota getMascota(String id, String dueno){
        try{
            M_Mascota mascota = new M_Mascota(Integer.parseInt(id), dueno, null, null, null, 0, null, null);//(null, null, null, null, rif, null); 
            ObjectSet resultado = Conexion.getInstancia().buscar(mascota);
            if (resultado.isEmpty())
                return null;
            M_Mascota encontrado = (M_Mascota) resultado.next();
            return encontrado;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->getMascota"+ e);
            return null;  
        }      
    }
    
    public void cargarDuenoConMascota(JComboBox dueno, String cedula){
        try{
            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
            String aux;
            dueno.setModel(aModel);
            M_Mascota[] x = getMascotas(cedula);
            if (x != null) {
                for (M_Mascota per : x) {
                    //aux = per.printNombreID();// toString();
                    aux = per.getNombre();
                    aModel.addElement(aux);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarDuenoConMascota: "+e);
        }
    }
       
}
