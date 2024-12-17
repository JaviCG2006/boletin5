package boletín5;

import java.util.Scanner;

public class Ejercicio2 {
	public static void mostrarnumeros (int inicio, int fin ) {
		if (inicio<fin) {
			for (int i = inicio + 1; i < fin; i++) {
				 System.out.print(i + " ");
				
			}
		} else if (inicio > fin) {
            for (int i = inicio - 1; i > fin; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No hay números entre " + inicio + " y " + fin + ".");
        }
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Números comprendidos entre " + primerNumero + " y " + segundoNumero + ":");
        mostrarnumeros(primerNumero, segundoNumero);
        
        scanner.close();
	}
}
