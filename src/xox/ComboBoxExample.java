/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ComboBoxExample extends JFrame{
     private JLabel resultLabel;
     static String selectedOption;
    public String ComboBoxExample() {
        setTitle("JComboBox Örneği");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        String[] options = {"Seçenek 1", "Seçenek 2", "Seçenek 3"};

        JComboBox<String> comboBox = new JComboBox<>(options);
        resultLabel = new JLabel("Seçilen seçenek: ");

        JButton submitButton = new JButton("İşlemi Gerçekleştir");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedOption = (String) comboBox.getSelectedItem();
                //handleSelection(selectedOption);
            }
        });

        panel.add(comboBox);
        panel.add(submitButton);
        panel.add(resultLabel);

        add(panel);

        setVisible(true);
         return selectedOption;
    }
      private void handleSelection(String selectedOption) {
        // Seçilen seçeneklere göre özel işlemleri burada gerçekleştirebilirsiniz.
        if (selectedOption.equals("Seçenek 1")) {
          // Xox3x3 xox3x3=new Xox3x3();
            System.out.println("ddhddhdh");
        } else if (selectedOption.equals("Seçenek 2")) {
            
        } else if (selectedOption.equals("Seçenek 3")) {
           
        }
    }
}
