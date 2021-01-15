/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navidad02;
import java.util.Scanner;

/**
 *
 * @author irene
 */
public class Navidad02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Objeto Scanner para poder meter por teclado información.
         * Luego declaramos variables.
         * A continuación ponemos lo System que es lo que vemos por consola.
         */
        Scanner via = new Scanner(System.in);
        int num, cont = 1, suma = 0;

        System.out.println("Escriba 0 para terminar.");
        System.out.print("Inserte el 1º número: ");
        num = via.nextInt();
        /**
         * Bucle while para que si escribimos 0 termine el pograma y no entre en el bucle.
         * Cuando es distindo de 0, entra en el bucle.
         * Va sumando los numeros a la vez que se cuentan cuantos numeros se han introducido.
         * Al final da la cantidad de números intruducidos y la suma de ellos.
         */
        while (num != 0) {
            suma += num;
            cont++;
            System.out.print("Inserte el " + cont + "º número: ");
            num = via.nextInt();
        }
        System.out.println("\tLa cantidad de numeros introducidos es " + --cont);
        if (cont > 1) {
            System.out.println("\tLa suma acumulada de los numeros introducidos es " + suma);
        } else {
            System.out.println("\tNo hay suma porque 0 + 0 es 0.");
        }
        System.out.println(" Ha finalizado el programa.");
    }

}
