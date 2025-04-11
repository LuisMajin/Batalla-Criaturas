/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalla;

import Cri.Criatura;

/**
 *
 * @author majin
 */

public class Batalla {
    public static void pelear(Criatura c1, Criatura c2) {
        System.out.println("¡Comienza la batalla entre " + c1.getNombre() + " y " + c2.getNombre() + "!\n");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (!c2.estaViva()) break;
            c2.atacar(c1);
        }

        System.out.println("\nResultado:");
        if (c1.estaViva()) {
            System.out.println(c1.getNombre() + " gana la batalla");
        } else {
            System.out.println(c2.getNombre() + " gana la batalla");
        }
    }
}

