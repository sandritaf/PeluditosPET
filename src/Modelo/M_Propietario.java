package Modelo;

import java.util.ArrayList;
public class M_Propietario {
    protected String direccion;
    protected String telefono;
    protected ArrayList<M_Mascota> Mascoticas = new ArrayList<>();
    protected int numeroMascotas;

    public M_Propietario() {
    }
        
    public M_Propietario(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
        numeroMascotas = 0;
    }

    public M_Propietario(String direccion, String telefono, M_Mascota Mascotini) {
        this.direccion = direccion;
        this.telefono = telefono;
        Mascoticas.add(Mascotini);
        numeroMascotas = 1;
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
        numeroMascotas++;
    }
    
    public int getNumMascotas(){
        return numeroMascotas;
    }
    
    public void retirarMascota(M_Mascota mascotica){
        Mascoticas.remove(mascotica);
        numeroMascotas--;
    }
    
    public void imprimirMascotas(){
        for ( int i = 0 ; i<numeroMascotas; i++){ 
            System.out.print(" - "+Mascoticas.get(i).getNombre());
        }
        System.out.println();
    }
}
