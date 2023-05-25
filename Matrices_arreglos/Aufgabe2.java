package Matrices_arreglos;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String [] args){
        Scanner entry = new Scanner(System.in);
        int sum_A [][] = new int [3][3];
        int sum_B [][] = new int [3][3];
       

        System.out.println("Matrix A: ");
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter one number ["+i+"]["+j+"]");
                sum_A [i][j] = entry.nextInt();
            }
        }
        System.out.println("Matrix B: ");
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter one number ["+i+"]["+j+"]");
                sum_B [i][j] = entry.nextInt();
            }
        }
        
        int result [][] = new int[3][3];

        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                
                result[i][j] = sum_A[i][j] + sum_B[i][j];
            }
        }

        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                
                System.out.print(result[i][j]+"|");
            }
            System.out.println("----------");
        }
    }
}
