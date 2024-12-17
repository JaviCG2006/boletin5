package boletín5;

import java.util.Scanner;

public class Ejercicio6 {
	public static boolean esPrimo(int num) {
		if (num<2) {
			return false;
		} 
		if (num==2) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		for (int i = 3 ; i <=Math.sqrt(num); i = i + 2) {
			if (num % i==0) {
				return false;
		}
	}
	return true;
}
	public static int contdivisorprimo (int numero) {
		int contprimo=0;
		for (int i =  2 ; i <= numero; i++) {
			if (numero % i==0 && esPrimo(i)) {
				contprimo++;
				
			}
		}
		return contprimo;
	}
	 public static void main(String[] args) {
		 var sc = new Scanner(System.in);
		 System.out.println("Dime un numero para decirte sus divisores primos");
	        int numero = sc.nextInt();
	        int resultado = contdivisorprimo(numero);
	        System.out.println("El número " + numero + " tiene " + resultado + " divisores primos.");
	        sc.close();
	    }
	}
