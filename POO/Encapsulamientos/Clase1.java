package POO.ClasesyObjetos.Encapsulamientos;
//Metodos accesores Getters y Setters

public class Clase1 {
    
    private int edad;
    private String nombre;

    //Setter : Establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;

    }
    //Getter : Mostramos la edad
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
   
}
