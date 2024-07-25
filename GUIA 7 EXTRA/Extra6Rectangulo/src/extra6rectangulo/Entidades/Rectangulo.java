package extra6rectangulo.Entidades;
public class Rectangulo {
    public double lado1;
    public double lado2;
    public Rectangulo() {
    }
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double calcular_area(){
        double area = (lado1 * lado2) / 2;
        return area;
    }
}