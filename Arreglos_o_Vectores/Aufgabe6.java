package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe6 {
    
    public static void main(String []args){
        Scanner num = new Scanner(System.in);

        int A[] = new int [12];
        int B[] = new int [12];
        int C[] = new int [24];

        //Storage of A
        for(int i=0; i<12; i++){

            System.out.print((i+1)+".- First numb: ");
            A[i] = num.nextInt();
        }
        //Storage of B
        for(int i=0; i<12; i++){

            System.out.print((i+1)+".- First numb: ");
            B[i] = num.nextInt();
        }

        //A y B on C
        
        int j = 0;
        for(int i=0; i<12;i++){
            
            for(int k=0; k<3;k++){
                C[j] = A[k+i];
                j++;
            
            }
            for(int k=0; k<3;k++){
                C[j] = B[k+i];
                j++;
                
            }
            
            i+=2;
        }

        System.out.println("Array C: ");

        for(int i=0; i<24; i++){

            System.out.print(C[i]+"-");
        }
    }
}
