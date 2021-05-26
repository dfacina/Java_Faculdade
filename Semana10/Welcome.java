Package Semana10;

import javax.swing.*;
import java.awt.*;


public class Welcome{

    private JFrame telaSec;
    private JPanel painel;

    private JLabel lw;

    public Welcome(){
        
        telaSec = new JFrame();
        painel = new JPanel();

        painel.setBorder(BorderFactory.createEmptyBorder(40, 40, 30, 30));
        painel.setLayout(new GridLayout(0,1));
        
        
        lw = new JLabel("Bem Vindo");
        lw.setFont((new Font("Serif", Font.ITALIC, 20)));
        lw.setForeground(Color.BLACK);
        painel.add(lw);

        telaSec.add(painel, BorderLayout.CENTER);
        telaSec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaSec.setTitle("Bem VINDO");
        telaSec.setSize(500,500);
        telaSec.pack();
        telaSec.setVisible(true);

    }

    public static void main(String[] args) {
        new Welcome();
    }
}
