package ZInterfaces_Graficas.Eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ventanaa extends JFrame {
    
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;

    public Ventanaa(){

        setBounds(50, 50, 500, 500);
        setTitle("Eventos");

        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){

        colocarPanel();
        //colocarEtiqueta();
        colocarCajaDeTexto();
        colocarAreaDeTexto();
        //colocarBoton();
    }

    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        //eventoDeMovimientoRaton();
        eventoRuedaDelRaton();
    }
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30, 10, 300, 30);
        etiqueta.setFont(new Font("cooper Black", 3,20));
        panel.add(etiqueta);
    }
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 30, 150, 30);
        panel.add(cajaTexto);

        eventosDelTeclado();
    }
    private void colocarAreaDeTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(230, 30, 200, 300);
        panel.add(areaTexto);

        JScrollPane scroll = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(230, 30, 200, 300);
        panel.add(scroll);

    }
    
    private void colocarBoton(){
        boton = new JButton();
        boton.setText("Pulsa aqui!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);

        //eventoOyenteDeAccion();
        //eventoOyenteDeRaton();
    }

    //Agregando accion la boton
        
    private void eventoOyenteDeAccion(){

        ActionListener oyenteDeAccion = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae){
                saludo.setText("Hola " + cajaTexto.getText());
            }
        };
    
        boton.addActionListener(oyenteDeAccion);
    }  

    private void eventoOyenteDeRaton(){
        //Agregando Oyente de raton (MouseListener)

        MouseListener oyenteDeRaton = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.isAltDown()){
                    areaTexto.append("ALT\n");
                }
                else if(e.isControlDown()){
                    areaTexto.append("Control\n");
                }
                else if(e.isShiftDown()){
                    areaTexto.append("Shift\n");
                }
                else if(e.isMetaDown()){
                    areaTexto.append("Click Derecho\n");
                }
                else{
                    areaTexto.append("Clcik\n");
                }

                if(e.getClickCount() == 2){
                    areaTexto.append("Doble click\n");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //areaTexto.append("mouseExited\n");
            }
            
            
        };
        boton.addMouseListener(oyenteDeRaton);
    }

    private void eventoDeMovimientoRaton(){
        MouseMotionListener oyenteMovimientoDelRaton = new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) { //Click y arrastre
                areaTexto.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) { //mover objeto sin darle click
               areaTexto.append("mouseMoved\n");
            }
            
        };
        panel.addMouseMotionListener(oyenteMovimientoDelRaton);//Añadir movimiento del raton
        
    }

    private void eventoRuedaDelRaton(){//Rueda del raton
        MouseWheelListener ruedaRaton = new MouseWheelListener() {

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                
                if(e.getPreciseWheelRotation() == -1){
                    areaTexto.append("Rueda hacia arriba\n");
                }
                if(e.getPreciseWheelRotation() == 1){
                    areaTexto.append("Rueda se movio hacia abajo\n");
                }
            }
            
        };
        panel.addMouseWheelListener(ruedaRaton );
    }

    private void eventosDelTeclado(){
        KeyListener eventoTeclado = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //areaTexto.append("keyReleased\n");
                if(e.getKeyChar() == 'p'){
                    areaTexto.append("Letra p");
                }
                if(e.getKeyChar() == '\n'){
                    areaTexto.append("Enter\n");
                }
                
            }
            
        };
        cajaTexto.addKeyListener(eventoTeclado);
    }
}
