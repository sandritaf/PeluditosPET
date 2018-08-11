package Modelo;

public class M_Natural extends M_Propietario{
    private String nombre;
    private String apellido;
    private String cedula;

    public M_Natural() {
        super();
    }

    public M_Natural(String direccion, String telefono, M_Mascota Mascotini, String nombre, String apellido, String cedula) {
        super(direccion,telefono,Mascotini);
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    
    public M_Natural(String direccion, String telefono, String nombre, String apellido, String cedula) {
        super(direccion,telefono);
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
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
    
    public String toString(){
        return cedula + " - " + nombre + " " + apellido;
    }
    
    
    public void actualizar(String direccion, String telefono, String nombre, String apellido, String cedula) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
}
