package ar.com.ada.online.second.repetitioncycles;
/*En un arreglo se tienen registradas las ventas de cinco empleados durante cinco días de
la semana. Se requiere determinar cuál fue la venta mayor realizada.*/

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] sales = new int[5][5];


        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales.length; j++) {
                System.out.printf("Ingrese las ventas del vendedor %d el dia %d ", i+1 , j+1);
                sales[i][j] = scan.nextInt();

            }

        }
        int mayor = sales[0][0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales.length; j++) {
                if (sales[i][j] > mayor) {
                    mayor = sales[i][j];
                }
            }

        }
        System.out.printf("La venta mayor realizada  de la semana fue de %d " , mayor);
    }
}
