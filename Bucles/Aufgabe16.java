package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe16 {
    
    public static void main(String[] args){

        int number;

        /*do{

            number = Integer.parseInt(JOptionPane.showInputDialog(" Enter a number between 0 and 10:"));

        }while(number < 0 || number > 10);

        System.out.println(" The multiplication table of the number "+number+ " is:");

        for(int i=0; i<=12; i++){

            System.out.println(number+" * "+i+" = "+number*i);
        }*/

        
        //Second way to do the multiplication table

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 0 and 10:"));

        while(number > 0 && number < 10){

            System.out.println("The multiplication table of the number "+number+ " is: ");

            for(int i=0; i<=12; i++){

                System.out.println(number+" * "+i+" = "+number*i);
            }

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 0 and 10:"));
        }    

        System.out.println("The number is out of range");
    }
}
