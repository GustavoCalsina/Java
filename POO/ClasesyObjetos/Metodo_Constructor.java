package POO.ClasesyObjetos;

public class Metodo_Constructor {
    //Atributos

    String name;
    int edad;

    //Metodos

    //Metodo Constructor

    public Metodo_Constructor(String name, int edad){
        this.name = name;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+name);
        System.out.println("La edad es: "+edad);
    }
}
