package ej1frase.servicio;
import ej1frase.entidades.Cadena;
public class CadenaServicio {
    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char c = cadena.getFrase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales");
    }
    public void invertirFrase(Cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());
        String fraseInvertida = sb.reverse().toString();
        System.out.println(fraseInvertida);
    }
    public void vecesRepetido(Cadena cadena, String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i) == letra) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces");
    }
    public void compararLongitud(Cadena cadena, String frase) {
        int longitud = frase.length();
        if (cadena.getLongitud() > longitud) {
            System.out.println("La frase ingresada es más corta");
        } else if (cadena.getLongitud() < longitud) {
            System.out.println("La frase ingresada es más larga");
        } else {
            System.out.println("Las frases tienen la misma longitud");
        }
    }
    public void unirFrases(Cadena cadena, String frase) {
        String fraseUnida = cadena.getFrase() + " " + frase;
        System.out.println(fraseUnida);
    }
    public void reemplazar(Cadena cadena, char letra, char reemplazo) {
        String fraseReemplazada = cadena.getFrase().replace(letra, reemplazo);
        System.out.println(fraseReemplazada);
    }
    public boolean contiene(Cadena cadena, char letra) {
        return cadena.getFrase().indexOf(letra) != -1;
    }
}