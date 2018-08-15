package Controlador;

import Conexion.Conexion;
import Modelo.M_Cita;
import Modelo.M_Factura;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Factura {

    public C_Factura() {
    }
    
    private void guardar(M_Factura factura){
        try{
              Conexion.getInstancia().guardar(factura);
              JOptionPane.showMessageDialog(null, "Se ha almacenado la factura");
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "error en C_Factura->guardar: "+ e);
          }
    }
    
    public void guardarFactura(M_Factura factura){
        try{
            //Cada nueva ejecucion del proyecto se vuelve el contador a 0
              //Esta condicion es que cuando el contador sea 0 pero en la BDD hayan facturas guardadas
              if (factura.getCantidad() == 0 && getNumFacturasExistentes() > 0){
                  factura.setCantidad(getFacturas().length);
              }
              factura.aumentarCantidad(); //Se aumenta la cita
              factura.setId(factura.getCantidad()); //Se actualiza el numero de cita
              guardar(factura);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en GuardarFactura: "+e);
        }
    }
    
    public void eliminarFactura(int id){
        try{
            M_Factura factura = new M_Factura(id, null, null, 0, 0, 0, null, null);
            ObjectSet result = Conexion.getInstancia().buscar(factura);
            M_Factura encontrado = (M_Factura) result.next();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos de la factura");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Factura->eliminarFactura "+e);
        }
    }
    
    public void eliminarTodas(){
        try{
            M_Factura factura = new M_Factura(0, null, null, 0, 0, 0, null, null);
            ObjectSet result = Conexion.getInstancia().buscar(factura);
            M_Factura encontrado = (M_Factura) result.next();
            
            while(result.hasNext()){
                Conexion.getInstancia().eliminar(encontrado);
            }
            
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente todas las facturas");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en C_Factura->eliminarTodas()"+ e);
        }
    }
    
    public void modificarFactura(int id, M_Factura f){
        try{
            M_Factura factura = new M_Factura(id, null, null, 0, 0, 0, null, null);
            ObjectSet result = Conexion.getInstancia().buscar(factura);
            M_Factura encontrado = (M_Factura) result.next();

            encontrado.setFecha(f.getFecha());
            encontrado.setSubtotal(f.getSubtotal());
            encontrado.setIva(f.getIva());
            encontrado.setTotal(f.getTotal());
            encontrado.setModoPago(f.getModoPago());

            Conexion.getInstancia().guardar(encontrado);

            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente la factura" );

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en C_Factura->modificarFactura()"+ex);
        }
    }
    
    public void verFactura(int id){
        try{
            M_Factura factura = new M_Factura(id, null, null, 0, 0, 0, null, null);
            ObjectSet result = Conexion.getInstancia().buscar(factura);
            JOptionPane.showMessageDialog(null, result.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void listarFacturas(){
       try{
            M_Factura factura = new M_Factura(0, null, null, 0, 0, 0, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(factura);
            System.out.println("Tengo " + resultado.size() + " facturas");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error en C_Factura->listarFacturas() "+e);
       }
    }
    
    
    public M_Factura[] getFacturas(){
        try {
            M_Factura[] personas = null;
            M_Factura factura = new M_Factura(0, null, null, 0, 0, 0, null, null);
            ObjectSet resultados = Conexion.getInstancia().buscar(factura);
            int i = 0;
            if (resultados.hasNext()) {
                personas = new M_Factura[resultados.size()];
                while (resultados.hasNext()) {
                    personas[i] = (M_Factura) resultados.next();
                    i++;
                }
            }
            return personas;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(null, "Error en C_Factura->getFactura: "+e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTabla() {
        try{
            String titulos[] = {"ID","Fecha","Cliente","Modo de Pago","Total"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Factura[] p = getFacturas();
            if (p != null) {
                for (M_Factura per : p) {
                    Object[] cli = new Object[5];
                    cli[0] = per.getId();
                    cli[1] = C_Fecha.deDateToString(per.getFecha());
                    cli[2] = per.getNombreCliente();
                    cli[3] = per.getModoPago();
                    cli[4] = per.getTotal();
                    dtm.addRow(cli);
                }
            }
            return dtm;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en C_Factura->cargarTabla() "+e);
            return null;
        }
    }

    public int getNumFacturasExistentes(){
       try{
            M_Factura factura = new M_Factura(0, null, null, 0, 0, 0, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(factura);
            if(!resultado.isEmpty())
                return resultado.size();
            return 0;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error en C_Factura->getNumFacturasExistentes "+ e);
           return 0;
        } 
    }
    
}
