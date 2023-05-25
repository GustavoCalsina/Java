package Condicionales;

import javax.swing.JOptionPane;



public class Condicionales {
    
    public static void main(String[] args){

        int numero, dato = 4;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insert one number: "));

        if(numero == dato){

            JOptionPane.showMessageDialog(null, "The number is 4");
        } else if(numero > dato){

            JOptionPane.showMessageDialog(null,"The number is bigger , but it's not your number");
        } else {

            JOptionPane.showMessageDialog(null,"That's not your number");
        }
    }
}
