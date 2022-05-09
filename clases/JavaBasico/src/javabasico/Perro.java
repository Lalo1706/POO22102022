/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

/**
 *
 * @author Eduardo G
 */
public class Perro {
private String raza;
private int tamano;
public static final String cola = "cola";

    public Perro(String raza, int tamano) {
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tamano=" + tamano + '}';
    }

    

}
