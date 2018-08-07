package Modelo;

public class M_Juridico extends M_Propietario{
    String nombre;
    String nombreGerente;
    String RIF;
    String razonSocial;

    public M_Juridico(String direccion, String telefono, M_Mascota Mascotini, String nombre, String nombreGerente, String RIF, String razonSocial) {
        super(direccion,telefono,Mascotini);
        this.nombre = nombre;
        this.nombreGerente = nombreGerente;
        this.RIF = RIF;
        this.razonSocial = razonSocial;
    }
    
    public M_Juridico(String nombre, String nombreGerente, String RIF, String razonSocial) {
        this.nombre = nombre;
        this.nombreGerente = nombreGerente;
        this.RIF = RIF;
        this.razonSocial = razonSocial;
    }
    
    public M_Juridico() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getRIF() {
        return RIF;
    }

    public void setRIF(String RIF) {
        this.RIF = RIF;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    public String toString(){
        return RIF + " - " + nombre;
    }
    
}
