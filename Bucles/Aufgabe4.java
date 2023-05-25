package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe4 {
    public static void main(String []args){

        int number, counter = 0;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        while(number >= 0){ //as long as the number is not negative

            counter++; // We increase the counter by 1

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number:"));
        }

        System.out.println("You have entered: "+counter+" numbers.");
    }
}
