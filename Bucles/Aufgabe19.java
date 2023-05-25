package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe19 {
    
    public static void main(String[] args){

        float notes ; 
        int approved = 0, condicionados= 0, failures= 0;

        for(int i = 1; i <= 6 ; i++){

            do{
                notes = Float.parseFloat(JOptionPane.showInputDialog("Enter the "+i+" note: "));
                
            } while(notes <0 || notes > 10);
           

            if (notes >= 5){

                approved++;

            }else if(notes == 4 ){

                condicionados++;

            }else{

                failures++;
            }
        }

        System.out.println("notes:\n approved: "+approved+"\n condicionados: "+condicionados+"\n failures: "+failures);

    }
}
