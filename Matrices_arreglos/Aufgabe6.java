package Matrices_arreglos;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String []args){
        Scanner entry = new Scanner(System.in);
        int matrix_A [][] = new int [5][9];
        int matrix_B [][] = new int [9][5];

        //matrix A

        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                System.out.print("Enter one number ["+i+"]["+j+"] : ");
                matrix_A [i][j] = entry.nextInt();
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                System.out.print(matrix_A[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("------------------");
        
        //Trasponemos

        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                matrix_B[j][i] = matrix_A[i][j];
            }
        }

        System.out.println("------------------");

        for(int i=0; i<9; i++){
            for(int j=0; j<5; j++){
                System.out.print(matrix_B[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
