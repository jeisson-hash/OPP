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

        int vidas = 5;

        int lanzamiento = 1;

        int totalLanzamientos = 0;
        int totalSumasPares = 0;
        int totalSumasImpares = 0;
        int totalDadosIguales = 0;

        int igualesConsecutivos = 0;

        System.out.println("----- THE DICES GAME -----");

        while (vidas > 0) {

            int dado1 = rollDice();
            int dado2 = rollDice();

            int suma = dado1 + dado2;

            System.out.println("\nLanzamiento " + lanzamiento);
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Suma: " + suma);

            totalLanzamientos++;

            // Validar si la suma es par o impar
            if (suma % 2 == 0) {
                totalSumasPares++;
                System.out.println("Suma PAR ¡Continuas jugando! :D ");
            } else {
                totalSumasImpares++;
                vidas--;
                System.out.println("Suma IMPAR ¡Pierdes una vida! D: ");
            }

            // Si obtiene un par de 6 gana una vida
            if (dado1 == 6 && dado2 == 6) {
                vidas++;
                System.out.println("¡Doble 6! ¡Ganas una vida! ");
            }

            // Validar dados iguales
            if (dado1 == dado2) {
                totalDadosIguales++;
                igualesConsecutivos++;

                System.out.println(
                        "Dados iguales. Consecutivos: "
                                + igualesConsecutivos);

                if (igualesConsecutivos == 3) {
                    System.out.println("\n***** ¡YOU WIN! *****");
                    break;
                }

            } else {
                igualesConsecutivos = 0;
            }

            System.out.println("Vidas restantes: " + vidas);

            if (vidas == 0) {
                System.out.println("\n***** GAME OVER *****");
                break;
            }

            lanzamiento++;
        }

        // Informe final
        System.out.println("\n----- INFORME FINAL -----");
        System.out.println("Total lanzamientos: "
                + totalLanzamientos);

        System.out.println("Total sumas pares: "
                + totalSumasPares);

        System.out.println("Total sumas impares: "
                + totalSumasImpares);

        System.out.println("Total dados iguales: "
                + totalDadosIguales);
    }
}
