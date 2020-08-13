package ar.com.ada.online.second.repetitioncycles;
/*La empresa de transportes “The Big Old” cuenta con N choferes, de los cuales se
conoce su nombre y los kilómetros que conducen durante cada día de la semana, esa
información se guarda en un arreglo de N x 6. Se requiere un algoritmo que capture esa
información y genere un vector con el total de kilómetros que recorrió cada chofer durante la
semana. Al final se debe presentar un reporte donde se muestre el nombre del chofer, los kilómetros
recorridos cada día y el total de éstos, tal y como se muestra en la figura 3.1*/

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese cantidad de choferes");
        int numberOfDrivers = scan.nextInt();

//inicializo variables
        String[] arrayNames = new String[numberOfDrivers];
        int[] totalKm = new int[numberOfDrivers];
        int[][] kilometres = new int[numberOfDrivers][5];

//entrada de datos        

        for (int i = 0; i < numberOfDrivers; i++) {
            System.out.printf("Ingrese el nombre del chofer %d: ", i + 1);
            arrayNames[i] = scan.next();
            for (int j = 0; j < 5; j++) {
                System.out.printf("Ingrese los km recorridos el dia %d : ", j + 1);
                kilometres[i][j] = scan.nextInt();


            }

        }
//calculo el total de kilometros
        for (int i = 0; i < numberOfDrivers; i++) {
            totalKm[i] = 0;
            for (int j = 0; j < 5; j++) {
                totalKm[i] += kilometres[i][j];
            }

        }
        System.out.println("REPORTE DE CHOFERES");
        for (int i = 0; i < numberOfDrivers; i++) {
            System.out.printf("El chofer %s: \n", arrayNames[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("en el dia %d: hizo %d kilometros\n", j+1, kilometres[i][j]);
            }
            System.out.printf("Sumando un total de %d kilometros\n", totalKm[i]);
        }


    }

}




