package poo4.Entidades;
public class Rectangulo {
    //Atributos
    private double base;
    private double altura;
    //Métodos
    public Rectangulo() {
    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularSuperficie(){
        return base * altura;
    }
    public double calcularPerimetro(){
        return (base * altura) * 2;
    }
    public void dibujarRectangulo(){
        for (int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}