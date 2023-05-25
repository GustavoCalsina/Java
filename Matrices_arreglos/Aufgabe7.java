package Matrices_arreglos;

import java.util.Scanner;

public class Aufgabe7 {
    public static void main(String []args){
        
        Scanner entry = new Scanner(System.in);
        int matrix [][] = new int [5][5];

        //matrix

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                
                if(i==0 || i==4){
                    matrix[i][j] = 1;

                } else if(j==0 || j==4){

                    matrix[i][j] = 1;
                }

            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
