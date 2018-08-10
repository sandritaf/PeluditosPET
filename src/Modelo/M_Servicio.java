package Modelo;

public class M_Servicio {
    String nombre;
    String descripción;
    String observaciones;

    public M_Servicio(String nombre, String descripción, String observaciones) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.observaciones = observaciones;
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
    
    
}
