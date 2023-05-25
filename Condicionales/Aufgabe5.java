package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe5 {
    
    public static void main(String [] args){
        
        float hoursWorked, totalSalary;

        hoursWorked = Float.parseFloat(JOptionPane.showInputDialog(null,"How many hours did you work in total?"));


        /*If you work 40 or less, you will be paid 16 per hour.*/

        if(hoursWorked <= 40){

            totalSalary = hoursWorked* 16;
            JOptionPane.showMessageDialog(null,"Your weekly salary is "+totalSalary);
        } else{

            totalSalary = (40*16) + ((hoursWorked - 40)*20);

            JOptionPane.showMessageDialog(null,"Your weekly salary with overtime is " + totalSalary);

        }

    }
}
