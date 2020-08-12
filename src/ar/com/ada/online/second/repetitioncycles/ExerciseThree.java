package ar.com.ada.online.second.repetitioncycles;
/*Se tienen los nombres de los N alumnos de una escuela, además de su promedio
general. Realice un algoritmo para capturar esta información, la cual se debe almacenar en
arreglos, un vector para el nombre y otro para el promedio, después de capturar la información
se debe ordenar con base en su promedio, de mayor a menor, los nombres deben corresponder
con los promedios*/


import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfStudents;
        String auxNames;
        double auxGenAverage;

        System.out.println("Ingrese la cantidad de estudiantes");
        numberOfStudents = scan.nextInt();

        String[] arrayOfNames = new String[numberOfStudents];
        double[] arrayOfAverage = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Ingrese el nombre del alumno");
            arrayOfNames[i] = scan.next();
            System.out.println("Ingrese promedio del alumno");
            arrayOfAverage[i] = scan.nextDouble();

        }

        //ordenamiento de los promedios de mayor a menor, correspondiendo los nombres

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = i + 1; j < numberOfStudents; j++) {

                if (arrayOfAverage[j] > arrayOfAverage[i]) {

                    auxGenAverage = arrayOfAverage[i];
                    arrayOfAverage[i] = arrayOfAverage[j];
                    arrayOfAverage[j] = auxGenAverage;

                    auxNames = arrayOfNames[i];
                    arrayOfNames[i] = arrayOfNames[j];
                    arrayOfNames[j] = auxNames;

                }
            }
        }

        System.out.println("Promedios de los alumnos ordenado de mayor a menor");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("\nEl alumno %s tiene un promedio de %.2f", arrayOfNames[i], arrayOfAverage[i]);
        }

    }
}
