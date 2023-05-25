package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe5 {
    
    public static void main(String []args){

        Scanner num = new Scanner(System.in);
        Scanner storage = new Scanner(System.in);
        int saved;

        int[] A = new int [10];
        int[] B = new int [10];
        int[] C = new int [20];

        // Array  A
        for(int i=0; i < 10; i++){

            System.out.print((i+1)+ " Enter the first number: ");
            A[i] = num.nextInt();
        }
        //Array  B
        for(int i=0; i<10;i++){

            System.out.print((i+1)+" Enter the first number: ");
            B[i] = num.nextInt();
        }

        int j = 0;

        for (int i=0; i<10;i++){
            
            C[j] = A[i];
            j++;
            C[j] = B[i];
            j++; 
        }
        
        System.out.println("The third array is: ");

        for(int k=0; k<20; k++){

            System.out.print(C[k]+"-");
        }

    }
}