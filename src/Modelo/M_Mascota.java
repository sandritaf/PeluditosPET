package Modelo;

public class M_Mascota {
    String nombre;
    String especie;
    String raza;
    int edad;
    String observaciones;
    M_Propietario dueno;

    public M_Mascota(String nombre, String especie, String raza, int edad, String observaciones, M_Propietario dueno) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.observaciones = observaciones;
        this.dueno = dueno;
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

    public M_Propietario getDueno() {
        return dueno;
    }

    public void setDueno(M_Propietario dueno) {
        this.dueno = dueno;
    }
    
    
}
