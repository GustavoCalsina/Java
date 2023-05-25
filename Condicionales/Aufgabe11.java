package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe11 {
    
    public static void main(String [] args){

        char calculator;
        int number1, number2;
        int sum, subtract, multiplication, division;

        
        calculator = JOptionPane.showInputDialog(null, "Choose an operation: S/s = sum - R/r = subtract - M/m = multiplicacion - D/d = Division :").charAt(0);

        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number "));
        

        switch (calculator){

            case 's':
            case 'S': sum = number1 + number2;
                      JOptionPane.showMessageDialog(null, "Result: " + sum);
                      break;
            case 'r':
            case 'R': subtract = number1 - number2;
                      JOptionPane.showMessageDialog(null, "Result: " + subtract);
                      break;
            case 'm':
            case 'M': multiplication = number1 * number2;
                      JOptionPane.showMessageDialog(null, "Result: " + multiplication);
                      break;
            case 'd':
            case 'D': division = number1 / number2;
                      JOptionPane.showMessageDialog(null, "Result: " + division);
                      break;
            default: JOptionPane.showMessageDialog(null, "The character does not match the menu"); break;
        }             

    }
}
