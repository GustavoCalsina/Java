package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe3 {
    
    public static void main(String [] args){

        int number;

        do{
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
            if (number%2 == 0){
                JOptionPane.showMessageDialog(null,"The number is even");
            }else{
                JOptionPane.showMessageDialog(null, "The number is odd");
            }

        }while(number != 0);

        JOptionPane.showMessageDialog(null, "A 0 was entered, end of program.");
    }
}
