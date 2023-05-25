package POO.ClasesyObjetos;

public class Coche {
    
    //Atributos

    String color;
    String marca;
    int km;

    //Metodo

    public static void main(String [] args){

        Coche coche1 = new Coche();

        coche1.color = "Rojo";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca);
        System.out.println("Los Kilometros del coche son: "+coche1.km+" km/h");

        Coche coche2 = new Coche();

        coche2.color = "Blanco";
        coche2.marca = "BMW";
        coche2.km = 100;

        System.out.println("El color del coche es: "+coche2.color);
        System.out.println("La marca del coche es: "+coche2.marca);
        System.out.println("Los Kilometros del coche son: "+coche2.km+" km/h");
        
    }
}