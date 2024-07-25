package g4ej3;
public class G4Ej3 {
    public static void main(String[] args) {
        int[] numeros = {1, 20, 345, 6789, 99999};
        int[] contadorDigitos = new int[6]; // índice 0 es para números de 0 dígitos

        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            int digitos = contarDigitos(num);
            contadorDigitos[digitos]++;
        }

        for (int i = 1; i < contadorDigitos.length; i++) {
            System.out.println("Hay números de dígitos" + contadorDigitos[i] + " " + i);
        }
    }

    public static int contarDigitos(int numero) {
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }
}