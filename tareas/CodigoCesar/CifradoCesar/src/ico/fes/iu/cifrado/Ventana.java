/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu.cifrado;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author arman
 */
public class Ventana extends JFrame implements ActionListener{
    Font frente = new Font("Impact", 4, 22);
    Color colores = new Color(20, 220, 107);
    JLabel jl1 = new JLabel(" Cifrado_Cesar ");
    JLabel jl2 = new JLabel("Codigo");
    JButton boton_uno = new JButton();
    JButton boton_dos = new JButton();
    JTextField jtf = new JTextField();
    JTextArea texto = new JTextArea(" Escribe aqui ",6,20);
    JTextArea tArea = new JTextArea(6,20);
    CodigoCesar Ccesar = new CodigoCesar();
    public Ventana() {
        setSize(800, 600);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
     }
    
    private void init()
    {
       //customizacion de objetos 
       jl1.setFont(frente);
       jl1.setBounds(270, 0, 300, 50);
       jl2.setBounds(10, 38, 50, 25);
       boton_uno.setText("Cifrar");
       boton_uno.setBackground(colores);
       boton_uno.setBounds(270,50,100,20);
       boton_uno.addActionListener(this);
       boton_dos.addActionListener(this);   
       boton_dos.setText("Descifrar");
       boton_dos.setBackground(colores);
       boton_dos.setBounds(385,50,100,20);
       texto.setBounds(50, 75,300 , 450);
       texto.setLineWrap(true);//para los saltos de linea automaticos 
       tArea.setBounds(400, 75,300 , 450);
       tArea.setEditable(false);
       tArea.setLineWrap(true);//para los saltos de linea automaticos 
       jtf.setBounds(50,40, 50, 20);
       add(jl1);
       add(boton_uno);
       add(boton_dos);
       add(texto);
       add(tArea);
       add(jtf);
       add(jl2);
       getContentPane().setBackground(new Color(123, 224, 201));
       getContentPane().setLayout(null);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton_uno){
           Ccesar.setCodigo(Integer.parseInt(jtf.getText()));
           Ccesar.secret(texto.getText());
           tArea.setText(Ccesar.Cadenas);
           getContentPane().repaint();
    }
    if (e.getSource() == boton_dos){
           Ccesar.setCodigo(Integer.parseInt(jtf.getText()));
           Ccesar.unsecret(texto.getText());
           tArea.setText(Ccesar.Cadenas);
           getContentPane().repaint();
    }
  }

    
    
}
