/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class SucesionDeFibonacci {
    public static void main(String[] args){
        long[] sucesion = new long[50];

        sucesion[0] = 0;
        sucesion[1] = 1;

        fibonacci(sucesion);

        for(long num : sucesion){
            System.out.println(num);
        }

    }

    public static void fibonacci(long[] sucesion){
        for (int i = 2; i < 50; i++) {
            sucesion[i] = sucesion[i - 1] + sucesion[i - 2];
        }
    }
}
