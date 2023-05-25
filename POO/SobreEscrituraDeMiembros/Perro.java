package POO.ClasesyObjetos.SobreEscrituraDeMiembros;

public class Perro extends Animal {
    
    /*
     * la anotacion @Override sirve para sobreeescribir un metodo
     * Es como un tag para indicar que el metodo se esta sobreescribiendo
     * No dara ninigun error sin se pone
     */
    
    @Override
    public void comer(){
        System.out.println("Estoy comiendo con la boca mi comida de perro");
    }
}
