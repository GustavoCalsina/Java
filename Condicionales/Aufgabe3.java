package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe3 {
    
    public static void main(String [] args){

        char letter;

        letter = JOptionPane.showInputDialog(null, "Enter one letter").charAt(0);

        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null, "The letter is capitalized");
        } else {
            JOptionPane.showMessageDialog(null, "The letter is in lower case");
        }

        
    }
}
