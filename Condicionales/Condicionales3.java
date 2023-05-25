package Condicionales;
import javax.swing.JOptionPane;

/*
    El operador Terniario '?'

    valor = (Condicion) ? valor1 : valor2
*/

public class Condicionales3 {
    
    public static void main(String [] args){

        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce one number:"));

        mensaje = (numero%2 == 0) ? "Es par" : "Es impar";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
