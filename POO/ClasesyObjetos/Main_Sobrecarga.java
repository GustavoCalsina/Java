package POO.ClasesyObjetos;

public class Main_Sobrecarga {
    public static void main(String []args){
        Sobrecarga_Metodos p1 = new Sobrecarga_Metodos("Mar",19);
        p1.correr();

        Sobrecarga_Metodos p2 = new Sobrecarga_Metodos("2342323");
        p2.correr(100);

    }
}
