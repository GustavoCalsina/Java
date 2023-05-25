package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe10 {
    
    public static void main(String [] args){

        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Write one day"));
        month = Integer.parseInt(JOptionPane.showInputDialog(null, "Write one month"));
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Write one year"));

        if (year == 0){

            JOptionPane.showMessageDialog(null,"Error in the year");
        } else if(month == 2 && day >= 1 && day < 28){

            JOptionPane.showMessageDialog(null, "Correct date");
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day >= 1 && day <= 31)){

            JOptionPane.showMessageDialog(null, "Correct date");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day >= 1 && day <= 30)){

            JOptionPane.showMessageDialog(null, "Correct date");
        } else {

            JOptionPane.showMessageDialog(null, "Error some day does not coincide with a month");
        }

    }
}
