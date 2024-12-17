package boletín5;

import java.util.Scanner;

public class Ejercicio4 {

	    public static int encontrarMaximo(int num1, int num2, int num3) {
	        int maximo = num1; 

	        if (num2 > maximo) {
	            maximo = num2;
	        }
	        if (num3 > maximo) {
	            maximo = num3;
	        }

	        return maximo; 
	    }

	    
	    public static int encontrarMinimo(int num1, int num2, int num3) {
	        int minimo = num1;

	        if (num2 < minimo) {
	            minimo = num2;
	        }
	        if (num3 < minimo) {
	            minimo = num3;
	        }

	        return minimo;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce el primer número: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Introduce el tercer número: ");
	        int num3 = scanner.nextInt();

	        int maximo = encontrarMaximo(num1, num2, num3);
	        int minimo = encontrarMinimo(num1, num2, num3);

	        System.out.println("El máximo de los tres números es: " + maximo);
	        System.out.println("El mínimo de los tres números es: " + minimo);

	        scanner.close();
	    }
	}

