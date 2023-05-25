package Matrices_arreglos;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String []args){
        Scanner entry = new Scanner(System.in);
        int entryMatrix[][] = new int [7][7];
        
       
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
            
                if(j == i){
                    entryMatrix[i][j] = 1;
                }else {
                    entryMatrix[i][j] = 0;
                }

            }
        }

        for(int i=0; i<7;i++){
            for(int j=0; j<7; j++){
                System.out.print(entryMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
