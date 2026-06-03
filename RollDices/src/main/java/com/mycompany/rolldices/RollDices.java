/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldices;

/**
 *
 * @author ASUS
 */
import java.util.*;

public class RollDices {

    // Función que genera un número aleatorio entre 1 y 6
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int vidas = 5;

        int lanzamiento = 1;

        int totalLanzamientos = 0;
        int totalSumasPares = 0;
        int totalSumasImpares = 0;
        int totalDadosIguales = 0;

        int igualesConsecutivos = 0;

        System.out.println("================================================");
        System.out.println("                 THE DICES GAME");
        System.out.println("================================================");
        System.out.println("                     RULES");
        System.out.println("- You start with 5 lives");
        System.out.println("- If the sum of the dice is odd, you lose a life");
        System.out.println("- If you get double 6, you win a life");
        System.out.println("- If you get 3 pairs in a row you win");
        System.out.println("================================================");
 
        
        while (vidas > 0) {
            
            System.out.println("\nPress ENTER to roll the dices");
            teclado.nextLine();

            int dado1 = rollDice();
            int dado2 = rollDice();

            int suma = dado1 + dado2;

            System.out.println("\nRoll " + lanzamiento);
            System.out.println("Dice 1: " + dado1);
            System.out.println("Dice 2: " + dado2);
            System.out.println("Sum of the dices: " + suma);

            totalLanzamientos++;

            // Valido si la suma es par o impar
            if (suma % 2 == 0) {
                totalSumasPares++;
                System.out.println("EVEN SUM !You continue playing! :D ");
            } else {
                totalSumasImpares++;
                vidas--;
                System.out.println("ODD SUM !You lose a life! D: ");
            }

            // Si se obtiene un par de 6 gana una vida
            if (dado1 == 6 && dado2 == 6) {
                vidas++;
                System.out.println("¡DOUBLE 6! ¡You win a life! ");
            }

            // Valido los dados iguales
            if (dado1 == dado2) {
                totalDadosIguales++;
                igualesConsecutivos++;

                System.out.println(
                        "Equal dices. Consecutive: "
                                + igualesConsecutivos);

                if (igualesConsecutivos == 3) {
                    System.out.println("\n===== ¡YOU WIN! =====");
                    break;
                }

            } else {
                igualesConsecutivos = 0;
            }

            System.out.println("Remaining lives: " + vidas);

            if (vidas == 0) {
                System.out.println("\n====== GAME OVER ======");
                break;
            }

            lanzamiento++;
        }

        // Informe final
        System.out.println("\n::::: FINAL REPORT :::::");
        System.out.println("Total rolls: "
                + totalLanzamientos);

        System.out.println("Total even sums: "
                + totalSumasPares);

        System.out.println("Total odd sums: "
                + totalSumasImpares);

        System.out.println("Total equal dices: "
                + totalDadosIguales);
        
        teclado.close();
    }
}

