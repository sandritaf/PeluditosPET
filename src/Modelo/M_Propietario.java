package Modelo;

import java.util.ArrayList;
public class M_Propietario {
    protected String direccion;
    protected String telefono;
    protected int numeroMascotas;

    public M_Propietario() {
    }
        
    public M_Propietario(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
        numeroMascotas = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String nombreCompleto(){
        return "";
    }
    
    public int getNumMascotas(){
        return numeroMascotas;
    }
    
    public void agregarMascota(){
        numeroMascotas++;
    }
    
    public void retirarMascota(){
        numeroMascotas--;
    }

    public boolean esNumero(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
    
}
