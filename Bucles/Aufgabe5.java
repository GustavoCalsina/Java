package Bucles;
import javax.swing.JOptionPane;

public class Aufgabe5 {
    
    public static void main(String [] args){

        int number,random,attempts= 0;
        

        random = (int)(Math.random()*100); //Generate a random number between 0 - 100
        
        do{
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

            if(random > number){
                System.out.println("Enter a larger number");
            } else{

                System.out.println("Enter a lower number");
            }

            attempts++;

        }while(number != random); 
        
        System.out.println("\nGreat!!! You guessed the number in: "+attempts+" attempts.");
    }
}
