package Controlador;

import Modelo.M_Juridico;
import Modelo.M_Natural;
import Modelo.M_Propietario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class C_Propietario {

    public C_Propietario() {
    }

    public M_Propietario obtenerDueno(JComboBox combito){
        String codigo = combito.getSelectedItem().toString(); 
        String codigoFinal = "";        
        int guion = codigo.indexOf(" -");
        codigoFinal = codigo.substring(0, guion);
        
        C_Juridico controladorJuridico = new C_Juridico();
        M_Juridico dueno = controladorJuridico.getPersona(codigoFinal);
        if (dueno != null)
            return dueno;
        else {
            C_Natural controladorNatural = new C_Natural();
            M_Natural dueno2 = controladorNatural.getPersona(codigoFinal);
            return dueno2;
        }        
    }
    
//    public M_Natural getPersona(String cedula){
//        try{
//            M_Natural n = new M_Natural(null, null, null, null, cedula);
//            ObjectSet resultado = Conexion.getInstancia().buscar(n);
//            if (resultado.isEmpty())
//                return null;
//            M_Natural encontrado = (M_Natural) resultado.next();
//            return encontrado;
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//            return null;  
//        }      
//    }
    
//    public void cargarDuenoConMascota(JComboBox dueno, String cedula){
//        try{
//            DefaultComboBoxModel aModel = new DefaultComboBoxModel();
//            String aux;
//            dueno.setModel(aModel);
//            
//            if(cedula.startsWith("V", 0))// charAt(0) == "V")
//                String[] x = getCedula
//            if (x != null) {
//                for (String per : x) {
//                    aux = per.toString();
//                    aModel.addElement(aux);
//                }
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Error en C_Mascota->cargarRazas: "+e);
//        }
//    }
    
}
