package Arreglos_o_Vectores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglos2 {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        int nElements;

        nElements = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Anzahl der Elemente im Array an:"));

        char[] letras = new char [nElements];
        
        System.out.println("Geben Sie die Elemente des Arrays ein:");

        for (int i = 0; i< nElements ; i++){

            System.out.print( (i+1)+".- Geben Sie ein Zeichen ein: ");

            letras [i] = entrada.next().charAt(0); 

        }

        System.out.println("Die Charaktere des Arrangements sind: ");

        for(int i = 0; i<nElements; i++){

            System.out.print(letras[i]+ " ");
        }
    }
}
