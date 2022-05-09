/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author arman
 */
public class VentanaSwing extends JFrame{
    private FlowLayout layout;
    private JTextField cuadrotexto;
    public VentanaSwing() throws HeadlessException {
        this.setTitle("Mi ventana Swing");
        this.setSize(300,220);
        this.setVisible(true);
        layout = new FlowLayout();
        this.setLayout(layout);
        cuadrotexto = new JTextField(15);
        this.getContentPane().add(cuadrotexto);
        this.validate();
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //System.exit(0);
                ((JFrame)e.getSource()).setVisible(false);
            }
            
});
        
    }
}
