package xox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Xox3x3 {
    static int gamer1=0;
    static int gamer2=0;
    static int gameFinish=0;
    static   JPanel panel = new JPanel(new GridLayout(3, 3));
    static JButton[][] buttons = new JButton[3][3];
    //butonlara basılıp basılmadıgını kontrol eder
    static boolean[][] buttonClicked = new boolean[3][3];
    static JFrame frame ;
    
    public static void xox3x3(){
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new JFrame("XOX");
                frame.setSize(400, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        buttons[i][j] = createButton(buttons, i, j);
                        panel.add(buttons[i][j]);
                    }
                }

                frame.add(panel);
                frame.setVisible(true);
            }
        });
    }

    private static JButton createButton(JButton[][] buttons, int row, int col) {
        JButton button = new JButton("");
        button.setFont(new Font("Arial", Font.PLAIN, 40));

        // Butonun ismi
        String buttonName = "button" + row + col;
        button.setName(buttonName);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttons[row][col].getText().isEmpty()) {
                    gameFinish++;
                    if (sayac % 2 != 0) {
                        buttons[row][col].setText("X");
                        sayac = sayac + 1;
                          //oyununun puanını arttıracagız
                         
                    }else { 
                        buttons[row][col].setText("O");
                        sayac = sayac + 1;
                         //  gamer2 += kontrol("O");
                    } 

                    buttons[row][col].setEnabled(false);
                    if(gameFinish==9){
                        gamer1 = kontrol("X");
                        gamer2 = kontrol("O");
                        BilgilendiriciFrame bframe=new BilgilendiriciFrame(gamer1,gamer2);
                        frame.dispose();
                       
                        
                    }
 
                }
            }
        });

        return button;
    }
    static int kontrol(String x_or_O) {
    int gamer = 0;

    // Yatay kontrol
    for (int i = 0; i < 3; i++) {
        if (buttons[i][0].getText().equals(x_or_O) && buttons[i][1].getText().equals(x_or_O) && buttons[i][2].getText().equals(x_or_O)) {
            gamer++;
            System.out.println("Yatay " + (i + 1));
        }
    }

    // Dikey kontrol
    for (int j = 0; j < 3; j++) {
        if (buttons[0][j].getText().equals(x_or_O) && buttons[1][j].getText().equals(x_or_O) && buttons[2][j].getText().equals(x_or_O)) {
            gamer++;
            System.out.println("Dikey " + (j + 1));
        }
    }

    // Çapraz kontrol (soldan sağa)
    if (buttons[0][0].getText().equals(x_or_O) && buttons[1][1].getText().equals(x_or_O) && buttons[2][2].getText().equals(x_or_O)) {
        gamer++;
        System.out.println("Çapraz soldan sağa");
    }

    // Çapraz kontrol (sağdan sola)
    if (buttons[0][2].getText().equals(x_or_O) && buttons[1][1].getText().equals(x_or_O) && buttons[2][0].getText().equals(x_or_O)) {
        gamer++;
        System.out.println("Çapraz sağdan sola");
    }

    return gamer;
}

    static int sayac = 1;

    }


