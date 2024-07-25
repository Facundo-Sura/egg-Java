package adopcion.entidades;
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;
    
    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getTamaño() {
        return tamaño;
    }
}