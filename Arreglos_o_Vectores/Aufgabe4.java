package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe4 {
    
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);
        int[] number = new int [10];

        for(int i=0; i < 10; i++ ){

            System.out.print((i+1)+".- enter the number: ");
            number[i] = num.nextInt();
        }

        for(int i= 0; i<5; i++){

            System.out.print(number[i]+ "-");//primer elemento de larreglo
            System.out.print(number[9-i]+"/");
        }

    }
}
