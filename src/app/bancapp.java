package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bancapp {
    public double saldo;
    public double saldolbl;
    public String titular;
    private JLabel lblsaldo;
    private JTextField valordep;
    private JButton buttondep;
    private JButton saquedep;
    private JTextField valorsaque;
    private JPanel panel1;
    private JLabel lblsaldoins;
    public void mostrarSaldo(){
        lblsaldo.setText("R$"+saldolbl);
    }
    public void saldoInsuficiente(){
        lblsaldoins.setText("Saldo insuficiente");
    }
    public void saldook(){
        lblsaldoins.setText("");
    }
    public bancapp(){
        this.saldolbl=saldo;

        buttondep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double deposito =Double.parseDouble(valordep.getText());
                saldolbl += deposito;
                mostrarSaldo();
                saldook();
            }
        });
        saquedep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                double saque =Double.parseDouble(valorsaque.getText());
                if(saldolbl<saque){
                    lblsaldoins.setText("Saldo insuficiente!");
                }else {
                    saldolbl -= saque;
                    mostrarSaldo();
                    saldook();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("bancapp");
        frame.setContentPane(new bancapp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
