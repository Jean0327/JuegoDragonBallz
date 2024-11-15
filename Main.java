package DragonBall;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Personaje goku = new Goku();
        Personaje vegeta = new Vegeta();
        Personaje gohan = new Gohan();
        Personaje freezer = new Freezer();
        Personaje gotenks = new Gotenks();

        Personaje[] personajes = {goku, vegeta, gohan, freezer, gotenks};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona el primer personaje:");
        mostrarOpciones(personajes);
        int seleccion1 = obtenerSeleccion(scanner, personajes.length);

        System.out.println("Selecciona el segundo personaje (diferente al primero):");
        mostrarOpciones(personajes);
        int seleccion2;
        do {
            seleccion2 = obtenerSeleccion(scanner, personajes.length);
            if (seleccion2 == seleccion1) {
                System.out.println("El segundo personaje debe ser diferente al primero. Intenta de nuevo.");
            }
        } while (seleccion2 == seleccion1);

        Personaje jugador1 = personajes[seleccion1];
        Personaje jugador2 = personajes[seleccion2];
        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();
        scanner.close();
    }

    private static void mostrarOpciones(Personaje[] personajes) {
        for (int i = 0; i < personajes.length; i++) {
            System.out.println((i + 1) + ". " + personajes[i].getNombre());
        }
    }

    private static int obtenerSeleccion(Scanner scanner, int maxOpciones) {
        int seleccion = -1;
        while (seleccion < 1 || seleccion > maxOpciones) {
            System.out.print("Selecciona una opcion (1-" + maxOpciones + "): ");
            if (scanner.hasNextInt()) {
                seleccion = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
        return seleccion - 1;
    }
}
