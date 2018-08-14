package Modelo;

public class M_Juridico extends M_Propietario{
    private String nombre;
    private String nombreGerente;
    private  String RIF;
    private  String razonSocial;

    
    public M_Juridico(String direccion, String telefono, String nombre, String nombreGerente, String RIF, String razonSocial) {
        super(direccion,telefono);
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

    @Override
    public String nombreCompleto(){
        return nombre;
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
    
    @Override
    public String toString(){
        return RIF + " - " + nombre;
    }
    
    public void actualizar(String direccion, String telefono, String nombre, String nombreGerente, String RIF, String razonSocial) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
        this.nombreGerente = nombreGerente;
        this.RIF = RIF;
        this.razonSocial = razonSocial;
    }
    
}
