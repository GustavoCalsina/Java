package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe7 {
    public static void main(String []args){

        Scanner num = new Scanner(System.in);
        int [] number = new int [10];
        boolean growing = false, decreasing =false;

        for(int i=0; i<10; i++){

            System.out.print((i+1)+".- Enter a number: ");
            number[i] = num.nextInt();
        }


        for(int i=0; i<9;i++){
            if (number[i] < number[i+1]){ //growing
                growing = true;
            }

            if(number[i] > number[i+1]){ //decreasing
                decreasing = true;
            }
        }

        if(growing == true && decreasing == false){
            System.out.println("The arrangement is increasing");

        }else if(growing == false && decreasing == true){
            System.out.println("The arrangement is decreasing");

        }else if(growing== true && decreasing == true){
            System.out.println("The arrangement is messy");
            
        }else if(growing == false && decreasing == false){
            System.out.println("The arrangement is repeated");
        }
    }
}
