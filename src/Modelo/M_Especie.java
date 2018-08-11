package Modelo;

import java.util.ArrayList;

public class M_Especie {
    
    private String nombre;
    private int cantRazas;
    public ArrayList<String> razas = new ArrayList<>();
    
    public M_Especie(String nombre, String raza){
        this.nombre = nombre;
        razas.add(raza);
        cantRazas = 1;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNumRazas(){
        return cantRazas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private boolean razaExiste(String raza){
        if (razas.indexOf(raza) == -1)
            return false;
        System.out.println("Se intenta añadir: "+raza+" y se encontro coincidencia con: "+razas.get(razas.indexOf(raza)));
        return true;
    }
    
    public void setRaza(String raza){
        if (!razaExiste(raza)){ //Si no existe la raza
            this.razas.add(raza);
            System.out.println("Añadida UNA especie ");
            cantRazas++;
            imprimir();
        }
    }
    
    public void imprimir(){
        System.out.print("Especie: "+nombre+" | Razas: ");
        for ( int i = 0 ; i<cantRazas; i++){ 
            System.out.print(" - "+razas.get(i).toString());
        }
        System.out.println();
    }
    
}
