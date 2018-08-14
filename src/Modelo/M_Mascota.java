package Modelo;

public class M_Mascota {
    private String id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad, codigo;
    private String observaciones;
    private M_Propietario dueno;
    
    public M_Mascota(int codigo, String id, String nombre, String especie, String raza, int edad, String observaciones, M_Propietario dueno) {
        this.codigo = codigo;
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.observaciones = observaciones;
        this.dueno = dueno;
    }
    
    public M_Mascota(int codigo, String id, String nombre, String especie, String raza, int edad, String observaciones) {
        this.codigo = codigo;
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
    
    public M_Propietario getDueno(){
        return dueno;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setDueno(M_Propietario dueno) {
        this.dueno = dueno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String toString(){
        return codigo + " - " + nombre + " - " + especie + " - " + edad + " - " + raza + " - " + observaciones;
    }
    
    public String printNombreID(){
        return codigo + " - " +nombre;
    }
    
     public void actualizar(int codigo, String id, String nombre, String especie, String raza, int edad, String observaciones, M_Propietario dueno) {
        this.codigo = codigo;
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.observaciones = observaciones;
        this.dueno = dueno;
    }
}
