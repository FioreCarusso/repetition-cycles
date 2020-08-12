package ar.com.ada.online.second.repetitioncycles;
/*Se requiere un algoritmo para obtener un vector (C) de N elementos que contenga la
suma de los elementos correspondientes de otros dos vectores (A y B)*/

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cantidad de elementos para los vectores");
        int numberOfElements = scan.nextInt();

        int[] arrayA = new int[numberOfElements];
        int[] arrayB = new int[numberOfElements];
        int[] arrayC = new int[numberOfElements];

        System.out.println("Ingrese el valor para los elementos");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.printf("En la posicion %d del Array 'A'", i);
            arrayA[i] = scan.nextInt();
            System.out.printf("En la posicion %d del Array 'B'", i);
            arrayB[i] = scan.nextInt();
        }

        System.out.println("La suma del vector A y B da como resultado un tercer vector C\nsus valores son:");
        for (int i = 0; i < numberOfElements; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
            System.out.printf("en la posicion %d: %d\n", i, arrayC[i]);
        }

    }


}

