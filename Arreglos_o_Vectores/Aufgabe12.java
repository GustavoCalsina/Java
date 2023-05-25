package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe12 {

    public static void main(String []args){
        Scanner entry = new Scanner(System.in);
        int[] number = new int[10];
        int position;

        //Ask the user for 10 numbers
        for(int i=0; i<10; i++){

            System.out.print((i)+" "+"Enter a number:");
            number[i] = entry.nextInt();
        }
        
        //We ask for a position to be eliminated
        System.out.print("Digit una position a eliminate: ");
        position = entry.nextInt();

        //We make the numbers of the array move backward, to the desired position
        for(int i=position; i<9; i++){

            number[i] = number[i+1];
        }

        //we print the arrangement

        for(int i=0; i<9; i++){

            System.out.println((i)+" "+ number[i]);
        } 
    }
}
