package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe2 {
    
    public static void main(String []args){

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        while(number < 0 || number > 0){

            if(number < 0){
                 JOptionPane.showMessageDialog(null,"The number is negativ");
            }else{

                JOptionPane.showMessageDialog(null,"The number is positiv");
            }

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
        }

        JOptionPane.showMessageDialog(null,"You entered 0, bye");
    }
} 
