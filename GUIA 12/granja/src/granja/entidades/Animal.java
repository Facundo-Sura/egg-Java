package granja.entidades;
public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal() {}

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }

     public void Alimentarse() {
        System.out.println("Su alimento es: " + alimento);
    }
}