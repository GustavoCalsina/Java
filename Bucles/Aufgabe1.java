package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe1 {
    
    public static void main(String []args){
        int number, square;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));

        while(number >= 0){ //mintras el numero sea 0 o positivo.

            square = (int)Math.pow(number, 2);

            JOptionPane.showMessageDialog(null, "The number "+number+" raised to square is "+square);

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
        }
        
        JOptionPane.showMessageDialog(null, "You entered a negative number");
        
        
    }
}
