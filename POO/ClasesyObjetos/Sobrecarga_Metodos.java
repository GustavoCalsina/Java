package POO.ClasesyObjetos;

public class Sobrecarga_Metodos {
    //Atributos
    String nombre;
    int edad;
    String dni;

    //Metodos

    public Sobrecarga_Metodos(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Sobrecarga_Metodos(String dni){
        this.dni = dni;
    }

    public void correr(){
        System.out.println("Soy "+nombre+" ,tengo "+edad+" años y estoy corriendo una maraton.");
    }
    public void correr(int km){
        System.out.println("He corrido "+ km+" Kilimetros.");
    }
}
