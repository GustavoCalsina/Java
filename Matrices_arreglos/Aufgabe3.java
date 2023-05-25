package Matrices_arreglos;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String []args){

        Scanner entry = new Scanner(System.in);
        int matrix[][] = new int [3][3];

        System.out.println("matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter one number ["+i+"]["+j+"]: ");
                matrix[i][j] = entry.nextInt();
            }
        }

        //matrix original

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        //Transposing the matrix
        int aux;
        for(int i=0; i<3; i++){
            for(int j=0; j<i; j++){
                 aux = matrix[i][j];
                matrix[i][j] = matrix [j][i];
                matrix[j][i] = aux;
            }
        }
        System.out.println("The transposed matrix: ");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}    