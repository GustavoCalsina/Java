package ZInterfaces_Graficas.ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class Ventana extends JFrame{

    public JPanel panel;

    public Ventana(){
        //Posicionamiento y tamaño

        this.setSize(500, 500);//Establecemos el tamaño
        
        //setLocation(500 , 200 ); //Establecemos la posicion inicial de la ventana
        
        //setBounds(500, 600, 500, 500); //Engloba , el tamaño de la pantalla y la posicion
        
        setLocationRelativeTo(null); //establecemos la ventana en el centro por defecto
        
        //Tamaños

        //setResizable(false); //Evita que el usuario pueda ajustar le tamaño de la pantalla
        setMinimumSize(new Dimension(400,400)); //Establecemos el tamaño minimo

        //Titulo
        setTitle("El mejor titulo"); // Establecemos un titulo

        //Colores
        //this.getContentPane().setBackground(Color.WHITE); //Agrega colores a la vetana

        //Panel
        iniciarComponentes();

        //Cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que se cierre todo, hasta el programa de ejecucion
    }

    //Crear paneles
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesDeActivacion();
        //colocarCajasDeTexto();
        //areasDeTexto();
        //colocarCasillasDeVerificacion();
        //colocarListasDesplegables();
        //colocarCampoDeContraseña();
        //colocarTablas();
        colocarLista();

    }
    private void colocarPaneles(){

        panel = new JPanel(); //creacion del panel
        //panel.setBackground(Color.white); //Establecemos color al panel
        panel.setLayout(null); //Desactivamos el diseño por defecto
        this.getContentPane().add(panel); //Agregamos el panel a la vetana

    }

    private void colocarEtiquetas(){

        
        //Cambiamos ubicacion del texto
        JLabel etiqueta = new JLabel("MUNDIAL 2018", SwingConstants.CENTER); //centramos el texto
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // Otra manera de establecer la alineacion del texto

        //Creando etiquetas
        //JLabel etiqueta = new JLabel("Hola");//creamos una etiqueta
        //etiqueta.setText("Hola"); //Lo mismo que arriba pero de otra manera
        
        //Situar la etiqueta en una posicion
        etiqueta.setBounds(85, 10, 300, 80);
        
        //Dar color a las letras e etiquetas
        etiqueta.setForeground(Color.black); //Establecemo el color de la letra
        //etiqueta.setBackground(Color.BLACK);//Establecemos el color del background de la etiqueta
        etiqueta.setOpaque(true); //Establecemos el pintar el fondo de la etiqueta

        //Modificar el texto
        etiqueta.setFont(new Font("chiller", Font.ITALIC, 40)); //Establecemos la fuente del texto

        panel.add(etiqueta); //Agregamos la etiqueta al panel

        //añadir imagen
        ImageIcon imagen = new ImageIcon("mundial.jpg");
        JLabel etiqueta2 = new JLabel(imagen);
        etiqueta2.setBounds(30,100, 450, 450);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(450, 450, Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }

    private void colocarBotones(){

        //Boton1 texto
        JButton boton1 = new JButton();
        boton1.setText("ENVIAR!"); //establecemos el texto
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//Establecemos el enccendido del boton
        boton1.setMnemonic('a'); //Establecemos alt + (boton seleccionado)
        boton1.setForeground(Color.blue);//Establecemos el color de la letra
        boton1.setFont(new Font("arial", Font.BOLD, 10)); //Establecemos la fuente de la letra
        panel.add(boton1);

        //Boton2 imagen

        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);

        ImageIcon click = new ImageIcon("Boton.png");
        boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setBackground(Color.RED);
        panel.add(boton2);

        //Boton3 de bordes

        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.blue, 3,true)); //Crear Bordes
        panel.add(boton3);

    }

    private void colocarRadioBotones(){

        JRadioButton radioBoton1 = new JRadioButton("Hola", false);
        radioBoton1.setBounds(50,100,200,50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Programacion");
        radioBoton1.setFont(new Font("cooper black", 0, 20));
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Hola2", false);
        radioBoton2.setBounds(50,150,100,50);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Hola3", false);
        radioBoton3.setBounds(50,200,100,50);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        
    }

    private void colocarBotonesDeActivacion(){

        JToggleButton botonActivacion1 = new JToggleButton("Opcion1", false);
        botonActivacion1.setBounds(50, 100, 100, 50);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("Opcion1", false);
        botonActivacion2.setBounds(50, 150, 100, 50);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("Opcion1", false);
        botonActivacion3.setBounds(50, 200, 100, 50);
        panel.add(botonActivacion3);

        ButtonGroup grupoBotonesActivados = new ButtonGroup();

        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);

    }

    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField("Hola",20);
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setText("Hola....");

        System.out.println("Texto en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }

    private void areasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Hola");
        areaTexto.append("Escribe por aqui....");//Permite agregar mas texto
        areaTexto.setEditable(true);//Permite poder editar o no el area de texto

        System.out.println("El texto es: " + areaTexto.getText());
        panel.add(areaTexto);

        //Barras de desplazamiento

        JScrollPane barraDeDesplazamiento = new JScrollPane(areaTexto, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barraDeDesplazamiento.setBounds(20, 20, 300, 200);
        //barraDeDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barraDeDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barraDeDesplazamiento);

    }
 
    private void colocarCasillasDeVerificacion(){
        JCheckBox casillaDeVerificacion1 = new JCheckBox("Pan");
        casillaDeVerificacion1.setBounds(20, 20, 100, 50);
        panel.add(casillaDeVerificacion1);

        JCheckBox casillaDeVerificacion2 = new JCheckBox("Arroz");
        casillaDeVerificacion2.setBounds(20, 50, 100, 50);
        panel.add(casillaDeVerificacion2);

        JCheckBox casillaDeVerificacion3 = new JCheckBox("Mantequilla");
        casillaDeVerificacion3.setBounds(20, 80, 100, 50);
        panel.add(casillaDeVerificacion3);

        JCheckBox casillaDeVerificacion4 = new JCheckBox("Huevo");
        casillaDeVerificacion4.setBounds(20, 110, 100, 50);
        panel.add(casillaDeVerificacion4);
    }

    private void colocarListasDesplegables(){

        /*String[] paises = {"Peru", "Colombia", "Paraguay", "Ecuador"};
        JComboBox <String>listaDespegable = new JComboBox<String>(paises);
        listaDespegable.setBounds(20, 20, 100, 30);
 
        listaDespegable.addItem("Argentina"); //Añadir objetos a tu lista
        listaDespegable.setSelectedItem("Ecuador"); //Seleccionar el primer objeto visto
        panel.add(listaDespegable); */


        Persona persona1 = new Persona("Gustavo", 25, "Peruano");
        Persona persona2 = new Persona("Sara", 25, "Peruano");

        DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
        JComboBox <Persona>listadespegable = new JComboBox<Persona>(modelo);

        modelo.addElement(persona1);
        modelo.addElement(persona2);
        listadespegable.setBounds(20, 20, 100, 30);
        panel.add(listadespegable);

    }

    private void colocarCampoDeContraseña(){

        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(20, 20, 150, 30);
        campoContraseña.setText("Contraseña");
        panel.add(campoContraseña);

        String contraseña = "";
        for(int i=0; i<campoContraseña.getPassword().length; i++){
            contraseña += campoContraseña.getPassword() [i];
        }
        System.out.println("Contraseña: " + contraseña);
    }
    
    private void colocarTablas(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Edad");
        model.addColumn("Nacionalidad");

        String[] persona1 = {"Gustavo", "25", "Peruano"};
        String[] persona2 = {"Rosa", "25", "Peruano"};
        String[] persona3 = {"Rosa", "25", "Peruano"};
        String[] persona4 = {"Rosa", "25", "Peruano"};
        String[] persona5 = {"Rosa", "25", "Peruano"};
        String[] persona6 = {"Rosa", "25", "Peruano"};
        String[] persona7 = {"Rosa", "25", "Peruano"};
        String[] persona8 = {"Rosa", "25", "Peruano"};
        String[] persona9 = {"Rosa", "25", "Peruano"};
        model.addRow(persona1);
        model.addRow(persona2);
        model.addRow(persona3);
        model.addRow(persona4);
        model.addRow(persona5);
        model.addRow(persona6);
        model.addRow(persona7);
        model.addRow(persona8);
        model.addRow(persona9);

        JTable tabla = new JTable(model);
        tabla.setBounds(20, 20, 300, 200);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }

    private void colocarLista(){

        DefaultListModel<Persona> modelo = new DefaultListModel<Persona>();

        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Estefania",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));
        modelo.addElement(new Persona("Gustavo",21,"Blaaaa"));

        JList <Persona> lista = new JList <Persona>(modelo);
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);

        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
    }

    
    
}
