package ruleta.rusa.entidades;
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public String getNombre() {
        return nombre;
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverDeAgua r) {
        System.out.println(nombre + " se apunta y aprieta el gatillo.");
        if (r.mojar()) {
            System.out.println("¡" + nombre + " se mojó!");
            mojado = true;
            return true;
        } else {
            System.out.println(nombre + " se salvó.");
            r.siguienteChorro();
            return false;
        }
    }

    public boolean estaMojado() {
        return mojado;
    }
}