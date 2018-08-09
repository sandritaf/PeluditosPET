package Modelo;

import java.util.ArrayList;

public class M_Propietario {
    String direccion;
    String telefono;
    ArrayList<M_Mascota> Mascoticas = new ArrayList<>();

    public M_Propietario() {
    }
        
    public M_Propietario(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public M_Propietario(String direccion, String telefono, M_Mascota Mascotini) {
        this.direccion = direccion;
        this.telefono = telefono;
        Mascoticas.add(Mascotini);
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

    public ArrayList<M_Mascota> getMascoticas() {
        return Mascoticas;
    }

    public void setMascoticas(M_Mascota Mascoticas) {
        this.Mascoticas.add(Mascoticas);
    }
    
    public int getNumMascotas(){
        return Mascoticas.size();
    }
    
    public void retirarMascota(M_Mascota mascotica){
        Mascoticas.remove(mascotica);
    }
}
