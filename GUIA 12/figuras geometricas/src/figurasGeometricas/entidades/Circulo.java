package figurasGeometricas.entidades;

import figurasGeometricas.interfaces.calculoFormas;

public final class Circulo implements calculoFormas {

    protected double radio;

    protected double diametro;

    public Circulo() {}

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void Area() {

        double area = Math.pow(radio, 2) * Math.PI;

        System.out.println("El Área de su círculo es: " + area);

    }

    @Override
    public void Perimetro() {

        double perimetro = (Math.PI * this.diametro);

        System.out.println("El Perímetro de su círculo es: " + perimetro);

    }
}