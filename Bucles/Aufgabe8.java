package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe8 {
    
    public static void main(String[] args){

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));

        for(int i= 1; i <= number; i++){

            System.out.println(i);
        }
    }
}
