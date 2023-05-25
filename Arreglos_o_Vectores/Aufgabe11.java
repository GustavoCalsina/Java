package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe11 {
    public static void main(String []args){

        Scanner arreglo = new Scanner(System.in);
        int[] number = new int[10];
        int n_choose, site_num = 0, j=0;

        for(int i=0; i<5;i++ ){

            System.out.print((i)+" Enter the number ");
            number[i] = arreglo.nextInt();
        }

        System.out.print("Enter a number to insert: ");
        n_choose= arreglo.nextInt();

        while(number[j] < n_choose&& j < 5){

            site_num++;
            j++;
        }

        for(int i=4; i>= site_num; i--){

            number[i+1] = number[i];
        }

        number[site_num] = n_choose;
    
        
        for(int i=0; i<10; i++){

            System.out.println((i)+" "+number[i]);
        }

           
    }
}
