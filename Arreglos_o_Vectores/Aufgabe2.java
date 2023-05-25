package Arreglos_o_Vectores;

import javax.swing.JOptionPane;

public class Aufgabe2 {
    
    public static void main(String[] args){

        float numbers[] = new float [5];
        float nSaved;

        for(int i= 0; i < 5; i++){

            nSaved = Float.parseFloat(JOptionPane.showInputDialog("Geben Sie die Zahlen ein: "));

            numbers [i] = nSaved;
        }

        for(int i = 4 ; i >= 0; i--) {

            System.out.println(numbers[i]);
        }

    }
}
