package POO.Polimorfismo;

public class Principal {
    public static void main(String[] args) {
       /*
        * Conversion ascendente de tipos
        * tambien conocido como Upcasting 
        * 
        * Hacemos que un objeto de la subclase sea un objeta de la clase superior
        */

        //Vehiculo vehiculo = new VehiculoDeportivo(12, "GT7", "Corsa", "A97");


        /*
         * Conversion descendete de tipos
         * tambien conocido como Downcasting
         * 
         * Hacemos lo mismo que arriba solo que al reves
         * 
         * Para hacer un Downcasting , hay que hace un Upcasting
         */

        //Vehiculo vehiculo = new VehiculoTurismo  (12, "GT7", "Corsa", "A97");
        //VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo;
        //System.out.println(nuevoVehiculo);

        Vehiculo vehiculo = new VehiculoDeportivo(500, "GH655", "Audi", "HH9");
        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;

        System.out.println(nuevoVehiculo);

        //Vehiculo misVehiculos[] = new Vehiculo[4];

        //misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        //misVehiculos[1] = new VehiculoTurismo(4, "G45", "Audi", "T14");
        //misVehiculos[2] = new VehiculoDeportivo(12, "TT6", "Volkswagen", "HJ5");
        //misVehiculos[3] = new VehiculoFurgoneta(50, "JK56", "Toyota", "PP3");

        //for(Vehiculo vehiculos: misVehiculos){
        //    System.out.println(vehiculos.mostrarDatos());
        //    System.out.println("");
        //}
    }
}
