package figurasGeometricas.entidades;

import figurasGeometricas.interfaces.calculoFormas;

public final class Rectangulo implements calculoFormas{

    protected double base;

    protected double altuta;

    public Rectangulo() {}

    public Rectangulo(double base, double altuta) {
        this.base = base;
        this.altuta = altuta;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltuta() {
        return altuta;
    }

    public void setAltuta(double altuta) {
        this.altuta = altuta;
    }

    @Override
    public void Area() {

        double area = (this.altuta * this.base);

        System.out.println("El Área de su Rectángulo es: " + area);

    }

    @Override
    public void Perimetro() {

        double perimetro = (this.base + this.altuta) * 2;

        System.out.println("El Perímetro de su Rectángulo es: " + perimetro);

    }
}