package Bucles;
import javax.swing.JOptionPane;


public class Aufgabe13 {
    
    public static void main(String [] args){

        int number, sum_pos = 0, count_pos = 0, sum_neg= 0, count_neg= 0, count_null= 0;
        float average_pos, average_neg;

        for(int i=1; i <= 10; i++){

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number "));

            if(number == 0){ //if the number is 0

                count_null++; //increases by 1 the counter of 0

            } else if(number > 0){ //if the number is positive

                sum_pos += number; //iterative sum of positives
                count_pos++; 

            } else{  // if the number is negative

                sum_neg += number;
                count_neg++;
            }
        }

        //We deal with positives

        if(count_pos == 0){

            System.out.println("You can't take the average out of the positives");

        } else{

            average_pos = (float) sum_pos/count_pos;

            System.out.println("The average of the positive numbers is: "+ average_pos);
        } 

        //We deal with negatives

        if(count_neg == 0){

            System.out.println("You can't take the average of the negatives");
        } else {

            average_neg = (float) sum_neg/ count_neg;

            System.out.println("The average of the negative numbers is: "+average_neg);
        }

        System.out.println("The amount of null is: "+ count_null);

    }
}