package Modelo;

public class M_Estilista extends M_Trabajador {
    
    private boolean stripping;
    
    public M_Estilista() {
    }

    public M_Estilista(String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int anosExperiencia, String telefono, int precioTrabajo, boolean stripping) {
        super(nombre, apellido, cedula, RIF, edad, nivelInstruccion, profesion, anosExperiencia, telefono, precioTrabajo);
        this.stripping = stripping;
    }

    public boolean isStripping() {
        return stripping;
    }

    public void setStripping(boolean stripping) {
        this.stripping = stripping;
    }

    public void actualizar(String nombre, String apellido, String cedula, String RIF, int edad, String nivelInstruccion, String profesion, int aniosExperiencia, String telefono, int precioTrabajo, boolean stripping) {
        super.actualizar(nombre, apellido, cedula, RIF, edad, nivelInstruccion, profesion, aniosExperiencia, telefono, precioTrabajo); //To change body of generated methods, choose Tools | Templates.
        this.stripping = stripping;
    }
  
    
    
}
