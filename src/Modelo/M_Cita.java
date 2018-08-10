
package Modelo;

import java.util.Date;

public class M_Cita {

    int id;
    M_Trabajador trabajador;
    M_Servicio servicio;
    Date fecha;
    String diagnosticoFinal;
    String tratamiento;
    M_Mascota mascota;

    public M_Cita(int id, M_Mascota mascota, M_Trabajador trabajador, M_Servicio servicio, Date fecha, String diagnosticoFinal, String tratamiento) {
        this.id = id;
        this.mascota = mascota;
        this.trabajador = trabajador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.diagnosticoFinal = diagnosticoFinal;
        this.tratamiento = tratamiento;
    }
    
    // Si el servicio no es médico, entonces si usaría este constructor, ya que no aplica tratamiento
    public M_Cita(int id, M_Trabajador trabajador, M_Servicio servicio, Date fecha, String diagnosticoFinal) {
        this.id = id;
        this.trabajador = trabajador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.diagnosticoFinal = diagnosticoFinal;
    }

    public M_Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(M_Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public M_Servicio getServicio() {
        return servicio;
    }

    public void setServicio(M_Servicio servicio) {
        this.servicio = servicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDiagnosticoFinal() {
        return diagnosticoFinal;
    }

    public void setDiagnosticoFinal(String diagnosticoFinal) {
        this.diagnosticoFinal = diagnosticoFinal;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public M_Mascota getMascota() {
        return mascota;
    }

    public void setMascota(M_Mascota mascota) {
        this.mascota = mascota;
    }
    
    
    
}
