package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe15 {
    
    public static void main(String[] args){

        int student_age, sum_age = 0, counter_age = 0, counter_height = 0;
        float student_height , sum_height = 0 ,average_age, average_height;

        for(int i = 1; i<=5; i++){

            student_age = Integer.parseInt(JOptionPane.showInputDialog("Enter the student's age: "));
            student_height = Float.parseFloat(JOptionPane.showInputDialog("Enter the student's height:"));

            if(student_age > 18 || student_height > 1.75){

                counter_age++;
                counter_height++;

            }

            sum_age += student_age;
            sum_height += student_height;
        }
        
        average_age = (float) sum_age/5;
        average_height = (float) sum_height/5;

        System.out.println("The average age is: "+ average_age);
        System.out.println("The average height is : "+average_height);
        System.out.println("The number of students over 18 are:"+counter_age+ " and the height greater than 1.75 are:  "+ counter_height);


    }
}
