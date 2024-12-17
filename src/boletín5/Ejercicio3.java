package boletín5;

import java.util.Scanner;

public class Ejercicio3 {
	public static void mostrarnum (double rad, double alt, int opcion) {
		double resultado;
		double pi = 3.14;
		double radcuadrado = rad*rad;
	
		if (opcion == 1) {
			resultado = (2*pi) * rad * (alt + rad);
			System.out.print("El radio del cilindro es " + resultado);
		}else if (opcion == 2) {
			resultado = pi * radcuadrado * alt;
			System.out.print("El volumen del cilindro es " + resultado);
		}else {
			System.out.print("Numero incorrecto ");
		}
		
	}
		
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Numero 1 para calcular area ");
        System.out.print("numero 2 para calcular volumen ");
        System.out.print("Introduce el radio del cilindro ");
        int opcion = scanner.nextInt();
        
        System.out.print("Introduce el radio del cilindro ");
        double rad = scanner.nextDouble();
        
        System.out.print("Introduce la altura del cilindro ");
        double alt = scanner.nextDouble();
        
        System.out.println("Números comprendidos entre");
        mostrarnum(rad, alt, opcion);
        scanner.close();
	}
}
