/*
* Para generar valores aleatorios utilizaremos Math.random().
* Genera un número con decimales (de tipo double) en el intervalo [0 - 1)
*/



public class NumerosAleatorios {
    public static void main(String[] args){

        //Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
        //también la suma total (los puntos que suman entre los tres dados).

        System.out.println("Ejercicio 1: suma de dados");

        int sumaDados = 0;

        for(int i = 1; i < 4; i++){
            double dado1 = (int)(Math.random() * 6) + 1;

            System.out.println("Dado" + " " + i + ": " + dado1);

            sumaDados += dado1;
        }

        System.out.println(sumaDados);

        System.out.println(" ");

        /*
        * Realiza un programa que muestre al azar el nombre de una carta de la baraja
        francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
        y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
        numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
        1). Para convertir un número en una cadena de caracteres podemos usar
        String.valueOf(n).
        * */

        System.out.println("Ejercicio 2: carta al azar baraja francesa");

        int numeroPaloBaraja = (int)(Math.random() * 4) + 1;
        int cartaMostrada = (int)(Math.random() * 13) + 1;
        String numeroCarta;
        String paloBaraja = "";

        switch (numeroPaloBaraja){
            case 1 :
                paloBaraja = "de Pica";
                break;
            case 2 :
                paloBaraja = "de Corazones";
                break;
            case 3 :
                paloBaraja = "de Diamantes";
                break;
            case 4 :
                paloBaraja = "de Treboles";
                break;
            default:
                System.out.println("se presenta un error en el codigo.");
                break;
        }

        if(cartaMostrada == 11){
            numeroCarta = "J";
        } else if (cartaMostrada == 12){
            numeroCarta = "Q";
        } else if (cartaMostrada == 13){
            numeroCarta = "K";
        } else if (cartaMostrada == 1){
            numeroCarta = "As";
        }else {
            numeroCarta = String.valueOf(cartaMostrada);
        }

        System.out.println("La carta que salio es: " + numeroCarta + " " + paloBaraja);

        System.out.println(" ");

        /*
        * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
        * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
        */

        System.out.println("Ejercicio 3: carta al azar baraja española");

        String[] numeroDeCarta = {"As", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey" };
        String[] paloDeBaraja = {"de Picas", "de Corazones", "de Diamantes", "de Tréboles"};

        int paloCarta = (int)(Math.random() * 3);
        int numCarta = (int)(Math.random() * 9);

        System.out.println("La carta que salio es: " + numeroDeCarta[numCarta] + " " + paloDeBaraja[paloCarta]);

        System.out.println(" ");
    }
}
