Package Semana10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.BorderFactory;
import java.awt.*;

public class Login implements ActionListener {

    private JFrame telaInicial;
    private JPanel painel;
    private JLabel l1;  //usuario 
    private JLabel ls;  //senha 
    private JLabel label; 
    private JTextField txtUser; 
    private JPasswordField txtSenha; 
    private JButton b1;             
    private String senha = "000";

    public Login(){
        
        telaInicial = new JFrame();
        painel = new JPanel();

        painel.setBorder(BorderFactory.createEmptyBorder(35, 35, 20, 30));
        painel.setLayout(new GridLayout(0,1));
        
        l1 = new JLabel("Usuario:"); //Entrar Usuário
        painel.add(l1);

        txtUser = new JTextField();
        painel.add(txtUser);

        ls = new JLabel("Senha:"); //Entrar com senha
        painel.add(ls);

        txtSenha = new JPasswordField();
        painel.add(txtSenha);

        label = new JLabel();
        painel.add(label); 

        b1 = new JButton("Logar"); //Botão
        b1.addActionListener(this);
        painel.add(b1);

        telaInicial.add(painel, BorderLayout.CENTER);
        telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaInicial.setTitle("Login");
        telaInicial.setSize(600,500);
        telaInicial.pack();
        telaInicial.setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e){
    if(txtSenha.getText().equals(senha)){

        label.setText("Correto");
        label.setFont(new Font("Serif", Font.ITALIC, 25));
        label.setForeground(Color.WHITE);
        new Welcome();
        
        }else
        {

        label.setText("Tente novamente '000'");
        label.setFont(new Font("Serif", Font.ITALIC, 25));
        label.setForeground(Color.BLACK);
        
        }
    }
}