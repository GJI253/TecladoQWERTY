/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tecladoqwerty;
/**
 *
 * @author Priscila Kennedy
 */
import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

    public class TecladoQWERTY  extends JFrame {
    private JTextField texto;
    private String teclas = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
    private JButton[] botones;

    public TecladoQWERTY() {
        setTitle("Teclado QWERTY");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        texto = new JTextField();
        texto.setEditable(false);
        add(texto, BorderLayout.NORTH);

        JPanel panelTeclado = new JPanel();
        panelTeclado.setLayout(new GridLayout(3, 10));

        botones = new JButton[teclas.length()];
        for (int i = 0; i < teclas.length(); i++) {
            char tecla = teclas.charAt(i);
            JButton boton = new JButton(String.valueOf(tecla));
            boton.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
                    texto.setText(texto.getText() + tecla);
               }
            });
            panelTeclado.add(boton);
            botones[i] = boton;
        }

        add(panelTeclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TecladoQWERTY teclado = new TecladoQWERTY();
                teclado.setVisible(true);
            }
        });
              
    }
   
}
        
    

