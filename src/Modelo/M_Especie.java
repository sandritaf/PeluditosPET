package Modelo;

import java.util.ArrayList;

public class M_Especie {
    
    private String nombre;
    private int cantRazas;
    public ArrayList<String> Razas = new ArrayList<>();
    
    public M_Especie(String nombre, String raza){
        this.nombre = nombre;
        Razas.add(raza);
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
        if (Razas.indexOf(raza) == -1)
            return false;
        System.out.println("Se intenta añadir: "+raza+" y se encontro coincidencia con: "+Razas.get(Razas.indexOf(raza)));
        return true;
    }
    
    public void setRaza(String raza){
        if (!razaExiste(raza)){ //Si no existe la raza
            this.Razas.add(raza);
            System.out.println("Añadida UNA especie ");
            cantRazas++;
            imprimir();
        }
    }
    
    public void imprimir(){
        System.out.print("Especie: "+nombre+" | Razas: ");
        for ( int i = 0 ; i<cantRazas; i++){ 
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
}
