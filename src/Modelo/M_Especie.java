package Modelo;

import java.util.ArrayList;

public class M_Especie {
    
    String nombre;
    int cantRazas;
    ArrayList<String> Razas = new ArrayList<>();
    
    public M_Especie(String nombre, String raza){
        this.nombre = nombre;
        Razas.add(raza);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
