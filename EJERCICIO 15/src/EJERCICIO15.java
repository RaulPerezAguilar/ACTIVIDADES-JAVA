import java.util.Scanner;

public class EJERCICIO15 {

    public static void main(String[] args) {
        // Solicitar un número decimal al usuario
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar un número decimal al usuario
            System.out.print("Introduce un número decimal: ");
            double numeroDecimal = scanner.nextDouble();
            // Redondear el número al entero más cercano
            long numeroRedondeado = Math.round(numeroDecimal);
            // Mostrar el número redondeado
            System.out.println("El número redondeado es: " + numeroRedondeado);
            // Cerrar el scanner
        }
    }
}
