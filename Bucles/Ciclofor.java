package Bucles;
import java.util.Scanner;

/*
 * Ciclo for
 * 
 * for(inicializacion; condicion; aumento o decremento){
 *  	Instrucciones;
 * }
 * 
 */
public class Ciclofor {
   
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        int contador;

        System.out.println("Digite la cantidad de terminos: ");
        contador  = entrada.nextInt();

        for(int i=1; i <= contador; i++){

            System.out.println(i);
        }

    }
}
