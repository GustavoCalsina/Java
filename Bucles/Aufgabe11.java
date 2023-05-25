package Bucles;


public class Aufgabe11 {
    
    public static void main(String [] args){

        long product = 1;

       for(int i = 1; i <= 20; i += 2){

            product *= i;
       }

       System.out.println("The product is:"+product);

    }
}
