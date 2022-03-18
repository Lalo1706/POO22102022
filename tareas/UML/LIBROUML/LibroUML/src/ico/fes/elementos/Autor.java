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
public class Autor {
    private String Nombre;
    private String Nacionalidad;

    //Constructor//
    public Autor() {
    }
    //Constructor Sobrecargado//
    public Autor(String Nombre, String Nacionalidad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    //ToString//

    @Override
    public String toString() {
        return "Autor{" + "Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + '}';
    }
    
    
}
