package ZInterfaces_Graficas.Ejercicio3;

import javax.swing.*;

public class Ventana extends JFrame {

    private JPanel panel;
    public Ventana(){
        setSize(400,400);
        setLocationRelativeTo(null);
        iniciarComponente();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponente(){
        colocarPanel();
        imagen();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void imagen(){
        ImageIcon img = new ImageIcon("Baloncesto.jpg");
        JLabel eticket = new JLabel(img);
        eticket.setBounds(30,100,300,300);
        panel.add(eticket);
    }
}
