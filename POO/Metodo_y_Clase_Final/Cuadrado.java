package POO.Metodo_y_Clase_Final;

public class Cuadrado extends FiguraCerrada{
    
    private double area;

    public Cuadrado(double area, double tamano, int nlados){
        super(nlados, tamano);
        this.area = area;
    }

    public void dibujar(){
        System.out.println("Dibujamos cuadrado.");
    }

}
