/*
* Para generar valores aleatorios utilizaremos Math.random().
* Genera un número con decimales (de tipo double) en el intervalo [0 - 1)
*/

//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
//también la suma total (los puntos que suman entre los tres dados).

public class NumerosAleatorios {
    public static void main(String[] args){

        int sumaDados = 0;

        for(int i = 1; i < 4; i++){
            double dado1 = (int)(Math.random() * 6) + 1;

            System.out.println("Dado" + " " + i + ": " + dado1);

            sumaDados += dado1;
        }

        System.out.println(sumaDados);

    }
}
