package extra5empleado.Entidades;
public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    public Empleado() {
    }
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void calcular_aumento(){
        if(edad > 30){
            salario = salario + ((10 * salario) / 100);
        }else if(edad <= 30){
            salario = salario +((5 * salario) / 100);
        }
        System.out.println("Su salario con aumeto es: " + salario);
    }
}