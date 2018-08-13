package Modelo;

import java.util.Date;

public class M_Cita {

    private int id;
    private M_Trabajador trabajador;
    private M_Servicio servicio;
    private String fecha;
    private String diagnosticoFinal;
    private String tratamiento;
    private  M_Mascota mascota;
    private boolean cancelado;

    public M_Cita(int id, M_Mascota mascota, M_Trabajador trabajador, M_Servicio servicio, String fecha, String diagnosticoFinal, String tratamiento) {
        this.id = id;
        this.mascota = mascota;
        this.trabajador = trabajador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.diagnosticoFinal = diagnosticoFinal;
        this.tratamiento = tratamiento;
        this.cancelado = false;
    }
    
    // Si el servicio no es médico, entonces si usaría este constructor, ya que no aplica tratamiento
    public M_Cita(int id, M_Mascota mascota, M_Trabajador trabajador, M_Servicio servicio, String fecha, String diagnosticoFinal) {
        this.id = id;
        this.mascota = mascota;
        this.trabajador = trabajador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.diagnosticoFinal = diagnosticoFinal;
        this.cancelado = false;
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

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }    
    
    public void setServicio(M_Servicio servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
    
    public void imprimir(){
        System.out.println(id+" "+fecha+" Trabajador: "+trabajador.getNombre()+" "+trabajador.getApellido()+
                "\nMascota atendida: "+mascota.getNombre()+" quien es propiedad de: "+
                mascota.getDueno().toString()+"\nEl diagnostico fue: "+diagnosticoFinal+" y el tratamiento+"
                        + "recomendado fue: "+tratamiento+"\nSe prestó el servicio: "+servicio.getNombre()+"\n");
    }
    
    public void actualizar(int id, M_Mascota mascota, M_Trabajador trabajador, M_Servicio servicio, String fecha, String diagnosticoFinal, String tratamiento) {
        this.id = id;
        this.mascota = mascota;
        this.trabajador = trabajador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.diagnosticoFinal = diagnosticoFinal;
        this.tratamiento = tratamiento;
        this.cancelado = false;
    }
    
    public String toString(){
       return id + " " + mascota.getNombre() + " " + fecha + " " ;
    }
        
}
