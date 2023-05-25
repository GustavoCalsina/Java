package POO.ClasesyObjetos;

public class Operacion_B {
    //Atributo
    
    int sumar;
    int resta;
    int multiplicacion;
    int division;

    //Metodo
    //Metodo para sumar ambos numeros
    public void suma(int numero1, int numero2){
        sumar = numero1 + numero2;
    }
    public void resta(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    public void multiplicacion(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }
    public void division(int numero1, int numero2){
        division = numero1 / numero2;
    }
    public void mostrarResultado(){

        System.out.println("La suma es: "+sumar);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
   

}
