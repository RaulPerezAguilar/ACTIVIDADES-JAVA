package ejercicio.pkg9;

import java.util.Scanner;

public class EJERCICIO9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.print("¿Está lloviendo? (true/false): ");
        boolean estaLloviendo = scanner.nextBoolean();

        System.out.print("¿Has terminado tus tareas? (true/false): ");
        boolean haTerminadoTareas = scanner.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean necesitaIrBiblioteca = scanner.nextBoolean();

        // Determinar si se puede salir a la calle
        boolean puedeSalir = (!estaLloviendo && haTerminadoTareas) || necesitaIrBiblioteca;

        // Mostrar el resultado
        System.out.println("¿Puedes salir a la calle? " + puedeSalir);
    }
}
