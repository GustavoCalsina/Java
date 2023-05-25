package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe8 {
    
    public static void main(String [] args){

        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Insert a number from 0 to 99999"));

        if(n >= 0 && n <= 9){
            JOptionPane.showMessageDialog(null, "The number has 1 digit.");
        } else if (n <= 99){
            JOptionPane.showMessageDialog(null, "The number has 2 digit.");
        } else if (n <= 999){
            JOptionPane.showMessageDialog(null, "The number has 3 digit.");
        } else if (n <= 9999){
            JOptionPane.showMessageDialog(null, "The number has 4 digit.");
        } else if (n <= 99999){
            JOptionPane.showMessageDialog(null, "The number has 5 digit.");
        } else {
            JOptionPane.showMessageDialog(null, "Your number goes over 99999 or put negative numbers");
        }

    }
}
