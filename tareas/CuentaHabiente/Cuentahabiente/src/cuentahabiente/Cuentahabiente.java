/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentahabiente;

/**
 *
 * @author arman
 */
public class Cuentahabiente {
    private int idcliente;
    private String nombre; 
    private float balance;
        
    //Contructor
    public Cuentahabiente() {
    }
        
    //Constructor sobrecargado
    public Cuentahabiente(int idcliente, String nombre, float balance) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idcliente=" + idcliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
        
        public String evaluarNivelCliente(){
            return this.balance <= 50000.0f? "Cliente Regular" : "Cliente Premium";
    }
}
    

