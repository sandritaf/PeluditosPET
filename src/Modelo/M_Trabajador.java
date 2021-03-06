package Modelo;

public class M_Trabajador {
    protected String nombre, apellido, cedula, RIF, nivelInstruccion, profesion, telefono;
    protected int edad, aniosExperiencia, precioTrabajo;

    public M_Trabajador() {
    }

    public M_Trabajador(String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int anosExperiencia, String telefono, int precioTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.RIF = RIF;
        this.edad = edad;
        this.nivelInstruccion = nivelInstruccion;
        this.profesion = profesion;
        this.aniosExperiencia = anosExperiencia;
        this.telefono = telefono;
        this.precioTrabajo = precioTrabajo;
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

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPrecioTrabajo() {
        return precioTrabajo;
    }

    public void setPrecioTrabajo(int precioTrabajo) {
        this.precioTrabajo = precioTrabajo;
    }
    
    public void actualizar(String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int aniosExperiencia, String telefono, int precioTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.RIF = RIF;
        this.edad = edad;
        this.nivelInstruccion = nivelInstruccion;
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
        this.telefono = telefono;
        this.precioTrabajo = precioTrabajo;
    }
    
    public int precioSegunAnios(int aniosExperiencia){
        if(aniosExperiencia == 0){
            return 100;
        }
        else 
            return 100 * aniosExperiencia;
    }
    
    public String toString(){
        return cedula + " - " + nombre + " " + apellido;
    }

    public String nombreApellido(){
        return nombre + " " + apellido;
    }
    
    public String subString(int inicio){
        return cedula.substring(inicio);
    }
    
    public boolean esNumero(String cadena){
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            System.out.println("Tratando de averiguar si es numero: "+cadena+", capturada excepcion: "+excepcion);
            return false;
        }
    }
}
