package Modelo;

public class M_Servicio {
    private String nombre;
    private String descripción;
    private String observaciones;
    private int precio;
    private String tipoTrabajador;
    
    public M_Servicio(String nombre, String descripción, String observaciones, int precio) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.observaciones = observaciones;
        this.precio = precio;
    }
    
    public M_Servicio(String nombre, String descripción, String observaciones, int precio, String tipoTrabajador) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.observaciones = observaciones;
        this.precio = precio;
        this.tipoTrabajador = tipoTrabajador;
    }

    public M_Servicio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void actualizar(String nombre, String descripción, String observaciones, int precio, String tipoTrabajador) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.observaciones = observaciones;
        this.precio = precio;
        this.tipoTrabajador = tipoTrabajador;
    }
    
    public String toString(){
        return nombre;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }
    
}
