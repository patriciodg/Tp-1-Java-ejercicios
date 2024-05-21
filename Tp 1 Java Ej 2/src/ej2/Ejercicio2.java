package ej2;

public class Ejercicio2 {

	public static void main(String[] args) {
		int x;
		for (x = 50; x <= 100; x++) {
            if (esPrimo(x)) {
                System.out.println(x + " primo");
            } else {
                System.out.print(x + " divisores: ");
                for (int y = 1; y <= x / 2; y++) {
                    if (x % y == 0) {
                        System.out.print(y + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static boolean esPrimo(int num) {
    	int y;
        if (num <= 1) {
            return false;
        }
        for (y = 2; y <= num-1; y++) {
            if (num % y == 0) {
                return false;
            }
        }
        return true;
    }

}
