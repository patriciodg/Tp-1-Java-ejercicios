package ej4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear una lista de alumnos
        List<String> alumnos = new ArrayList<>();
        alumnos.add("Joaquin fernandez");
        alumnos.add("Matias casa");
        alumnos.add("Tiziano martinez");
        alumnos.add("Angela white");

        //Uso del for-each para recorrer la lista de alumnos
        for (String Alumno : alumnos) {
            // Imprimir cada alumno de la lista
            System.out.println(Alumno);
        }
    }
}

/*
Este programa basicamente crea una lista de alumnos y despues agrega 
algunos alumnos y luego los imprime usando un for-each para recorrer
la lista.

*/
