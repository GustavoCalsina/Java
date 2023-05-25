package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe7 {
    
    public static void main(String [] args){

        int number, elements = 0, sum = 0;

        float average;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));

        while(number >= 0){

            sum += number; //sum iterativa
            elements ++; //Aumentamos uno a uno los elements

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));

        }

        if(elements == 0){

            System.out.println("Division by 0 does not exist");
        }else{

            average = (float) sum/elements;
            System.out.println("The average is: "+ average);
        }

    }
}
