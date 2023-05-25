package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe13 {
    
    public static void main(String [] args){
        Scanner entry = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int n_par= 0,n_odd=0;

        //We ask for 10 numbers from the user
        for(int i=0; i<10; i++){

            System.out.print((i)+" "+" Enter a number:");
            A[i] = entry.nextInt();

            if(A[i]%2 == 0){

                n_par++;
            } else{

                n_odd++;
            }
        }

        int[] par = new int [n_par];
        int[] odd = new int[n_odd];

        n_par = 0;
        n_odd= 0;

        for(int i=0; i<10; i++){
            if(A[i] %2 == 0){
                
                par[n_par] = A[i];
                n_par++;

            }else{

                odd[n_odd] = A[i];
                n_odd++;
            }
        }

        for(int i=0; i< n_par; i++){

            System.out.print(par[i]+"-");
        }

        System.out.println("         ");

        for(int i=0; i< n_odd; i++){
            System.out.print(odd[i]+"-");
        }
    }
}
