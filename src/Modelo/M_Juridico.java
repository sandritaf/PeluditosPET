package Modelo;

public class M_Juridico extends M_Propietario{
    private String razonSocial;
    private String nombreGerente;
    private String RIF;
    private String mision;

    public M_Juridico(String direccion, String telefono, String razonSocial, String nombreGerente, String RIF, String mision) {
        super(direccion,telefono);
        this.mision = mision;
        this.nombreGerente = nombreGerente;
        this.RIF = RIF;
        this.razonSocial = razonSocial;
    }
    
    public M_Juridico() {
        super();
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
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
    
    @Override
    public String toString(){
        return RIF + " - " + razonSocial;
    }
    
    @Override
    public String nombreCompleto(){
        return razonSocial;
    }
    
    public String subString(int inicio){
        return RIF.substring(inicio);
    }
    
    public void actualizar(String direccion, String telefono, String razonSocial, String nombreGerente, String RIF, String mision) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.mision = mision;
        this.nombreGerente = nombreGerente;
        this.RIF = RIF;
        this.razonSocial = razonSocial;
    }
    
}
