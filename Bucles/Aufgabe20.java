package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe20 {
    
    public static void main(String [] args){

        int nsalaries;
        float salaries , salary_max = 0;

        nsalaries = Integer.parseInt(JOptionPane.showInputDialog(" Enter the number of salaries:"));

        for(int i= 1; i <= nsalaries; i++){

            salaries = Float.parseFloat(JOptionPane.showInputDialog("Enter the salary No. "+i+ " :"));

            if(salaries > salary_max ){

                salary_max = salaries;
            }
        }

        System.out.println("The salary max is: "+salary_max);
    }
}
