package Matrices_arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aufgabe1 {
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        int matrix[][], nRow, nColumns;
        boolean symmetric = true;
        

        nRow = Integer.parseInt(JOptionPane.showInputDialog("Enter how many rows the array will have: "));
        nColumns= Integer.parseInt(JOptionPane.showInputDialog("Type how many Columns the array will have: "));

        matrix = new int [nRow][nColumns];

        System.out.println("matrix: ");
        for(int i=0; i<nRow; i++){
            for(int j=0; j<nColumns; j++){
                System.out.print("matrix: ["+i+"] ["+j+"]");
                matrix[i][j] = entry.nextInt();
            }
        }

        if(nColumns == nRow){
            int i,j;
            i=0;
            while(i<nRow && symmetric == true){
                j=0;
                while(j<nColumns && symmetric == true){

                    if(matrix[i][j] != matrix[j][i]){
                        symmetric = false;
                    }
                    j++;
                }
                i++;
            }
            
            if(symmetric == true){
                System.out.println("The matrix is symmetric.");
            }
            else{
                System.out.println("The matrix is not symmetric.");
            }
        }else{
            System.out.println("Not symmetric");
        }
        
    }
}
