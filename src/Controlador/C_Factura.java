package Controlador;

import Conexion.Conexion;
import Modelo.M_Factura;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class C_Factura {

    public C_Factura() {
    }
    
        public void guardarFactura(M_Factura factura){
        try{
            //estilista.setCedula("V"+factura.getCedula());
            Conexion.getInstancia().guardar(factura);
            JOptionPane.showMessageDialog(null, "Se han almacenado correctamente los datos de la factura");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminarFactura(String cedula){
        try{
            M_Factura factura = new M_Factura(null, 0, 0, 0, null, null);
            ObjectSet result = Conexion.getInstancia().buscar(factura);
            M_Factura encontrado = (M_Factura) result.next();
            Conexion.getInstancia().eliminar(encontrado);
            JOptionPane.showMessageDialog(null, "Se han eliminado correctamente los datos de la factura");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificarFactura(String cedula, M_Factura f){
        try{
            M_Factura factura = new M_Factura(null, 0, 0, 0, null, null);
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
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void verFactura(String cedula){
        try{
            M_Factura factura = new M_Factura(null, 0, 0, 0, null, null);
            ObjectSet result = Conexion.getInstancia().buscar(factura);
            JOptionPane.showMessageDialog(null, result.next());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void listarFacturas(){
       try{
            M_Factura factura = new M_Factura(null, 0, 0, 0, null, null);
            ObjectSet resultado = Conexion.getInstancia().buscar(factura);
            System.out.println("Tengo " + resultado.size() + " facturas");
            while(resultado.hasNext()){
                System.out.println(resultado.next());
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    
    public M_Factura[] getFacturas(){
        try {
            M_Factura[] personas = null;
            M_Factura factura = new M_Factura(null, 0, 0, 0, null, null);
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
            String titulos[] = {"Fecha","Cliente","Modo de Pago","Total"};
            DefaultTableModel dtm = new DefaultTableModel(null, titulos);
            M_Factura[] p = getFacturas();
            if (p != null) {
                for (M_Factura per : p) {
                    Object[] cli = new Object[4];
                    cli[0] = per.getFecha();
                    cli[1] = per.getNombreCliente();
                    cli[2] = per.getModoPago();
                    cli[3] = per.getTotal();
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
