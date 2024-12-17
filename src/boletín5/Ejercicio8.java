package boletín5;

import java.util.Scanner;

public class Ejercicio8 {
	 public static int divisores(int num) {
		 int suma = 0;
		 for (int i = 1; i<num;i++) {
			 if (num % i == 0) {
				suma = suma + i;
			 }
		 }
		 return suma;
	 }
	 public static boolean sonamigos(int num1 , int num2) {
		 
		 int suma1 = divisores(num1);
		 int suma2 = divisores(num2);
		 
		 return (suma1 == num2) && (suma2 == num1);
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("dime el primer numero");
		 int num1 = sc.nextInt();
		 System.out.println("dime el segundo numero");
		 int num2 = sc.nextInt();
		 
		 
		 if (sonamigos(num1,num2)) {
			 System.out.println("Los numeros " + num1 + " y " + num2 + " son numeros amigos");
		 } else {
			 System.out.println("Los numeros " + num1 + " y " + num2 + " no son numeros amigos");
		 }
		 sc.close();
	 }

}