package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe10 {
    
    public static void main(String [] args){

        int number, sum = 0, counter = 1;

        while(counter <= 10){
            
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
            
            sum += number;
            counter ++;
            
        }

        System.out.println(sum);
    }
}
