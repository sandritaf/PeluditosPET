package Modelo;

public class M_Trabajador {
    String nombre;
    String apellido;
    String cedula;
    String RIF;
    int edad;
    String nivelInstruccion;
    String profesion;
    int anosExperiencia;
    String telefono;

    public M_Trabajador() {
    }

    public M_Trabajador(String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int anosExperiencia, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.RIF = RIF;
        this.edad = edad;
        this.nivelInstruccion = nivelInstruccion;
        this.profesion = profesion;
        this.anosExperiencia = anosExperiencia;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRIF() {
        return RIF;
    }

    public void setRIF(String RIF) {
        this.RIF = RIF;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivelInstruccion() {
        return nivelInstruccion;
    }

    public void setNivelInstruccion(String nivelInstruccion) {
        this.nivelInstruccion = nivelInstruccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void actualizar(String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int anosExperiencia, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.RIF = RIF;
        this.edad = edad;
        this.nivelInstruccion = nivelInstruccion;
        this.profesion = profesion;
        this.anosExperiencia = anosExperiencia;
        this.telefono = telefono;
    }
    
    
}
