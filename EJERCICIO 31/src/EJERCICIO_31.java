import java.util.Scanner;

public class EJERCICIO_31 {
    
    // Función que imprime "Hola" n veces
    public static void variosSaludos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hola");
        }
    }
    
    public static void main(String[] args) {
        // Invocación de la función con el valor literal 3
        variosSaludos(3);

        try ( // Invocación de la función con una variable leída por teclado
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un número: ");
            int n = scanner.nextInt();
            variosSaludos(n);
            
            // Invocación de la función con el valor doble de n
            variosSaludos(n * 2);
        }
    }
}
