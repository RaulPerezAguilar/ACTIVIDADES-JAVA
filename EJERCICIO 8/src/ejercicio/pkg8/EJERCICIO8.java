package ejercicio.pkg8;

public class EJERCICIO8 {

    public static void main(String[] args) {
        // Operaciones lógicas y sus resultados
        boolean resultado1 = (3 <= 5 && 2 == 2); // true
        boolean resultado2 = (3 <= 5 && 2 > 10); // false
        boolean resultado3 = (1 != 2 || 5 < 3);  // true
        boolean resultado4 = !(1 < 2);            // false

        // Mostrar los resultados
        System.out.println("3 <= 5 && 2 == 2: " + resultado1);
        System.out.println("3 <= 5 && 2 > 10: " + resultado2);
        System.out.println("1 != 2 || 5 < 3: " + resultado3);
        System.out.println("!(1 < 2): " + resultado4);
    }
}
