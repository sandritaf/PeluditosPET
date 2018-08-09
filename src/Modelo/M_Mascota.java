package Modelo;

public class M_Mascota {
    String id;
    String nombre;
    String especie;
    String raza;
    int edad;
    String observaciones;

    public M_Mascota(String id, String nombre, String especie, String raza, int edad, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.observaciones = observaciones;
    }
    
    public M_Mascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

       public String toString(){
        return id + " - " + nombre + " - " + especie + " - " + edad + " - " + raza + " - " + observaciones;
    }
}
