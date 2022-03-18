/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librouml;

import ico.fes.elementos.Autor;
import ico.fes.elementos.Editorial;
import ico.fes.libro.Libro;


/**
 *
 * @author Eduardo G
 */
public class LibroUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Libro libr = new Libro();
        libr.setAutorNombre("Eduardo");
        libr.setPrecio("$177");
        
        Editorial edi = new Editorial();
        edi.setFecha(170602);
        edi.setNombre("Porrua");
        edi.setLugar("Mexico");
        
        System.out.println(edi);
        System.out.println(libr);
        
        
        
    }
    
}
