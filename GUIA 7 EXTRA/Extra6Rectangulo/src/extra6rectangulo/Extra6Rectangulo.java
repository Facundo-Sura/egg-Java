package extra6rectangulo;
import extra6rectangulo.Entidades.Rectangulo;
public class Extra6Rectangulo {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        rec.setLado1(4);
        rec.setLado2(6);
        System.out.println("El area del rectángulo es: " + rec.calcular_area());
    }
}