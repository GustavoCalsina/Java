package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe8 {
    
    public static void main(String []args){

        Scanner num = new Scanner(System.in);
        int[] number = new int[10];
        int number_arrangement, position;

        for(int i=0; i<8; i++){

            System.out.print((i+1)+".- Enter a number: ");
            number[i] = num.nextInt();
        }

        for(int i=0; i<8; i++){

            System.out.print(number[i]+"-");
        }

        System.out.println("\nEnter a number: ");
        number_arrangement = num.nextInt();

        System.out.print(" Enter a position from 0 - 9: ");
        position = num.nextInt();

        //Run a position the elements behind the position that the user wants

        for(int i=7; i>=position;i--){

            number[i+1] = number[i];
        }

        number[position] = number_arrangement;
        

        System.out.println(" The new arrangement is:");

        for(int i=0; i<9;i++){

            System.out.println("Position"+i+ ": "+number[i]);
        }
    }
}
