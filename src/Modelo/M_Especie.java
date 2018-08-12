package Modelo;

import java.util.ArrayList;
import java.util.List;

public class M_Especie {
    
    private String nombre;
    public List<String> Razas;
    
    public M_Especie(String nombre, String raza){
        this.nombre = nombre;
        Razas = new ArrayList<String>();
        Razas.add(raza);
    }

    public M_Especie(String nombre) {
        this.nombre = nombre;
        Razas = new ArrayList<>();
    }    
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNumRazas(){
        return Razas.size();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setRazitas(ArrayList<String> raza){
        this.Razas = raza;
    }
    
    private boolean razaExiste(String raza){
        if (Razas.indexOf(raza) == -1)
            return false;
        System.out.println("Se intenta añadir: "+raza+" y se encontro coincidencia con: "+Razas.get(Razas.indexOf(raza)));
        return true;
    }
    
    public void setRaza(String raza){
        if (!razaExiste(raza)){ //Si no existe la raza
            this.Razas.add(raza);
        }
    }
    
    public void imprimir(){
        System.out.println("Especie: "+nombre+" | Razas:");
       /* for ( int i = 0 ; i<Razas.size(); i++){ 
            System.out.println(Razas.get(i).toString());
        }*/
        System.out.println(Razas);
    }
    
//    public void setRazas(String raza) {
//        if(buscarRaza(raza)){
//            this.Razas.set(posRaza, raza);//this.Razas.set(cantRazas, raza) add(raza);
//        }
//        else
//            this.Razas.add(raza);
//        cantRazas++;
//    }
    
//    public boolean buscarRaza(String raza) {
//        for(String a: Razas) {
//            if(raza.equals(a)) {
//                posRaza = a.indexOf(raza);
//                JOptionPane.showMessageDialog(null, "Posicion: "+posRaza);
//                return true;
//            }
//        }
//        return false;
//    }
    
    public String toString(){
        return nombre;
    }
    
    public void agregarRaza(String nombre, String raza){
        this.nombre = nombre;
        this.Razas.add(raza);
    }
    
    public ArrayList concatLista(/*String nombresito/*/ ArrayList aux, ArrayList especie){
//        System.out.print("ESPECIE LISTA Especie: "+nombresito+" | Razas: ");
//        for ( int i = 0 ; i<especie.size(); i++){ 
//            System.out.print(" - "+especie.get(i).toString());
//        }
//        System.out.println();
//        
//        System.out.print("AUX LISTA Especie: "+nombresito+" | Razas: ");
//        for ( int i = 0 ; i<aux.size(); i++){ 
//            System.out.print(" - "+aux.get(i).toString());
//        }
//        System.out.println();
        int sizeE = especie.size();
        int auxE = aux.size();
        aux.addAll(especie);
    //    Razas = aux;
//        System.out.print("MIX LISTA Especie: "+nombresito+" | Razas: ");
//        for ( int i = 0 ; i<aux.size(); i++){ 
//            System.out.print(" - "+aux.get(i).toString());
//        }
//        System.out.println();
        return aux;
    }
    
    public void imprimirLista(String nombre, ArrayList aux){
        //Razas = aux;
        System.out.print("Lista Especie: "+nombre+" | Razas: ");
        for ( int i = 0 ; i<aux.size(); i++){ 
            System.out.print(" - "+aux.get(i).toString());
        }
        System.out.println();
    }
    
    public void eliminarRazas(){
        Razas.removeAll(Razas);
    }
    
    public ArrayList<String> getRazas(){
        return (ArrayList<String>) Razas;
    }
    
}
