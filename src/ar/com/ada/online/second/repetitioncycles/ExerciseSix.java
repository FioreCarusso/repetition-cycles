package ar.com.ada.online.second.repetitioncycles;
/*Se requiere determinar cuántos ceros se encuentran en un arreglo de cuatro renglones y
cuatro columnas, las cuales almacenan valores comprendidos entre 0 y 9.*/

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int zeroCounter = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Ingrese el valor para la matriz en la posicion %d y %d \n", i, j);
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    zeroCounter += 1;                    //por cada cero encontrado se asigna 1 al contador
                }
            }
        }

        System.out.printf("La cantindad de ceros en la matriz es: %d", zeroCounter);
    }
}
