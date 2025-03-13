/*
*Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
*be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
*el programa dirá cuántas oportunidades quedan y si el número introducido es
*menor o mayor que el número secreto.
*/

import java.util.Scanner;

public class JuegoNumeroAleatorio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100);
        boolean adivinado = false;

        System.out.println(numeroSecreto);

        for(int i = 1; i <= 5; i++){
            System.out.println("Adivina el numero, oportunidad " + i + ": ");
            int numeroUsuario = scanner.nextInt();
            scanner.nextLine();

            if (numeroUsuario > numeroSecreto){
                System.out.println("El numero ingresado es MAYOR");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero ingresado es MENOR");
            } else {
                System.out.println("FELICIDADES HAS GANADO!!");
                System.out.println("El numero secreto era: " + numeroSecreto);
                adivinado = true;
                break;
            }

            if(i == 5 && !adivinado) {
                System.out.println("Has agotado todos tus intentos");
                System.out.println("El numero secreto era: " + numeroSecreto);
            }

            System.out.println(" ");
        }
    }
}
