package g4ej6;
import java.util.Scanner;
public class G4Ej6 {
    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        // Pedir al usuario que ingrese los valores del cuadrado
        System.out.println("Ingrese los valores del cuadrado mágico 3 x 3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i+1) + ", Columna " + (j+1) + ": ");
                int valor = sc.nextInt();
                // Verificar que el valor ingresado está entre 1 y 9
                if (valor < 1 || valor > 9) {
                    System.out.println("El valor debe estar entre 1 y 9. Intente de nuevo.");
                    j--;
                    continue;
                }
                cuadrado[i][j] = valor;
            }
        }
        // Calcular la suma de la primera fila, para comparar con las demás sumas
        for (int j = 0; j < 3; j++) {
            suma += cuadrado[0][j];
        }
        // Verificar las filas
        for (int i = 1; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila != suma) {
                System.out.println("El cuadrado no es mágico.");
                return;
            }
        }
        // Verificar las columnas
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna += cuadrado[i][j];
            }
            if (sumaColumna != suma) {
                System.out.println("El cuadrado no es mágico.");
                return;
            }
        }
        // Verificar las diagonales
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if (sumaDiagonal1 != suma || sumaDiagonal2 != suma) {
            System.out.println("El cuadrado no es mágico.");
            return;
        }
        // Si llegamos hasta aquí, el cuadrado es mágico
        System.out.println("El cuadrado es mágico!");
    }
}