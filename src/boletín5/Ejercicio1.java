package boletín5;

import java.util.Scanner;

	public class Ejercicio1{

	    // Definimos la función eco()
	    public static void eco(int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.println("Eco.");
	        }
	    }

	    public static void main(String[] args) {
	        // Creamos un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("¿Cuántas veces quieres que se imprima el mensaje?");
	        int n = scanner.nextInt();
	        

	        eco(n);

	        scanner.close();
	    }
	}