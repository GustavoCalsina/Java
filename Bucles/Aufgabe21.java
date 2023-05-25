package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe21 {
    
    public static void main(String []args){
    
        int number , number_negativ = 0;

        for(int i = 1; i<= 10; i++){

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));

            if(number < 0){

                number_negativ++;
            }
        }

        System.out.println("A total of "+number_negativ+" negative numbers were entered");
    }    
}

