package boletín5;

import java.util.Scanner;

public class Ejercicio9 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Dime la base");
		 double base = sc.nextDouble();
		 System.out.println("Dime su exponente");
		 int exp = sc.nextInt();
		 
		 double resultadoIterativo = potenciaIterativa(base, exp);
	     System.out.println("Resultado (iterativo): " + base + "^" + exp + " = " + resultadoIterativo);
	     
	     double resultadoRecursivo = potenciaRecursiva(base, exp);
	     System.out.println("Resultado (recursivo): " + base + "^" + exp + " = " + resultadoRecursivo);
		 
	 }
	 public static double potenciaIterativa(double base, int exp) {
		 double resultado = 1;
		 for (int i = 0; i < exp ; i++) {
			 resultado *= base;
	 }
		 return resultado;
}
	 public static double potenciaRecursiva(double base, int exp) {
		 if ( exp == 0) {
			 return 1;
		 } else {
			 return base * potenciaRecursiva(base, exp-1);
		 }
	 }
}