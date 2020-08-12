package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

/*Realice un algoritmo que calcule el producto de dos vectores. Uno de ellos es de una fila
con diez elementos y el otro con una columna de diez elementos.*/
public class ExerciseFifteenProp {

    public static void main(String[] args) {

        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        int[] arrayC = new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese los cinco valores del arreglo A ");

        for (int i = 0; i < 5; i++) {
            arrayA[i] = scan.nextInt();
        }
        System.out.println("Ingrese los cinco valores del arreglo B ");

        for (int i = 0; i < arrayB.length; i++) {

            arrayB[i] = scan.nextInt();
        }

        System.out.printf("El resultado de la multiplicacion es de:\n");
        for (int i = 0; i < 5; i++) {
            arrayC[i] = arrayA[i] * arrayB[i];
            System.out.printf("en la posicion %d : %d \n", i, arrayC[i]);
        }
    }
}

