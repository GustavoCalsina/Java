package POO.ClasesyObjetos.ClaseyMetodosAbstractos;


public class Principal {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animal = new AnimalCarnivoro();

        planta.alimentarse();   
        animal.alimentarse();
    }
}
