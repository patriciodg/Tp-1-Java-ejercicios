package ej3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un numero: ");
            numero = scanner.nextInt();
        } while (!(numero > 100 && esPrimo(numero)));
        
        System.out.println("El numero " + numero + " es mayor a 100 y primo.");
        scanner.close();
    }

    public static boolean esPrimo(int num) {
    	int x;
        if (num <= 1) return false;
        for (x = 2; x <= Math.sqrt(num); x++) {
            if (num % x == 0) 
            	return false;
        }
        return true;
    }
}