package boletín5;

import java.util.Scanner;

public class Ejercicio5 {

    public static boolean vocal(char letra) {
        letra = Character.toLowerCase(letra);
        
        return (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un carácter: ");
        char letra = scanner.next().charAt(0); // Leer el primer carácter

        // Llamar a la función y almacenar el resultado
        boolean resultado = vocal(letra);

        // Mostrar el resultado
        if (resultado) {
            System.out.println("El carácter '" + letra + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + letra + "' no es una vocal.");
        }

        scanner.close();
    }
}