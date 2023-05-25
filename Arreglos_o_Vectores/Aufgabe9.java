package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe9 {
    public static void main(String []args ){

        Scanner arrangement = new Scanner(System.in);
        int[] number = new int[10];
        int last;

        for(int i=0; i<10;i++){
            System.out.print((i)+".- Enter the number ");
            number[i] = arrangement.nextInt();

        }
        last = number[9];

        for(int i=0; i<10;i++){
            System.out.print(number[i]+"-");

        }
        for(int i=8; i>=0;i--){

            number[i+1] = number[i];
        }

        number[0] = last;

        for(int i=0; i<10;i++){

            System.out.println("The arrangement is:  "+number[i]);
        }
    }
}
