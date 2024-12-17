package boletín5;

import java.util.Scanner;

public class Ejercicio7 {

   
    public static boolean esPrimo(int num) {
        if (num < 2) {  
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {  
            if (num % i == 0) {  
                return false;
            }
        }
        return true;  
    }

    
    public static void divisoresPrimos(int numero) {
        System.out.println("Los divisores primos de " + numero + " son:");
        boolean hayDivisoresPrimos = false;  
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) { 
                System.out.print(i + " "); 
                hayDivisoresPrimos = true; 
            }
        }
        if (!hayDivisoresPrimos) {
            System.out.println("No hay divisores primos.");  
        }
        System.out.println();  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número para mostrar sus divisores primos: ");
        int numero = sc.nextInt();
        divisoresPrimos(numero);  
        sc.close();
    }
}