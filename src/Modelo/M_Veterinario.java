package Modelo;

public class M_Veterinario extends M_Trabajador{
    private String especializacion;
    private String universidad;

    public M_Veterinario(String especializacion, String universidad, String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int anosExperiencia, String telefono, int precioTrabajo) {
        super(nombre, apellido, cedula, RIF, edad, nivelInstruccion, profesion, anosExperiencia, telefono, precioTrabajo);
        this.especializacion = especializacion;
        this.universidad = universidad;
    }

    public M_Veterinario() {
    }
    
    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
    public void actualizar(String especializacion, String universidad, String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int anosExperiencia, String telefono, int precioTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.RIF = RIF;
        this.edad = edad;
        this.nivelInstruccion = nivelInstruccion;
        this.profesion = profesion;
        this.aniosExperiencia = anosExperiencia;
        this.telefono = telefono;
        this.especializacion = especializacion;
        this.universidad = universidad;
        this.precioTrabajo = precioTrabajo;
    }
    
    
}
