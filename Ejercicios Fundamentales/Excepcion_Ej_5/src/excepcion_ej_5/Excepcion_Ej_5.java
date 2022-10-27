package excepcion_ej_5;

import java.util.Scanner;

public class Excepcion_Ej_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 y 5");
        int intentos = 0;
        int adivinar = 1 + (int) (Math.random() * 5);
        int numero = 6;
        while (true) {
            System.out.println("Intentos: " + intentos);
            System.out.println("Ingrese un numero");

            try {
                numero = Integer.parseInt(scanner.nextLine());
                if (adivinar > numero) {
                    System.out.println("El numero para adivinar es mayor a " + numero);

                } else if (adivinar < numero) {
                    System.out.println("El numero para adivinar es menor a " + numero);

                }
            } catch (Exception e) {
                System.out.println("No ingreso un numero sino una letra");
            }
            intentos++;
            if (numero == adivinar) {
                break;
            }
        }
        System.out.println("FELICITACIONES");
        System.out.println("Lo adivino en " + intentos + " intentos");
    }
}
