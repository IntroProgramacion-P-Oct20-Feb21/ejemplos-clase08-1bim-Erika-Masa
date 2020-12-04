/*
    El siguiente programa muestra de forma infinita la frase: 1
    Modificar el código para obtener la secuencia
    1
    5
    9
 */
package ejemplosrepaso;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {

    public static void main(String[] args) {
        int contador = 0;
        do {
            System.out.printf("%d\n", contador);
            contador = contador + 5;
        } while (contador <= 30);

    }
}
