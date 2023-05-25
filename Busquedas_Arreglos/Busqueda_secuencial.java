/*
 * Busqueda secuencial:
 * 
 * arreglo[] = {3,2,1,4,6}; dato = 2;
 */

package Busquedas_Arreglos;

import javax.swing.JOptionPane;

public class Busqueda_secuencial {
    public static void main(String []args){
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero a buscar: "));

        //Busqueda secuencial
        int i=0;
        while(i<5 && band == false ){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if(band == false){
            JOptionPane.showMessageDialog(null,"No se encuentra en el arreglo.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado: "+(i-1));
        }
    }

}
