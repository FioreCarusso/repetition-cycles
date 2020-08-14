package ar.com.ada.online.second.repetitioncycles;
/*Realice un algoritmo para obtener una matriz como el resultado de la suma de dos
matrices de orden M x N*/

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Ingrese la cantidad de filas, seguido la cantidad de columnas");
        int row = scan.nextInt();
        int columns = scan.nextInt();


        int[][] matrizA = new int[row][columns];
        int[][] matrizB = new int[row][columns];
        int[][] matrizC = new int[row][columns];

        System.out.println("INGRESO DE VALORES");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.printf("En la posicion %d: %d de la 'Matriz A'\n", i + 1, j + 1);
                matrizA[i][j] = scan.nextInt();
                System.out.printf("En la posicion %d: %d de la 'Matriz B'\n", i + 1, j + 1);
                matrizB[i][j] = scan.nextInt();
            }


        }
        System.out.println("La suma de la matrices da como resultado una tercera, MatrizC C\nsus valores son:");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.printf("en la posicion %d:%d = %d\n", i + 1, j + 1, matrizC[i][j]);
            }
        }

    }

}

