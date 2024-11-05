
package ejercicio.pkg11;

import java.util.Scanner;

public class EJERCICIO11 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese dos números
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese dos números
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();
            
            // Usar el operador ternario para encontrar el mayor
            int mayor = (num1 > num2) ? num1 : num2;
            
            // Mostrar el resultado
            System.out.println("El mayor de los dos números es: " + mayor);
        }
    }
}
