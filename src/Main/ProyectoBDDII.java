package Main;

import Conexion.Conexion;
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
//        M_Juridico prop = new M_Juridico("Acarigua","04161803428", "sandra's Café", "Adrian Longart", "777", "Mejorar");
//       
//        controladorPropietario.guardarJuridico(prop);
//        
//        System.out.println("Antes de añadir mascota con su dueño asociado:\n ");
//        
//        controladorPropietario.listarJuridicos();
//        
//        M_Juridico nuevo = controladorPropietario.getPersona("J777");
//        
//        M_Mascota mascota = new M_Mascota("10", "Perrito", "Animalito", "Feito", 1, "Es nonito", nuevo);
//        
//        controladorMascota.guardarMascota(mascota);
//       
//        System.out.println("\n");
//        controladorMascota.listarMascotas();
//        
//        System.out.println("\n\nLuego de añadir Mascota pero no actualizar dueño");
//        
//        controladorPropietario.listarJuridicos();
//        
//        controladorPropietario.agregarMascota("J777", nuevo, mascota);
//        
//        System.out.println("\n\nLuego de actualizar Dueño");
//        
//        controladorPropietario.listarJuridicos();
//        
//        Conexion.getInstancia().cerrarConexion();
        
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
}
