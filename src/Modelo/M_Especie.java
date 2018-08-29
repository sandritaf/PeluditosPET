package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class M_Especie {
    
    public static int MAX_RAZAS = 10;
    private String nombre;
    private String[] razas = new String[MAX_RAZAS];
    private int numRazas;
    
    public M_Especie(){
    }
    
    public M_Especie(String nombre, String raza){
        this.nombre = nombre;   
        numRazas = 0;
        inicializarArreglo();
        agregarRaza(raza);
    }

    public M_Especie(String nombre) {
        this.nombre = nombre;     
        numRazas = 0;
        inicializarArreglo();  
    }    
    
    public void inicializarArreglo(){
        for(int i=0; i<MAX_RAZAS; i++){
            razas[i] = "";
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getRaza(int i){
        return razas[i];
    }
    
    public int getNumRazas(){
        return numRazas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setRaza(String raza){
        for(int i=0; i<MAX_RAZAS; i++){
            if (razas[i].compareTo("")==0){
                razas[i] = raza;
                numRazas++;
                break;
            }
        }
    }
    
      
    private int razaExiste(String raza){
        for(int i=0; i<MAX_RAZAS; i++){
            if (razas[i].compareTo(raza)==0){
                return i;
            }
        }
        return -1;
    }
    
    public void agregarRaza(String raza){
        if (razaExiste(raza) == -1){ //Si no existe la raza
            setRaza(raza);
        }
    }
    
    public void imprimir(){
        System.out.println("Especie: "+nombre+" | Razas:");
        System.out.println(razas.toString());
    }
        
    public String toString(){
        return nombre;
    }
        
    
    public void imprimirLista(){
        //Razas = aux;
        System.out.print("Lista Especie: "+nombre+" | Razas: ");
        for ( int i = 0 ; i<MAX_RAZAS; i++){ 
            System.out.print(" - "+razas[i]);
        }
        System.out.println();
    }
    
    public void eliminarRazas(String raza){
        for(int i=0; i<MAX_RAZAS; i++){
            if (razas[i].compareTo(raza)==0){
                razas[i] = "";
                numRazas--;
                break;
            }
        }
    }
}
