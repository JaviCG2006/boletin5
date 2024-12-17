package boletín5;


import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int n = sc.nextInt();
		System.out.println("El fibonaci("+n+") es " + fibonacci(n));
		sc.close();
	}
	public static long fibonacci(int n) {
		long result = 0;
		if (n==0 || n==1) {
			result = 1;
		} else {
			result = fibonacci(n-1) + fibonacci(n-2);
		}
		return result;
	}
}
