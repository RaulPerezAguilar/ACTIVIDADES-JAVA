import java.util.Scanner;

public class EJERCICIO_20 {
    public static void main(String[] args) {
        // Pedir la nota al usuario
        try ( // Crear un objeto Scanner para leer la entrada
                Scanner sc = new Scanner(System.in)) {
            // Pedir la nota al usuario
            System.out.print("Introduce una nota (0-10): ");
            int nota = sc.nextInt();
            // Evaluar la nota y mostrar el resultado
            if (nota >= 0 && nota <= 4) {
                System.out.println("Insuficiente");
            } else if (nota == 5) {
                System.out.println("Suficiente");
            } else if (nota == 6) {
                System.out.println("Bien");
            } else if (nota == 7 || nota == 8) {
                System.out.println("Notable");
            } else if (nota == 9 || nota == 10) {
                System.out.println("Sobresaliente");
            } else {
                System.out.println("Nota no válida");
            }
            // Cerrar el scanner
        }
    }
}
