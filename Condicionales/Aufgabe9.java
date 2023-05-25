package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe9 {
    
    public static void main(String [] args){

        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a day"));
        month = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a month"));
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a year"));

        if(day <= 0 || day > 30 ){
            JOptionPane.showMessageDialog(null, "The days indicated are incorrect");
        } else if ( month <= 0 || month > 12){
            JOptionPane.showMessageDialog(null, "The indicated month does not exist");
        } else if (year <= 0 || year < 1000){
            JOptionPane.showMessageDialog(null, "Error in the year");
        } else {
            JOptionPane.showMessageDialog(null, "The date "+day+" - "+month+" - "+year+" is not right.");
        }


    }
}
