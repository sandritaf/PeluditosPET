
package Modelo;

import java.util.Date;

public class M_Factura {
    
    private int id;
    private M_Cita cita;
    private String fecha;
    private float iva;
    private float subtotal;
    private float total;
    private String modoPago;
    private String nombreCliente;
    
    public M_Factura(int id, M_Cita cita, String fecha, float iva, float subtotal, float total, String modoPago, String nombreCliente) {
        this.id = id;
        this.cita = cita;
        this.fecha = fecha;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
        this.modoPago = modoPago;
        this.nombreCliente = nombreCliente;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getModoPago() {
        return modoPago;
    }

    public void setModoPago(String modoPago) {
        this.modoPago = modoPago;
    }

    public M_Cita getCita() {
        return cita;
    }

    public void setCita(M_Cita cita) {
        this.cita = cita;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String toString(){
        return "IVA: " + iva + " SUBTOTAL: " + subtotal + " TOTAL: " + total + " CLIENTE: " + nombreCliente;
    }
    
    public String toString(Date fecha){
        return fecha.toString();
    }
    
    public void actualizar(int id, M_Cita cita, String fecha, float iva, float subtotal, float total, String modoPago, String nombreCliente) {
        this.id = id;
        this.cita = cita;
        this.fecha = fecha;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
        this.modoPago = modoPago;
        this.nombreCliente = nombreCliente;
    }
    
}
