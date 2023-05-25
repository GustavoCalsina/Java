package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe22 {
    
    public static void main(String [] args){

        int notes;
        Boolean failure = false;

        for(int i = 1; i<= 5; i++){

            notes = Integer.parseInt(JOptionPane.showInputDialog("Enter the "+i+ " note: "));

            if(notes < 5){

                failure = true;
            }
        }

        if(failure = true){

            System.out.println("failures");
        }else{

            System.out.println("no failure");
        }
    }
}
