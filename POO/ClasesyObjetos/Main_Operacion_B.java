package POO.ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main_Operacion_B {
    public static void main(String []args){

        Operacion_B op = new Operacion_B();

        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        op.suma(n1,n2);
        op.resta(n1, n2);
        op.division(n1, n2);
        op.multiplicacion(n1,n2);
        op.mostrarResultado();
    }
}
