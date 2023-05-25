package Condicionales;
import javax.swing.JOptionPane;

public class Aufgabe4 {
    
    public static void main(String [] args){

        float discount,purchase;
        

        purchase = Float.parseFloat(JOptionPane.showInputDialog(null, "How much is the total amount of your purchase?" ));

        if(purchase > 300){

            discount = purchase * 0.20f ;

            purchase = purchase - discount;

            JOptionPane.showMessageDialog(null, "You were discounted 20%, you will have to pay "+ purchase);
        } else {
            JOptionPane.showMessageDialog(null, "you will not receive a discount, since your purchase is less than 300");
        }
    }
}