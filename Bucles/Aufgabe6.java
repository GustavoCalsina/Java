package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe6 {
    
    public static void main(String [] args){

        int number, counter = 0;

        do{

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

            counter += number;
            
        }while(number != 0);

        System.out.println("The total sum is:"+ counter);

    }
}
