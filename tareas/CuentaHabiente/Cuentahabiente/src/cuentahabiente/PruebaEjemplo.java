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

public class PruebaEjemplo {
    
    public static void main(String[] args) {
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0] = new Cuentahabiente(1, "Juanito", 45000.5f);
        lista[1] = new Cuentahabiente(2, "Lupita", 700000.45f);
        lista[2] = new Cuentahabiente(3, "Pérez", 5000.0f);
        lista[3] = new Cuentahabiente(4, "Pepe", 13000.5f);
        lista[4] = new Cuentahabiente(5, "Paco", 1000.0f);

        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.getNombre() + " es " + cuentahabiente.evaluarNivelCliente());  
        }
}
}
