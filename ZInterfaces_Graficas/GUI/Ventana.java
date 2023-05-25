package ZInterfaces_Graficas.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame {

    private JPanel panel;
    private JComboBox comboBox1;
    private JButton insertarPersonaButton;
    private JScrollPane tabla;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel etiquetaNombre;
    private JLabel etiquetaApellido;
    private JLabel etiquetaEmail;
    private JLabel etiquetaTelefono;
    private JLabel etiquetaDireccion;
    private JTable tabla1;


    public Ventana(){
        agregandoComboBox();
        agregandoColumnas();
        eventoBoton();

    }

    private void agregandoComboBox(){
        Persona persona1 = new Persona("Gustavo","Calsina Alcahuaman", "hh@gmail.com","44556","wasouski");
        Persona persona2 = new Persona("Alejandro","Tabadoa Alcantara", "hh@gmail.com","44556","wasouski");
        Persona persona3 = new Persona("Mar","Moya Giraldez", "hh@gmail.com","44556","wasouski");
        comboBox1.addItem(persona1);
        comboBox1.addItem(persona2);
        comboBox1.addItem(persona3);

    }
    private void agregandoColumnas(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Email");
        model.addColumn("Mobil");
        model.addColumn("Direccion");

        tabla1.setModel(model);
    }
    private void eventoBoton(){
        insertarPersonaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona p = (Persona) comboBox1.getSelectedItem();

                String nombre = p.getNombres();
                String apellidos = p.getApellidos();
                String email = p.getEmail();
                String mobil = p.getMobil();
                String direccion = p.getDireccion();

                String[] persona = {nombre,apellidos,email,mobil,direccion};

            }
        });
    }
    public static void main(String[] args) {

        Ventana f = new Ventana();
        f.setContentPane(new Ventana().panel);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
    }



}
