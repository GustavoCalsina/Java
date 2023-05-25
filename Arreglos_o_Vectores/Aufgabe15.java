package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe15 {
    public static void main(String [] args){
        Scanner entry = new Scanner(System.in);
        int[] number = new int[10];
        boolean growing = false; 
        int n_choose, counter = 0;
        do{
            for(int i=0; i<10; i++){
                System.out.print((i)+" Enter a number: ");
                number[i] = entry.nextInt();
            }
            for(int i=0; i<9; i++){
                if(number[i] < number[i+1]){
                    growing = true;
                }
                if(number[i] > number[i+1]){
                    growing = false;
                    break;
                }
            }
            if(growing == false){
                System.out.println("The arrangement is not increasing, retype the numbers: ");
            }
        }while(growing == false);

        System.out.print("What number do you want to search for in the table:");
        n_choose = entry.nextInt();

        for(int i=0; i<10; i++){    

            if(number[i] == n_choose){
                System.out.println("Your number is in the table.");
                System.out.println("The number is located in the position: "+counter); break;
            }
            counter++;
        }
        if(counter == 10){
            System.out.println("The number is not in the table.");
        }
    }   
}
