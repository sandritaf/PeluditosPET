package Modelo;

import java.util.ArrayList;

public class M_Especie {
    
    private String nombre;
    private int cantRazas;
    public ArrayList<String> Razas = new ArrayList<>();
    
    public M_Especie(String nombre, String raza){
        this.nombre = nombre;
        Razas.add(raza);
        cantRazas = 1;// = 1;
    }

    public M_Especie(String nombre) {
        this.nombre = nombre;
        cantRazas = 0;
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
    
    public void setRazitas(ArrayList<String> raza){
        this.Razas = raza;
        cantRazas = raza.size();
    }

    public int getCantRazas() {
        return cantRazas;
    }

    public void setCantRazas(int cantRazas) {
        this.cantRazas = cantRazas;
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
            cantRazas++;
        }
    }
    
    public void imprimir(){
        System.out.println("Tienes "+Razas.size()+" vs "+cantRazas+" razas");
        System.out.print("Especie: "+nombre+" | Razas:");
        for ( int i = 0 ; i<Razas.size(); i++){ 
            System.out.print(" - "+Razas.get(i).toString());
        }
        System.out.println();
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
        cantRazas++;
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
        return Razas;
    }
    
}
