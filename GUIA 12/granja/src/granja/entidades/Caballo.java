package granja.entidades;
public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

}