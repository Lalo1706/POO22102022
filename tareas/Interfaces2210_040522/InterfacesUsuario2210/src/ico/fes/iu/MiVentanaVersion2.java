/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author arman
 */
public class MiVentanaVersion2 extends Frame {
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadrotexto;
    private Label etiqueta;
    
    
    public MiVentanaVersion2()throws HeadlessException{
        setTitle("Mi ventana");
        setSize(300, 200);
        layout = new FlowLayout();
        setLayout(layout);
        boton1 = new Button("Saludar");
        cuadrotexto = new TextField(15);
        etiqueta = new Label("VALOR inicial");
        
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Holaaa " + cuadrotexto.getText());  
                System.out.println("X = " + e.getX());
                System.out.println("Y = " + e.getY());
                System.out.println("Qué boton? " + e.getButton());
                
            }
        } );
        
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.etiqueta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Enter code " + KeyEvent.VK_ENTER);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        System.out.println("Se dio enter");
                        break;             
                      default:
                          System.out.println("Teccla: " + e.getKeyChar());           
                }   
            }   
        });
        
        this.add(boton1);
        this.add(cuadrotexto);
        this.add(etiqueta);
        setVisible(true);
    } 
}
