package Modelo;

public class M_Veterinario extends M_Trabajador{
    String especializacion;
    String universidad;

    public M_Veterinario(String especializacion, String universidad, String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int anosExperiencia, String telefono) {
        super(nombre, apellido, cedula, RIF, edad, nivelInstruccion, profesion, anosExperiencia, telefono);
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
    
    
}
