package eje5.servicio;

import eje5.entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PaisServicio {
    private Scanner leer;
    private LinkedHashSet<String> paises;
    public PaisServicio(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new LinkedHashSet();
    }
    
    // agregamos paises y mostrar paises
    
    public void agregarPaises() {
        String pais;
        String respuesta;
        do{
            System.out.println("Ingrese el País:");
            pais = leer.nextLine();
            paises.add(pais);
            System.out.println("¿Desea agregar otro País? (S/N)");
            respuesta = leer.nextLine();
        }while (respuesta.equalsIgnoreCase("S"));
        System.out.println("Los paises agregados son: " + paises);
    }
    
    // ordenar los paises alfabeticamente
    
    public void ordenarAlfabeticamene() {
        ArrayList<String> paisesLista = new ArrayList (paises);
        Collections.sort(paisesLista);
        System.out.println("Paises ordenados alfabeticamente:" + paisesLista.toString());
    }
    
    // elegimos un pais para eliminar de la lista
     
    public void eliminarPais() {
        Iterator<String> it2  = paises.iterator();
        System.out.println("Ingrese el país que quiere elimianr:");
        String pais = leer.next();
        while (it2.hasNext()){
            if(it2.next().equals(pais)){
                it2.remove();
            }
        }
        System.out.println("La lista actualizada es: " + paises);
    }
}