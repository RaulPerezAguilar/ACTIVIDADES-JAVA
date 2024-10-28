package ejercicio.pkg4;

public class EJERCICIO4 {

    public static void main(String[] args) {
        short maxShort = Short.MAX_VALUE; // 32767
        short minShort = Short.MIN_VALUE; // -32768
        
        // Comenzamos con el valor máximo
        short valor = maxShort;

        // Incrementamos el valor para comprobar el comportamiento cíclico
        valor++; // Esto debería llevarlo al mínimo, -32768

        // Verificamos si el valor es el mínimo esperado
        if (valor == minShort) {
            System.out.println("El comportamiento cíclico se verifica: " +
                               "el valor siguiente al máximo es " + valor);
        } else {
            System.out.println("El comportamiento cíclico NO se verifica.");
        }
    }
}

