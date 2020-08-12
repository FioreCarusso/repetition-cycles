package ar.com.ada.online.second.repetitioncycles;
/*Se requiere obtener la suma de las cantidades contenidas en un arreglo de 10
elementos.*/

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {

        int sumOfNumbers = 0;
        int[] array = new int[10];          //declaracion e inicializacion de vector

        System.out.println("Ingrese los 10 valores del vector");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            sumOfNumbers += array[i];
        }
        System.out.printf("La suma de los elementos del vector es %d", sumOfNumbers);

    }
}
