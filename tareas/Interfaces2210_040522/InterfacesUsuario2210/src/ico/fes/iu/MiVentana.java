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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author arman
 */
public class MiVentana extends Frame implements MouseListener{
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadrotexto;
    private Label etiqueta;
    
    
    public MiVentana()throws HeadlessException{
        setTitle("Mi ventana");
        setSize(300, 200);
        layout = new FlowLayout();
        setLayout(layout);
        boton1 = new Button("Saludar");
        cuadrotexto = new TextField(15);
        etiqueta = new Label("VALOR inicial");
        this.boton1.addMouseListener(this);
        this.add(boton1);
        this.add(cuadrotexto);
        this.add(etiqueta);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Click");
        System.out.println(cuadrotexto.getText());
        etiqueta.setText("Hola" + cuadrotexto.getText());
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Presionado");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Liberado");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("entro");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Salió");
    }
    
}
