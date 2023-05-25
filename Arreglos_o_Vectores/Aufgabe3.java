package Arreglos_o_Vectores;

import java.util.Scanner;

public class Aufgabe3 {
    
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);
        float number [] = new float [5];

        float sum_positiv = 0, sum_negativ= 0,average_positive, average_negative;
        int nullNumber= 0, positive = 0, negative= 0;

        for(int i = 0; i <5; i++){

            System.out.print((i+1)+".- Geben Sie eine Nummer ein: ");
            number[i] = num.nextFloat();

            if(number [i] == 0){
                nullNumber++;

            }else if(number[i] > 0){
                sum_positiv += number[i];
                positive++;

            }else{
                sum_negativ += number[i];
                negative++;
            }         
        }

        //Average of positive numbers

        if (sum_positiv == 0){
            System.out.println("Es gibt keine positiven Zahlen");

        } else {
            average_positive = sum_positiv/ positive;
            System.out.println("Der Durchschnitt der positiven Zahlen ist: "+average_positive);
        }

        if (sum_negativ == 0){
            System.out.println("Es gibt keine negativen Zahlen");

        } else{
            average_negative = sum_negativ / negative;
            System.out.println("Der Durchschnitt der negativen Zahlen ist:"+ average_negative);
        }

        System.out.println(" Die Anzahl der Nullen ist: "+nullNumber);

    }
}
