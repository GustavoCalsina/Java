package ZInterfaces_Graficas.Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeporteFavorito extends JFrame {
    private JPanel panel;
    private JLabel texto,img;
    private JRadioButton selecccion1,selecccion2,selecccion3, selecccion4;

    public DeporteFavorito(){
        setSize(1000,600);
        setLocationRelativeTo(null);
        setTitle("Ejercicio 2");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        colocarPanel();
        colocarTexto();
        colocarBotones();
    }

    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarTexto(){
        texto = new JLabel();
        texto.setText("Escoja su deporte Favorito");
        texto.setBounds(30,30,500,20);
        panel.add(texto);
    }
    private void colocarBotones(){
        selecccion1 = new JRadioButton("Futbol");
        selecccion1.setBounds(50,100,100,20);
        panel.add(selecccion1);

        selecccion2 = new JRadioButton("Baloncesto");
        selecccion2.setBounds(50,150,100,20);
        panel.add(selecccion2);

        selecccion3 = new JRadioButton("Tenis");
        selecccion3.setBounds(50,200,100,20);
        panel.add(selecccion3);

        selecccion4 = new JRadioButton("Natacion");
        selecccion4.setBounds(50,250,100,20);
        panel.add(selecccion4);

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(selecccion1);
        grupoBotones.add(selecccion2);
        grupoBotones.add(selecccion3);
        grupoBotones.add(selecccion4);

        clickSelector();


    }
    private void clickSelector() {
        //Agregando el Mouse Listener
        img = new JLabel();
        img.setBounds(200, 100, 300, 200);
        panel.add(img);

        final ImageIcon imagenFutbol = new ImageIcon("Futbol.jpg");
        final ImageIcon imagenBaloncesto = new ImageIcon("Baloncesto.jpg");
        final ImageIcon imagenTenis = new ImageIcon("Tenis.jpg");
        final ImageIcon imagenNatacion = new ImageIcon("Natacion.jpg");

        ActionListener evento1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH)));

            }
        };
        ActionListener evento2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH)));
            }
        };
        ActionListener evento3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(imagenTenis.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH)));
            }
        };
        ActionListener evento4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH)));
            }
        };


        selecccion1.addActionListener(evento1);
        selecccion2.addActionListener(evento2);
        selecccion3.addActionListener(evento3);
        selecccion4.addActionListener(evento4);

    }
}
