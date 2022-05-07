/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author arman
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Hola clickk de raton");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Boton presionado");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Boton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       System.out.println("Cursor entró al componente");
    }

    @Override
    public void mouseExited(MouseEvent me) {
       System.out.println("El mouse");
    }
    
}
