/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cri;

/**
 *
 * @author Jhon Edinson R
 */
// Clase Mago que hereda de Criatura
    public class Mago extends Criatura {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }
        
 // El mago ataca con hechizos
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre());
        objetivo.defender(this.fuerza + 5);
    }

        // El mago no tiene defensa especial, recibe el daño completo
    
    @Override
    public void defender(int danio) {
        this.salud -= danio;
        System.out.println(nombre + " fue golpeado por magia. Salud restante: " + salud);
    }
}



