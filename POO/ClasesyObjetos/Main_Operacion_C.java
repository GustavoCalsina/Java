package POO.ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main_Operacion_C {
    public static void main(String []args){
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        Operacion_C op = new Operacion_C();

        //hay dos maneras de imprimir. Metodo 1
       /*   
            int suma = op.sumar(n1,n2);
            int resta = op.restar(n1, n2);
            int mult = op.multiplicar(n1, n2);
            int div = op.dividir(n1,n2);
        */

        //Metodo 2

        System.out.println("La suma es: "+op.sumar(n1,n2));
        System.out.println("La resta es: "+op.restar(n1,n2));
        System.out.println("La multiplicacion es: "+op.multiplicar(n1,n2));
        System.out.println("La division es: "+op.dividir(n1,n2));
    }
}
