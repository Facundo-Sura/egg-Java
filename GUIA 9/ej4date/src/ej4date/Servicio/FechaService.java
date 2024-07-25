package ej4date.Servicio;
import java.util.Date;
public class FechaService {
    public Date fechaNacimiento(int anio, int mes, int dia){
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return fecha;
    }
    public Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
    public int diferencia(Date fecha1, Date fecha2){
        int anios = (int) ((fecha2.getTime() - fecha1.getTime()) / (1000 * 60 * 60 * 24 * 365.25));
        return anios;
    }
}