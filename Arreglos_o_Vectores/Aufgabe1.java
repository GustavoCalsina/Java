package Arreglos_o_Vectores;

import javax.swing.JOptionPane;

public class Aufgabe1 {
    
    public static void main(String []args){

        int numbers [] = new int [5];
        int nSaved;

        for (int i= 0; i<5;i++){

            nSaved = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Nummer ein: "));
            numbers [i] = nSaved;
        }

        for(int i: numbers){

            System.out.println("Numbers:"+i);
        }

    }
}