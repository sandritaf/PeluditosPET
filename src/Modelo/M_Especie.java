package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class M_Especie {
    
    String nombre;
    int cantRazas;
    int posRaza;
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

    public int getCantRazas() {
        return cantRazas;
    }

    public void setCantRazas(int cantRazas) {
        this.cantRazas = cantRazas;
    }

    public ArrayList<String> getRazas() {
        return Razas;
    }

    public void setRazas(ArrayList<String> Razas) {
        this.Razas = Razas;
    }
    
    public void setRazas(String raza) {
        if(buscarRaza(raza)){
            this.Razas.set(posRaza, raza);//this.Razas.set(cantRazas, raza) add(raza);
        }
        else
            this.Razas.add(raza);
        cantRazas++;
    }
    
    public boolean buscarRaza(String raza) {
        for(String a: Razas) {
            if(raza.equals(a)) {
                posRaza = a.indexOf(raza);
                JOptionPane.showMessageDialog(null, "Posicion: "+posRaza);
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        return nombre;
    }
    
/*    public boolean obtenerPosRaza(String raza) {
        int i;
        for(String a: Razas) {
            
            while (a.iterator().hasNext()) {

                if (a.stream().anyMatch(cli -> cli.nombre.equals(raza))) {
                    i = Razas.indexOf(a);
                    break;
                }
            }
            
        }
        return false;
    }
*/
}
