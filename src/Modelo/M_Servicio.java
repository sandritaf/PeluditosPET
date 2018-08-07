package Modelo;

public class M_Servicio {
    String nombre;
    String descripción;
    String diagnosticoFinal;
    String observaciones;

    public M_Servicio(String nombre, String descripción, String diagnosticoFinal, String observaciones) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.diagnosticoFinal = diagnosticoFinal;
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

    public String getDiagnosticoFinal() {
        return diagnosticoFinal;
    }

    public void setDiagnosticoFinal(String diagnosticoFinal) {
        this.diagnosticoFinal = diagnosticoFinal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
