/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cri;

/**
 *
 * @author Jhon Edinson R
 */
// Clase Guerrero que hereda de Criatura
    public class Guerrero extends Criatura {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

        //El guerrero ataca con su espada, sin daño adicional
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " ataca con espada a " + objetivo.getNombre());
        objetivo.defender(this.fuerza);
    }

          // El guerrero tiene armadura básica: recibe 2 puntos menos de daño
    @Override
    public void defender(int danio) {
        this.salud -= danio - 2; // armadura básica
        System.out.println(nombre + " bloqueó con escudo. Salud restante: " + salud);
    }
}

