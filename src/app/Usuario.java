package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuario {
    public String name;
    private double saldo;
    public int conta;
    private JPanel panel2;
    private JTextField nameUser;
    private JTextField ccuser;
    private JButton cadastrarButton;
    private JButton entrarButton;

    public Usuario() {
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nameUser.getText();
                conta = Integer.parseInt(ccuser.getText());



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Usuario");
        frame.setContentPane(new Usuario().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


