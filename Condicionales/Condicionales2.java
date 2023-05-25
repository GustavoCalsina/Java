package Condicionales;

import javax.swing.JOptionPane;

/* La sentencia swicht:

    swicht(dato){
        case 1: Instrucciones1;
                break;
        case 2: Instrucciones2;
                break;
        .....

        case n: InstruccionesN;
                break;
        default: CasoContrario;
                break;

    }

*/

public class Condicionales2 {
    
    public static void main(String [] args){

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce one number between 1 - 5: "));

        switch (dato){

            case 1: JOptionPane.showMessageDialog(null, "it's the number 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "ist's the number 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "ist's the number 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "ist's the number 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "ist's the number 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "The number is not in the Range");  
        }

    }
}
