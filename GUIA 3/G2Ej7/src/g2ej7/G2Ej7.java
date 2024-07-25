package g2ej7;

import java.util.Scanner;

public class G2Ej7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correcto = 0, incorrecto = 0;
        while (true){
            System.out.println("Ingrese una cadena:");
            cadena = leer.nextLine();
            if(cadena.equals("&&&&&")){
                break;
            }else if (cadena.length() == 5 && cadena.substring(0) != "X" && cadena.substring(4) != "O"){
                correcto++;
            }else{
                incorrecto++;
            }
        }
        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + correcto);
        System.out.println("Lecturas incorrectas: " + incorrecto);
    }
}