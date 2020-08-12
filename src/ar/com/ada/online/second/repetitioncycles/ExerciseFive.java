package ar.com.ada.online.second.repetitioncycles;

/*Realice un algoritmo que lea un vector de seis elementos e intercambie las posiciones
de sus elementos, de tal forma que el primer elemento pase a ser el último y el último el
primero, el segundo el penúltimo y así sucesivamente, e imprima ese vector. Represéntelo
mediante diagrama de flujo y pseudocódigo.*/

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[6];

        System.out.println("Ingrese los 6 valores del vector");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();

        }
        int j = 0;
        for (int i = 0; i < 2; i++) {
            int aux = array[i];
            array[i] = array[5 - j];
            array[5 - j] = aux;
            j += 1;
        }
        System.out.println("Nuevo orden de los vectores");
        for (int i = 0; i < 6; i++) {
            System.out.println("" + array[i]);

        }

    }
}
