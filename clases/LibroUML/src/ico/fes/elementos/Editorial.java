/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.elementos;

/**
 *
 * @author Eduardo G
 */
public class Editorial {
    private String Nombre;
    private float Fecha;
    private String Lugar;
    
    //Constructor//
    public Editorial() {
    }
    //Constructor Sobrecargado//
    public Editorial(String Nombre, float Fecha, String Lugar) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Lugar = Lugar;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getFecha() {
        return Fecha;
    }

    public void setFecha(float Fecha) {
        this.Fecha = Fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
    //ToString//
    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", Fecha=" + Fecha + ", Lugar=" + Lugar + '}';
    }
    
    
    
    
    
    
    
    
}
