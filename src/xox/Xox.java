/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Xox extends JFrame{
  public Xox() {
        setTitle("XOX Oyunu Seçenekleri");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btn3x3 = new JButton("3x3 Oyun");
        JButton btn4x4 = new JButton("4x4 Oyun");
        JButton btn5x5 = new JButton("5x5 Oyun");

        btn3x3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame(3);
            }
        });

        btn4x4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame(4);
            }
        });

        btn5x5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame(5);
            }
        });

        panel.add(btn3x3);
        panel.add(btn4x4);
        panel.add(btn5x5);

        add(panel);

        setVisible(true);
    }

    private void startGame(int size) {
        // Seçilen boyut ile oyunu başlatan sınıfı çağır
        if(size==3){
           Xox3x3 xox3x3=new Xox3x3();
           xox3x3.xox3x3(); 
        }else if(size==4){
            Xox4x4 xox4x4=new Xox4x4();
            xox4x4.xox4x4();
        }else{
            Xox5x5 xox5x5=new Xox5x5();
            xox5x5.xox5x5();
        }
        
        
        dispose(); // Oyun başladığında launcher penceresini kapat
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Xox();
            }
        });
    }
    }
       
