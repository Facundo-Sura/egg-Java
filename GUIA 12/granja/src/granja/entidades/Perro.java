package granja.entidades;
public class Perro extends Animal{

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}