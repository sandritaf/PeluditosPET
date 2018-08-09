package Main;

import Controlador.C_Juridico;
import Controlador.C_Mascota;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Vista.Menu;

public class ProyectoBDDII {

    public static void main(String[] args) {
//        C_Juridico controladorPropietario = new C_Juridico();
//        C_Mascota controladorMascota = new C_Mascota();
//        
//        M_Juridico prop = new M_Juridico("Caracas","0416100000", "Victoria's Café", "Sandra", "3456", "Producir!!!");
//       
//        controladorPropietario.guardarJuridico(prop);
//        
//        M_Juridico nuevo = controladorPropietario.getPersona("J3456");
//        
//        M_Mascota mascota = new M_Mascota("5", "w ", "t ", "f ", 30, "Es horrible", nuevo);
//        
//        controladorMascota.guardarMascota(mascota);
//       
//        controladorMascota.listarMascotas();
//        
//        System.out.println();
//        
//        controladorPropietario.listarJuridicos();
        
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
}
