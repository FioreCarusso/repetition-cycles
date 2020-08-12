package ar.com.ada.online.second.repetitioncycles;
/*Cierta empresa requiere controlar la existencia de diez productos, los cuales se
almacenan en un vector A, mientras que los pedidos de los clientes de estos productos se
almacenan en un vector B. Se requiere generar un tercer vector C con base en los anteriores que
represente lo que se requiere comprar para mantener el stock de inventario, para esto se
considera lo siguiente: si los valores correspondientes de los vectores A y B son iguales se
almacena este mismo valor, si el valor de B es mayor que el de A se almacena el doble de la
diferencia entre B y A, si se da el caso de que A es mayor que B, se almacena B, que indica lo
que se requiere comprar para mantener el stock de inventario*/

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] productStock = new int[4];
        int[] productOrders = new int[4];
        int [] toBuyProducts = new int[4];

        System.out.println("SISTEMA DE CALCULO PARA MANTENER STOCK DE INVENTARIO");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Ingrese el stock del articulo %d: ", i + 1);
            productStock[i] = scan.nextInt();
            System.out.printf("Ingrese los pedidos para el articulo %d: ", i + 1);
            productOrders[i] = scan.nextInt();

            if (productOrders[i] > productStock[i]) {
                toBuyProducts[i] = 2 * (productOrders[i] - productStock[i]);
            } else {
                toBuyProducts[i] = productOrders[i];
            }
        }
        System.out.println("\nORDEN DE COMPRA PARA MANTENER STOCK DE INVENTARIO");

        for (int i = 0; i <4 ; i++) {
            System.out.printf("Para el articulo %d se necesitan comprar %d unidades\n" ,i + 1,toBuyProducts[i]);
        }


    }

}



