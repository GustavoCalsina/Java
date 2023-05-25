package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe14 {
    
    public static void main(String[] args ){

        int higher_salary = 0;
        float salary,sum_salary = 0;

        for(int i = 1; i <= 10; i++){

            salary = Float.parseFloat(JOptionPane.showInputDialog("Enter the salary: "));

            if(salary > 1000){

                higher_salary++;
            }

            sum_salary += salary;
        }

        System.out.println("The total sum of the salarys is: "+ sum_salary);
        System.out.println("There "+higher_salary+" salarys higheres a 1000.");
    }
}
