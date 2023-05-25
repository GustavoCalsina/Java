package ZInterfaces_Graficas.Ejercicio1;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Contador extends JFrame{
    
    private JPanel panel;
    private JButton boton;
    private JLabel texto;
    private int contador;

    public Contador(){
        setSize(500, 500);
        setTitle("Ejercicio 1");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciarComponentes(){
        colocarPanel();
        colocarTexto();
        colocarBoton();
        
    }

    public void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
    }
    public void colocarTexto(){
        texto = new JLabel();
        texto.setBounds(130, 70, 300, 20);
        texto.setFont(new Font("arial", Font.BOLD, 25));
        texto.setText("Pulsa el boton");
        panel.add(texto);
    }
    public void colocarBoton(){
        boton = new JButton();
        boton.setBounds(150, 350, 200, 50);
        boton.setText("Pulsa Aqui!");
        boton.setFont(new Font("arial", Font.BOLD, 30));
        panel.add(boton);

        //vecesRepetidas = new JLabel();
        //vecesRepetidas.setBounds(150, 70, 300, 20);
        //vecesRepetidas.setFont(new Font("arial", Font.BOLD, 25));
        //panel.add(vecesRepetidas);

        eventoRaton();
    }

    public void eventoRaton(){

        MouseListener oyenteRaton = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                contador++;
                if(contador == 1){
                    texto.setText("Boton pulsado 1 vez");
                }
                else {
                    texto.setText("Boton pulsado "+contador+" veces");
                }
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };

        boton.addMouseListener(oyenteRaton);
    }


}
