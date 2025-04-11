/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cri;

/**
 *
 * @author majin
 */
// Clase Dragon que hereda de Criatura
public class Dragon extends Criatura {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    // Ataque especial del dragón: lanza fuego (daño extra de +10)
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " lanza fuego a " + objetivo.getNombre());
        objetivo.defender(this.fuerza + 10); // fuego aumenta el daño
    }

    // El dragón tiene escamas resistentes: recibe 5 puntos menos de daño
    @Override
    public void defender(int danio) {
        this.salud -= danio - 5;
        System.out.println(nombre + " resistió con escamas. Salud restante: " + salud);
    }
}
