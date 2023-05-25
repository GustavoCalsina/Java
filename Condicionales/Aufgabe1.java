package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe1 {
    
    public static void main(String [] args){

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number:"));

        if(number%10 == 0){

            JOptionPane.showMessageDialog(null, number + " is multiplot of 10");
        } else {

            JOptionPane.showMessageDialog(null, " is not multiples of 10");
        }
    }
}
