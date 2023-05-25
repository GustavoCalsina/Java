package Matrices_arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class A_Matriz {
    public static void main(String []args){
        //int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nColumnas;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nColumnas  = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int [nFilas] [nColumnas];

        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("Matriz ["+i+"]["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for(int i=0; i<nFilas; i++){ //numero de filas
            for(int j=0; j<nColumnas;j++){ //numero de columnas
                System.out.print((matriz[i][j]));
            }
            System.out.println("");
        }
    }
}
