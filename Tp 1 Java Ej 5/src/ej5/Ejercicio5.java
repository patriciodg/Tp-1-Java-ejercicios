package ej5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        
        do {
            System.out.print("Introduzca el primer numero: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Introduzca el segundo numero: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Introduzca la operacion (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);
            
            double resultado = 0;
            boolean operacionValida = true;
            
            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: Division por cero.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operacion no válida.");
                    operacionValida = false;
            }
            
            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
            
            System.out.print("¿Desea realizar otra operacion? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        scanner.close();
    }
}
