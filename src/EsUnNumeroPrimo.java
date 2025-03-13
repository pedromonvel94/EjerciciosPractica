/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

import java.util.ArrayList;

public class EsUnNumeroPrimo {
    public static void main(String[] args){
        ArrayList<Integer> primos = new ArrayList<Integer>();

        for(int i = 2; i <= 100; i++){
            if(esPrimo(i) == true){
                primos.add(i);
            }
        }

        System.out.println(primos);
    }

    public static boolean esPrimo(int numero){
        if(numero < 2){
            return false;
        }

        for(int i = 2; i * i <= numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

}
