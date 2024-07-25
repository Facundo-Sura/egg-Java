package adopcion.entidades;
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro perro;
    
    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    
    public void asignarPerro(Perro perro) {
        this.perro = perro;
    }
    
    public String obtenerInformacion() {
        String informacion = "Nombre: " + nombre + "\n";
        informacion += "Apellido: " + apellido + "\n";
        informacion += "Edad: " + edad + "\n";
        informacion += "Documento: " + documento + "\n";
        
        if (perro != null) {
            informacion += "\nInformación del perro:\n";
            informacion += "Nombre: " + perro.getNombre() + "\n";
            informacion += "Raza: " + perro.getRaza() + "\n";
            informacion += "Edad: " + perro.getEdad() + "\n";
            informacion += "Tamaño: " + perro.getTamaño() + "\n";
        }
        
        return informacion;
    }
}