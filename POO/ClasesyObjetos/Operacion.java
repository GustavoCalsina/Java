package POO.ClasesyObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    
    //Atributo

    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    //Metodos para pedir al usuario que nos digite 2 numeros

    public void leerNumeros(){

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }
    public void sumar(){
        suma = numero1 + numero2;    
    }
    public void resta(){
        resta = numero1 - numero2;   
    }
    public void multiplicacion(){
        multiplicacion = numero1 * numero2;  
    }
    public void division(){
        division = numero1 / numero2;    
    }
    public void mostrarResultado(){

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
