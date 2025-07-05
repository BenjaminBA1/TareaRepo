/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarearepo;

import java.util.Scanner;

/**
 *
 * @author benal
 */
public class TareaREPO {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducción
        System.out.println("========================================");
        System.out.println("    Bienvenido al programa Contador ");
        System.out.println("   Este programa te pedira un numero");
        System.out.println("y luego contara desde 1 hasta ese numero.");
        System.out.println("=========================================\n");

        // Entrada del usuario
        System.out.print("Por favor, ingresa un numero entero positivo: ");
        int numero = scanner.nextInt();

        // Validación simple
        if (numero <= 0) {
            System.out.println("El numero debe ser mayor que cero.");
        } else {
            // Contador
            System.out.println("\nContando del 1 al " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
    
}
