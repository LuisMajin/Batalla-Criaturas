/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalla;

import Cri.Criatura;
import Cri.Dragon;
import Cri.Guerrero;
import Cri.Mago;

/**
 *
 * @author Jhon Edinson R
 */
public class Main {
        public static void main(String[] args) {
        Criatura dragon = new Dragon("Draco", 100, 25);
        Criatura mago = new Mago("Merlín", 80, 20);
        Criatura guerrero = new Guerrero("Ares", 90, 22);

        Batalla.pelear(dragon, mago);
        Batalla.pelear(guerrero, dragon);
    }
}

