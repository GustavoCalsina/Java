package Matrices_arreglos;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aufgabe5 {
    public static void main(String []args){
        Scanner entry = new Scanner(System.in);
        int matrix[][], nRows, nColumns,sumRows, sumColumns;

        nRows = Integer.parseInt(JOptionPane.showInputDialog(" Insert a number of rows:"));
        nColumns = Integer.parseInt(JOptionPane.showInputDialog("Insert a number of Columns:"));

        matrix = new int [nRows][nColumns];

        for(int i=0; i< nRows; i++){
            for(int j=0; j< nColumns; j++){
                System.out.print("Enter one number ["+i+"]["+j+"]: ");
                matrix[i][j] = entry.nextInt();
            }
        }

        // sum de Rows y Columns;

        for(int i=0; i< nRows; i++){
            sumRows= 0;
            for(int j=0; j< nColumns; j++){
               sumRows += matrix[i][j];
            }
            
            System.out.println("The sum of the row ["+i+"] is: " +sumRows);
        }
        System.out.println("");

        //sum de Columns
        
        for(int j=0; j< nColumns; j++){
            sumColumns= 0;
            for(int i=0; i< nRows; i++){
               sumColumns += matrix[i][j];
            }
            
            System.out.println("The sum of the column ["+j+"] is: " +sumColumns);
        }
        System.out.println("");


    }       
}
