package Modelo;

public class M_Natural extends M_Propietario{
    String primerNombra;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    String cedula;
    int edad;

    public M_Natural() {
        super();
    }

    public M_Natural(String direccion, String telefono, M_Mascota Mascotini, String primerNombra, String segundoNombre, String primerApellido, String segundoApellido, String cedula, int edad) {
        super(direccion,telefono,Mascotini);
        this.primerNombra = primerNombra;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.edad = edad;
    }
    
    public M_Natural(String primerNombra, String segundoNombre, String primerApellido, String segundoApellido, String cedula, int edad) {
        this.primerNombra = primerNombra;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getPrimerNombra() {
        return primerNombra;
    }

    public void setPrimerNombra(String primerNombra) {
        this.primerNombra = primerNombra;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
