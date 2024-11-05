package ejercicio.pkg12;

import java.util.Scanner;

public class EJERCICIO12 {

    public static void main(String[] args) {
        // Solicitar un valor al usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar un valor al usuario
            System.out.print("Ingrese un valor: ");
            int valor = scanner.nextInt();
            
            // Calcular el valor absoluto usando Math.abs()
            int valorAbsolutoMath = Math.abs(valor);
            System.out.println("El valor absoluto (usando Math.abs) es: " + valorAbsolutoMath);
            
            // Calcular el valor absoluto usando operador ternario
            int valorAbsolutoTernario = (valor < 0) ? -valor : valor;
            System.out.println("El valor absoluto (usando operador ternario) es: " + valorAbsolutoTernario);
        }
    }
}
