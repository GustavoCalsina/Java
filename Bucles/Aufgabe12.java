package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe12 {
    
    public static void main(String[] args){

        int number;
        long factorial = 1;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        //5!= 1**2*3*4*5

        for (int i= 1; i<= number; i++){

            factorial *= i; //iterative multiplication
        }

        System.out.println("The factorial of "+number+ " is: " +factorial);
    } 
}
