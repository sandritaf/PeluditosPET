package Modelo;

import Controlador.C_Fecha;
import java.util.Date;

public class M_Cita {

    private int id;
    private M_Trabajador trabajador;
    private M_Servicio servicio;
    private Date fecha;
    private String diagnosticoFinal;
    private String tratamiento;
    private M_Mascota mascota;
    private boolean cancelado;
    private static int cantidad = 0;

    public M_Cita(int id, M_Mascota mascota, M_Trabajador trabajador, M_Servicio servicio, Date fecha, String diagnosticoFinal, String tratamiento) {
        this.id = id;
        this.mascota = mascota;
        this.trabajador = trabajador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.diagnosticoFinal = diagnosticoFinal;
        this.tratamiento = tratamiento;
        this.cancelado = false;
    }

    public M_Cita(int id, M_Trabajador trabajador, M_Servicio servicio, Date fecha, String diagnosticoFinal, String tratamiento, M_Mascota mascota, boolean cancelado) {
        this.id = id;
        this.trabajador = trabajador;
        this.servicio = servicio;
        this.fecha = fecha;
        this.diagnosticoFinal = diagnosticoFinal;
        this.tratamiento = tratamiento;
        this.mascota = mascota;
        this.cancelado = cancelado;
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
 
    public int getCantidad(){
        return cantidad;
    }
    
    public void aumentarCantidad(){
        cantidad++;
    }

    public int getId() {
        return id;
    }
    
    public void setCantidad(int g){
        cantidad = g;
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
    
    public void actualizar(int id, M_Mascota mascota, M_Trabajador trabajador, M_Servicio servicio, Date fecha, String diagnosticoFinal, String tratamiento) {
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
        try{
            return id + " - " + mascota.getNombre() + " - " + servicio.getNombre();
        } catch(Exception e){
            System.out.println("Error en M_Cita: toString: "+e);
        }
        return "toString";
    }
    
    public String imprimirT(){
        try{
            return id + " - " + mascota.getNombre() + " - " + fecha + " - " + servicio.getNombre() + " - " +
                    trabajador.nombreApellido();
        } catch(Exception e){
            System.out.println("Error en M_Cita: toString: "+e);
        }
        return "imprimirT";
    }
    
    public String estacancelado(){
        if(isCancelado())
            return "Si";
        return "No";
    }
}
