package estra2distanciadepuntos.Entidades;
import java.util.Scanner;
public class Puntos {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public Puntos() {
    }
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getY1() {
        return y1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el P1:");
        x1 = leer.nextDouble();
        y1 = leer.nextDouble();
        System.out.println("Ingrese el P2:");
        x2 = leer.nextDouble();
        y2 = leer.nextDouble();
    }
    public void distancia(){
        double d = Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2 - y1),2));
        System.out.print("La disctancia entre P1 y P2 es: " + d);
        System.out.println();
    }
}