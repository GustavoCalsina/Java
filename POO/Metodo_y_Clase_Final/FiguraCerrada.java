package POO.Metodo_y_Clase_Final;

/*  
 *Si ponemos "final" a la clase
 *Esta clase no podra tener hijas Clases
 *final se coloca al principio de la clase
 *
 * (final public class FiguraCerrada extends Figura{})
 */
public class FiguraCerrada extends Figura{
    
    private int nlados;

    public FiguraCerrada(int nlados, double tamano){
        super(tamano);
        this.nlados = nlados;
    }

    /*
     * Si ponemos "final" a un metodo 
     * No prada existir ningun metodo que contenga el mismo nombre en las
     * supuestas clases hijas
     * 
     * (public final void dibujar(){})
     */

    public void dibujar(){
        System.out.println("Dibujo de una figura cerrada.");
    }
}
