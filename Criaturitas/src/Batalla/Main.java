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
// Clase principal para probar las batallas entre criaturas
public class Main {
        public static void main(String[] args) {
       // Se crean tres criaturas con nombre, salud y fuerza
        Criatura dragon = new Dragon("Draco", 100, 25);
        Criatura mago = new Mago("Merlín", 80, 20);
        Criatura guerrero = new Guerrero("Ares", 90, 22);
                
  // Batalla entre el dragón y el mago
        Batalla.pelear(dragon, mago);

      // Batalla entre el guerrero y el dragón (si el dragón sigue vivo)
        Batalla.pelear(guerrero, dragon);
    }
}

