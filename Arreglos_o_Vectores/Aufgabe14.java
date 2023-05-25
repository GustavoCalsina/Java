package Arreglos_o_Vectores;
import java.util.Scanner;

public class Aufgabe14 {
    public static void main(String []args){

        Scanner entry = new Scanner(System.in);
        int[] number_a = new int [10];
        int[] number_b = new int [10];
        boolean growing = false;
        
        System.out.println("Type the first array: ");

        do{
            for(int i=0; i<10; i++){

                System.out.print((i)+" "+"Enter a number:");
                number_a[i] = entry.nextInt();
            }
            for(int i=0; i<9;i++){

                if(number_a[i] < number_a[i+1]){

                    growing = true;
                }
                if(number_a[i] > number_a[i+1]){
                    
                    growing = false;
                    break;
                }
            }
            if(growing == false){

                System.out.println("\nThe arrangement is not correct, reinsert the numbers.");
            }

        }while(growing = false);

        System.out.println("Type the second array: ");

        do{
            for(int i=0; i<10; i++){

                System.out.print((i)+" "+"Enter a number:");
                number_b[i] = entry.nextInt();
            }
            for(int i=0; i<9;i++){

                if(number_b[i] < number_b[i+1]){

                    growing = true;
                }
                if(number_b[i] > number_b[i+1]){
                    
                    growing = false;
                    break;
                }
            }
            if(growing == false){

                System.out.println("\nThe arrangement is not correct, reinsert the numbers.");
            }

        }while(growing = false);

        int[] number_c = new int[20];

        int i = 0; //Iterator a
        int j = 0; //Iterator b
        int k = 0; //Iterator c

        while(i<10 && j < 10){

            if(number_a[i] < number_b[j]){

                number_c[k] = number_a[i];
                i++;
            }else{

                number_c[k] = number_b[j];
                j++;
            }
            k++;
        }

        if(i == 0){
            while(j<10){
                number_c [k] = number_b[j];
                j++;
                k++;
            }
        }else{
            while(i<10){
                number_c[k] = number_a[i];
                i++;
                j++;
            }
        }

        for(k=0; k<20; k++){

            System.out.print(number_c[k]+"-");
        }
    }
}