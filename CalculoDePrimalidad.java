import java.util.Scanner;

public class CalculoDePrimalidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número del usuario
        System.out.print("Coloque un número entero: ");
        int n = scanner.nextInt();
        boolean esPrimo = true;

        // Comprobar si el número es menor o igual a 1 (no es primo)
        if (n <= 1) {
            esPrimo = false;
        } else {
            // Comprobar si n es divisible por algún número entre 2 y la raíz cuadrada de n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break; // Salir del bucle si se encuentra un divisor
                }
            }
        }

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
    }
}
