package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe10 {
    public static void main(String []args){

        Scanner arreglo = new Scanner(System.in);
        int[] number = new int[10];
        int n_posicions, n_saved;

        for(int i=0; i<10;i++){
            System.out.print((i)+" Enter the Number ");
            number[i] = arreglo.nextInt();
        }
        
        System.out.print("How many positions you want to advance: ");
        n_posicions = arreglo.nextInt();

        do{ //Loop depending on how many positions the user wants to move forward
            n_saved = number[9];

            for(int i=8; i>= 0;i--){ 
                number[i+1] = number[i];
                
            }
            n_posicions = n_posicions - 1;
            number[0] = n_saved;

        }while(n_posicions > 0);
        
        for(int i=0; i<10; i++){
            System.out.println((i)+" "+number[i]);
        }
    }
}
