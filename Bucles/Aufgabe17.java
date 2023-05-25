package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe17 {
    
    public static void main(String[] args){

        int code, liters, price_liter, invoice;
        int invoice_total= 0, litersArticle1 = 0 , invoices_high = 0;

        for(int i = 1; i <= 5; i++){

            code = Integer.parseInt(JOptionPane.showInputDialog("Enter the invoice code "+i+" :"));
            liters = Integer.parseInt(JOptionPane.showInputDialog("Enter the invoice quantity sold in liters "+i+" :"));
            price_liter = Integer.parseInt(JOptionPane.showInputDialog("How much was paid on the invoice "+i+ " :"));
            
            invoice = liters * price_liter; //Amount per invoice

            invoice_total += invoice; //Iterative sum of the invoices
            
            if(code == 1){
                
                litersArticle1 += liters;
            }

            if(price_liter > 600){

                invoices_high++;
            }

        }

        System.out.println("The amount of liters in the invoice 1 sold is: "+ litersArticle1);
        System.out.println("The total invoice amount is: "+invoice_total);
        System.out.println("The following were issued"+invoices_high+ "invoices of more than 600 euros. ");
    }
}