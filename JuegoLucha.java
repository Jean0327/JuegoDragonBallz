
package DragonBall;

import java.util.Scanner;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;
    private Scanner scanner;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.scanner = new Scanner(System.in);
    }

    public void seleccionarTransformaciones() {
        System.out.println("Selecciona la transformacion de " + jugador1.getNombre() + " (Base/SSJ1/SSJ2/SSJ3):");
        String forma1 = scanner.nextLine().toUpperCase();
        jugador1.transformar(forma1);
        
        System.out.println("Selecciona la transformacion de " + jugador2.getNombre() + " (Base/SSJ1/SSJ2/SSJ3):");
        String forma2 = scanner.nextLine().toUpperCase();
        jugador2.transformar(forma2);
    }
    public void seleccionarTransformaciones1() {
    System.out.println("Selecciona la transformacion de " + jugador1.getNombre() + ":");
    switch (jugador1.getNombre().toLowerCase()) {
        case "freezer":
            System.out.println("(Base/Mecha/Black/Golden):");
            break;
        case "goku":System.out.println("(Base/SSJ3/SSD/Ultra):");
            break;
        case "vegeta":
            System.out.println("(Base/SSJ1/Ultra/SSB):");
            break;
        case "gohan":
            System.out.println("(Base/SSJ1/SSJ2/Ultimate):");
            break;
        case "gotenks":
            System.out.println("(Base/SSJ1/SSJ2/SSJ3):");
            break;
        default:
            System.out.println("(Base):");  // Transformación genérica para otros personajes
            break;
    }
    String forma1 = scanner.nextLine().toUpperCase();
    jugador1.transformar(forma1);

    System.out.println("Selecciona la transformacion de " + jugador2.getNombre() + ":");
    switch (jugador2.getNombre().toLowerCase()) {
        case "freezer":
            System.out.println("(Base/Mecha/Black/Golden):");
            break;
        case "goku":System.out.println("(Base/SSJ3/SSD/Ultra):");
            break;
        case "vegeta":
            System.out.println("(Base/SSJ1/Ultra/SSB):");
            break;
        case "gohan":
            System.out.println("(Base/SSJ1/SSJ2/Ultimate):");
            break;
        case "gotenks":
            System.out.println("(Base/SSJ1/SSJ2/SSJ3):");
            break;
        default:
            System.out.println("(Base):");  // Transformación genérica para otros personajes
            break;
    }
    String forma2 = scanner.nextLine().toUpperCase();
    jugador2.transformar(forma2);
}



    public void iniciarPelea() throws InterruptedException {
        System.out.println("¡Comienza la batalla entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!");
        seleccionarTransformaciones1();

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            mostrarEstado();
            realizarTurno(jugador1, jugador2);
            Thread.sleep(3000);  // Simula tiempo del golpe.
            
            if (!jugador2.estaVivo()) {
                System.out.println("¡" + jugador1.getNombre() + " ha ganado!");
                break;
            }

            mostrarEstado();
            realizarTurno(jugador2, jugador1);
            Thread.sleep(3000);  // Simula tiempo del golpe.
            
            if (!jugador1.estaVivo()) {
                System.out.println("¡" + jugador2.getNombre() + " ha ganado!");
                break;
            }
        }
        
        scanner.close();
    }

    private void mostrarEstado() {
        System.out.println("\n--- Estado actual ---");
        System.out.println(jugador1.getNombre() + " - HP: " + jugador1.getPuntosVida() + 
                         " - Forma: " + jugador1.getTransformacionActual());
        System.out.println(jugador2.getNombre() + " - HP: " + jugador2.getPuntosVida() + 
                         " - Forma: " + jugador2.getTransformacionActual());
    }

    private void realizarTurno(Personaje atacante, Personaje defensor) {
        System.out.println("\nTurno de " + atacante.getNombre());
        atacante.atacar(defensor);
    }
}
