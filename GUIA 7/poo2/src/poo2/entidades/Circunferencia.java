package poo2.entidades;
public class Circunferencia {
    //atributos
    private double radio;
    //constructor
    public Circunferencia(){}
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    //metodos get y set
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    //metodo para crear la circunferencia
    public void crearCircunferencia(double radio){
        this.radio = radio;
    }
    //metodo para calcular el area
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    //metodo para calcular el perimetro
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
