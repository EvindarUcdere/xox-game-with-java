/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BilgilendiriciFrame extends JFrame {
    public BilgilendiriciFrame(int gamer1, int gamer2) {
        setTitle("Oyuncu Skorları");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Ana panel oluştur
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Gamer1 için etiket ve skor
        JLabel gamer1Label = new JLabel("Gamer1:");
        JLabel gamer1ScoreLabel = new JLabel(gamer1 + "");

        // Gamer2 için etiket ve skor
        JLabel gamer2Label = new JLabel("Gamer2:");
        JLabel gamer2ScoreLabel = new JLabel(gamer2 + "");

        // OYNA butonu
        JButton AnaSAyfaButton = new JButton("OYNA");
        AnaSAyfaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//              Xox3x3 xox3x3=new Xox3x3();
//              xox3x3.close();
//              Xox4x4 xox4x4=new Xox4x4();
//              xox4x4.close();
             
              Xox xox=new Xox();
              dispose();;
            }
        });

        // Kapatma butonu
        JButton kapatButton = new JButton("Kapat");
        kapatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Uygulamayı kapat
            }
        });

        // Paneli düzenle
        panel.add(gamer1Label);
        panel.add(gamer1ScoreLabel);
        panel.add(gamer2Label);
        panel.add(gamer2ScoreLabel);
        panel.add(AnaSAyfaButton);
        panel.add(kapatButton);

        // Ana pencereye paneli ekle
        add(panel);

        // Pencereyi görünür yap
        setVisible(true);
    }
}

