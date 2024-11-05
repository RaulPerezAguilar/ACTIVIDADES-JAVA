package ejercicio.pkg13;

public class EJERCICIO13 {

    public static void main(String[] args) {
        
        // 1. Expresión: 10 + 5 * 2 > 20 && 4 == 4
        // Primero se evalúa la multiplicación (5 * 2) debido a la precedencia de los operadores aritméticos, luego la adición (10 + 10) y después la comparación.
        boolean resultado1 = 10 + 5 * 2 > 20 && 4 == 4;
        System.out.println("Resultado de la expresión 1: " + resultado1);
        // Explicación: 5 * 2 = 10, 10 + 10 = 20; 20 > 20 es FALSO, pero 4 == 4 es VERDADERO. El operador && (AND) devuelve FALSO ya que uno de los valores es FALSO.
        
        // 2. Expresión: !(7 + 3 > 10) || 3 * 2 <= 6
        // Primero se evalúa la expresión dentro del paréntesis (7 + 3 > 10) y luego el operador lógico NOT (!), después la multiplicación (3 * 2) y finalmente la comparación (3 * 2 <= 6).
        boolean resultado2 = !(7 + 3 > 10) || 3 * 2 <= 6;
        System.out.println("Resultado de la expresión 2: " + resultado2);
        // Explicación: 7 + 3 = 10, 10 > 10 es FALSO, entonces !FALSO es VERDADERO. 3 * 2 = 6, y 6 <= 6 es VERDADERO. El operador OR (||) devuelve VERDADERO porque al menos uno de los valores es VERDADERO.

        // 3. Expresión: 10 / 2 + 3 * 5 == 19 && TRUE
        // Se evalúa primero la división (10 / 2) y luego la multiplicación (3 * 5) según la precedencia de los operadores aritméticos. Luego la comparación y finalmente el operador lógico AND (&&).
        boolean resultado3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("Resultado de la expresión 3: " + resultado3);
        // Explicación: 10 / 2 = 5, 3 * 5 = 15, 5 + 15 = 20. 20 == 19 es FALSO, y FALSO && VERDADERO es FALSO.

        // 4. Expresión: int x = 5; x += 3 * 2;
        // Se usa el operador de asignación combinado (+=), que primero realiza la operación y luego asigna el valor a la variable.
        int x = 5;
        x += 3 * 2;  // x = x + (3 * 2)
        System.out.println("Resultado de la expresión 4: x = " + x); 
        // Explicación: 3 * 2 = 6, luego x = 5 + 6 = 11. El operador += realiza la suma y asigna el resultado a x.

        // 5. Expresión: boolean b = false; b = !b || 7 % 2 == 1;
        // Primero se evalúa la operación de módulo (7 % 2), luego la negación (!) y la comparación de la expresión booleana.
        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("Resultado de la expresión 5: b = " + b);
        // Explicación: 7 % 2 = 1, !false es verdadero, y verdadero || verdadero es VERDADERO. El valor final de b es VERDADERO.

    }
}
