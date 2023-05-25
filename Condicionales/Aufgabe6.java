package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe6 {
    
    public static void main(String[] args){

        int number1, number2;

        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter one number: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter another number: "));

        if(number1%2 == 0 && number2%2 == 0){

            JOptionPane.showMessageDialog(null, "The two numbers are even");
        } else {

            JOptionPane.showMessageDialog(null, "They are not pairs");
        }
        
    }
}
