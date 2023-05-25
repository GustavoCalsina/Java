package POO.ClasesyObjetos.Encapsulamientos;

public class Clase2 {
    public static void main(String []args){

        Clase1 objeto1 = new Clase1();

        objeto1.setEdad(19);
        System.out.println("La edad es: "+objeto1.getEdad());

        objeto1.setNombre("Mar");
        System.out.println("Me llamo "+objeto1.getNombre());

    }
}
