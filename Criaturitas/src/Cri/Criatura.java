/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cri;

/**
 *
 * @author majin
 */
// Clase base abstracta para cualquier tipo de criatura
public abstract class Criatura {
    protected String nombre;  // Nombre de la criatura
    protected int salud;      // Puntos de salud de la criatura
    protected int fuerza;     // Nivel de fuerza de la criatura

    // Constructor para inicializar los atributos
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    // Métodos abstractos que deben ser implementados por cada criatura concreta
    public abstract void atacar(Criatura objetivo); // Define cómo ataca
    public abstract void defender(int danio);       // Define cómo se defiende

    // Método que retorna si la criatura sigue con vida
    public boolean estaViva() {
        return salud > 0;
    }

    // Métodos Getters y Setters
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getFuerza() { return fuerza; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setSalud(int salud) { this.salud = salud; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }
}
