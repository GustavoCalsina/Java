package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe2 {
    
    public static void main(String []args){

        int number1, number2;

        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number"));
        
        if(number1 == number2){

            JOptionPane.showMessageDialog(null, "The numbers "+ number1 +" and "+ number2 + " are the same");
        } else if(number1 >= number2  ){
            JOptionPane.showMessageDialog(null, "The number " + number1+" is the maximum");
        } else{
            JOptionPane.showMessageDialog(null, "The number "+number2+" is less");
        }
    }
}
