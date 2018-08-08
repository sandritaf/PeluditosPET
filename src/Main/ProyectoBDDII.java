package Main;

import Conexion.Conexion;
import Controlador.C_Juridico;
import Controlador.C_Mascota;
import Controlador.C_Natural;
import Controlador.C_Propietario;
import Modelo.M_Juridico;
import Modelo.M_Mascota;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import Vista.Menu;
import Vista.vista;

public class ProyectoBDDII {

    public static void main(String[] args) {
        //Conexion c = new Conexion();
//        vista v = new vista();
//        v.setVisible(true);
        //c.cerrarConexion();
        
//        M_Juridico prop = new M_Juridico("2", "Isaura's Café", "YoMisma", "20984", "Producir");
//        C_Juridico con = new C_Juridico();
//        con.guardarJuridico(prop);
        
//        M_Propietario prop = new M_Natural("sandra", "paola", "farreras", "bolivar", "26", 20);
//        M_Mascota mascota = new M_Mascota("1", "san", "canino", "puddle", 12, "hola", prop);
//        
//        C_Mascota controlador = new C_Mascota();
//        
//        controlador.guardarMascota(mascota);
//        controlador.verMascota("1");
//        controlador.listarMascotas();
//        controlador.modificarMascota("1", mascota);
//        c.cerrarConexion();

        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
}
