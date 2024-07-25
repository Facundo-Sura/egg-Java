package g8ej2cafetera;
import g8ej2cafetera.entidades.Cafetera;
import g8ej2cafetera.servicio.CafeteraServicio;
public class G8ej2Cafetera {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
       CafeteraServicio orden = new CafeteraServicio();
       orden.llenarCafetera(cafetera);
       orden.servirTaza(cafetera);
       orden.vaciarCafetera(cafetera);
       orden.agregarCafe(cafetera);
    }   
}