/*
¿Es un Anagrama?
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Scanner;


public class Anagrama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloca la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.println("Coloca la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        /*Ya habiendo creadotodo el codigo del modulo esAnagrama lo que hago es verificar si el resultado dio true para
        imprimir el resultado*/
        if (esAnagrama(palabra1, palabra2) == true){
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas");
        }
    }

    public static boolean esAnagrama(String palabra1, String palabra2){
        /* Hago un condicional donde verifico que la cantidad de caracteres de palabra1 y de palabra2 sean iguales, ya
        que si fueran diferentes no serian un anagrama, ademas verifico que la palabra no sea la misma, porque los
        anagramas son un reordenamiento de la palabra inicial
         */
        if(palabra1.length() != palabra2.length() || palabra1.equals(palabra2)){
            return false;
        } else {

        /* Creo un array de enteros, llamado conteoLetras y especifico que va a ser de 256 valores, esto para simular
        el codigo ASCII que es el de que cada tecla tiene un valor numerico, como por ejemplo el alt + 64 para el @ */
        int[] conteoLetras = new int[256];

        /* Tomo el array conteoLetras y especifico que de la palabra1 vamos a tomar el caracter en la posicion i y lo
        vamos a añadir al array, luego va a hacer lo mismo en la palabra 2 solo que ahora en lugar de añadir al array
        elimina cada uno de los valores representativos de cada caracter*/
        for(int i = 0; i < palabra1.length(); i++){
            conteoLetras[palabra1.charAt(i)]++;
            conteoLetras[palabra2.charAt(i)]--;
        }

        /* En este caso recorro el array, verificando que en cada uno de los valores de 0 a 256, la cantidad sea igual
         a 0 para que al agregar y luego restar, se sepa que todas las letras estaban en ambas palabras*/
        for(int i = 0; i < 256; i++){
            if (conteoLetras[0] != 0){
                return false;
            }
        }
        return true;
        }
    }
}
