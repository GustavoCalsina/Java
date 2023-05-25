package POO_Flughafen;

import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4; //number of airport
    static Airport airports[] = new Airport[num];

    public static void main(String[] args){
        //insertar datos del los aeropuertos
        insertDataAirport(airports);
        menu();
    }

    public static void insertDataAirport(Airport air[]){

        //Public Airport 

        air[0] = new PublicAirport(80000000, "Pink","Madrid", "España");
        air[0].insertCompany(new Company("Iberia"));
        air[0].insertCompany(new Company("AEsp"));
        air[0].getCompany("Iberia").insertFlight( new Flight("IB20", "Madrid", "Germany", 150.90, 150));
        air[0].getCompany("Iberia").insertFlight(new Flight("IB21", "Madrid", "England", 190.90, 120));
        air[0].getCompany("AEsp").insertFlight(new Flight("FC21", "Madrid", 	"Peru", 6000, 150));
        air[0].getCompany("Iberia").getFlight("IB20").insertPassenger(new Passenger("Pacou", "23453-W", "Español"));
        air[0].getCompany("Iberia").getFlight("IB21").insertPassenger(new Passenger("Juan", "34565PF", "Frances"));
        air[0].getCompany("AEsp").getFlight("FC21").insertPassenger(new Passenger("Marcos", "34532P", "Italiano"));

        //Private Airport 

        air[1] = new PrivateAirport("Barajas", "Munich", "Germany");
        air[1].insertCompany(new Company("Luftansa"));
        String companys[] = {"Cobresol" , "Angular"};
        ((PrivateAirport)air[1]).insertCompanys(companys);
        air[1].getCompany("Luftansa").insertFlight(new Flight("AE30", "Madrid", "Francia", 2000, 160));
        air[1].getCompany("Luftansa").getFlight("AE30").insertPassenger(new Passenger("Oscar", "3345234R", "Ruso"));

        //Public Airport

        air[2] = new PublicAirport(40000000, "Airport Las Palmas", "Gran Canaria", "España");
        air[2].insertCompany(new Company("AirAmerica"));
        air[2].insertCompany(new Company("Condor"));
        air[2].getCompany("AirAmerica").insertFlight(new Flight("AA003", "Canarias", "Barcelona", 200, 150));
        air[2].getCompany("AirAmerica").insertFlight(new Flight("AA002","Canarias", "Barcelona", 300, 150));
        air[2].getCompany("AirAmerica").getFlight("AA003").insertPassenger(new Passenger("Marco", "345344PG", "Italiano"));
        air[2].getCompany("AirAmerica").getFlight("AA002").insertPassenger(new Passenger("Juan", "567989PP", "Frances"));

        //Public Airport

        air[3] = new PublicAirport(90000000, "Bara", "Berlin", "Germany");
        air[3].insertCompany(new Company("AirMexico"));
        air[3].getCompany("AirMexico").insertFlight(new Flight("IB234", "Mexico", "New York", 3000, 150));
        air[3].getCompany("AirMexico").insertFlight(new Flight("IB235", "Mexico", "London", 4000, 180));
        air[3].getCompany("AirMexico").getFlight("IB234").insertPassenger(new Passenger("Jorge", "56789P", "Mexicano"));

    }

    public static void menu(){
        String nameCompany, nameAirport, destination, origin;
        int option;
        Company company;
        Airport airport;
        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1.- See airports created (Public or Privated)");
            System.out.println("2.- See Companys (Private) or Subvention (Public)");
            System.out.println("3.- Airport Company List ");
            System.out.println("4.- List of flights by company");
            System.out.println("5.- Show all available flights");
            System.out.println("6.- Exit");
            System.out.print("Option: ");
            option = entrada.nextInt();

            switch(option){
                case 1: //See airports created (Public or Privated)
                        System.out.println("");
                        showDataAirports(airports);
                        break;
                case 2: //See Companys (Private) or Subvention (Public)
                        System.out.println("");
                        showSponsorships(airports);
                        break;
                case 3: // Airport Company List
                        entrada.nextLine();
                        System.out.println("Which name do you will search?: ");
                        nameAirport = entrada.nextLine();
                        airport = searchAirport(nameAirport, airports);

                        if(airport == null){
                            System.out.println("The Airport wasn't found");
                        }else {
                            showCompanys(airport);
                        }
                        break;
                case 4: // List of flights by company
                        entrada.nextLine();
                        System.out.println("Say the name of one Airport: ");
                        nameAirport = entrada.nextLine();

                        airport = searchAirport(nameAirport, airports);

                        if(airport == null){
                            System.out.println("The Airport wasn't found");
                        } else {
                            System.out.println("Say the name of Company:");
                            nameCompany = entrada.nextLine(); 
                            company = airport.getCompany(nameCompany);
                            showFlight(company);
                        }
                        break;
                case 5: // Show all available flights
                        entrada.nextLine();
                        System.out.println("Say a Origin City: ");
                        origin = entrada.nextLine();
                        System.out.println("Say the Destiny: ");
                        destination = entrada.nextLine();
                        showFlightsOriginDestination(origin, destination, airports);

                        break;
                case 6: break;
                default : System.out.println("Error");
            }
        } while (option != 6);
    }

    public static void showDataAirports(Airport airports[]){

        for(int i=0; i<airports.length; i++){
             if(airports[i] instanceof PrivateAirport){
                System.out.println("Private Airport");
                System.out.println("Name: "+ airports[i].getName());
                System.out.println("City: "+ airports[i].getCity());
                System.out.println("Country: "+ airports[i].getCountry());
             } else {

                System.out.println("Public Airport");
                System.out.println("Name: "+ airports[i].getName());
                System.out.println("City: "+ airports[i].getCity());
                System.out.println("Country: "+ airports[i].getCountry());
             }
             System.out.println("");
        }
    }

    public static void showSponsorships(Airport airports[]){

        String  companys[];

        for(int i=0; i<airports.length; i++){
            if(airports[i] instanceof PrivateAirport){
                System.out.println("Private Airport");
                System.out.println("Name: " + airports[i].getName());
                companys = ((PrivateAirport)airports[i]).getCompanyList();
                System.out.println("Empresas: ");
                for(int j=0; j<companys.length; j++){
                    System.out.println(companys[j]);
                }
            } else {
                System.out.println("Public Airport");
                System.out.println("Name: " + airports[i].getName());
                System.out.println("Subvnetion: "+ ((PublicAirport)airports[i]).getSubvention());
                System.out.println("");
            }
        }  
    }

    public static Airport searchAirport(String name, Airport airport[]){
        boolean found = false;
        int i = 0;

        Airport air = null;

        while((!found)&& (i < airport.length)){

            if (name.equals(airport[i].getName())){
                found = true;
                air = airport[i];
            }
            i++;
        }
        return air;
    }
    public static void showCompanys(Airport airport){
        System.out.println("\nThe Companys : " + airport.getName());
        for(int i=0; i<airport.getNumCompany(); i++){
            System.out.println(airport.getCompany(i).getName());
        }
    }

    public static void showFlight(Company company){

        Flight flight;
        System.out.println("The Flight of Company are: ");
        for(int i=0; i<company.getNumFlight(); i++){

            flight = company.getFlight(i);
            System.out.println("Identifier: " + flight.getIdentifer());
            System.out.println("Country Start: " + flight.getOriginCity());
            System.out.println("Country End: " + flight.getDestinationCity());
            System.out.println("Price: " + flight.getPreis());
            System.out.println("");
        }
    }

    public static Flight [] searchFlightsOriginDestination(String origin,String destination, Airport airport []){

        Flight flight;
        int contador = 0;
        Flight flightList[];

        for(int i=0; i<airport.length; i++){ //Recorremos los aeropuertos
            for(int j=0; j<airport[i].getNumCompany(); j++){ //Recorremos las compañias
                for(int k=0; k<airport[i].getCompany(j).getNumFlight();k++){
                    flight = airport[i].getCompany(j).getFlight(k);
                    if((origin.equals(flight.getOriginCity())) && (destination.equals(flight.getDestinationCity()))){
                        contador++;
                    }
                }
            }
        }

        flightList = new Flight[contador];
        int q = 0;

        for(int i=0; i<airport.length;i++){
            for(int j=0; j<airport[i].getNumCompany(); j++){
                for(int k=0; k<airport[i].getCompany(j).getNumFlight();k++){
                    flight = airport[i].getCompany(j).getFlight(i);
                    if((origin.equals(flight.getOriginCity())) && (destination.equals(flight.getDestinationCity()))){
                        flightList[q] = flight;
                        q++;
                    }
                }
            }
        }

        return flightList;
    }
    public static void showFlightsOriginDestination(String origin, String destination, Airport airport[]){

        Flight flight[];
        flight = searchFlightsOriginDestination(origin, destination, airport);

        if(flight.length == 0){
            System.out.println("Dont exist Flights.");
        } else {

            System.out.println("Flights found");
            for(int i=0; i<flight.length; i++){

                System.out.println("Indetifier: "+ flight[i].getIdentifer());
                System.out.println("Origin City: " + flight[i].getOriginCity());
                System.out.println("Destini City: "+ flight[i].getDestinationCity());
                System.out.println("Price: " + flight[i].getPreis());
                System.out.println("");
            }
        }
    }
}
