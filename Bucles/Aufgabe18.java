package Bucles;

import javax.swing.JOptionPane;

public class Aufgabe18 {
    
    public static void main(String [] args){

        
        int code,liters;
        int litersArticle1 = 0 , invoices_altas = 0;
        float invoice,price_liter= 0, invoice_total= 0;

        for(int i = 1; i <= 5; i++){

            do{
                code = Integer.parseInt(JOptionPane.showInputDialog("Enter the invoice code "+i+" :"));
            }while(code <1 || code >3);
           
            liters = Integer.parseInt(JOptionPane.showInputDialog("Enter the invoice quantity sold in liters "+i+" :"));
            

            switch (code){

                case 1: price_liter = 0.6f;
                        break;
                
                case 2: price_liter = 3f;
                        break;
                
                case 3: price_liter = 1.25f;
                        break;

            }

            invoice = (float) liters * price_liter; //Amount per invoice

            invoice_total += invoice; //Iterative sum of the invoices
            
            if(code == 1){
                
                litersArticle1 += liters;
            }

            if(invoice > 600){

                invoices_altas++;
            }

        }

        System.out.println("The amount of liters in the invoice 1 sold is: "+ litersArticle1);
        System.out.println("The total invoice amount is: "+invoice_total);
        System.out.println("The following were issued"+invoices_altas+ " invoices of more than 600 euros. ");
    }
}
