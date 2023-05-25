package POO_Flughafen;

public class Flight {
    
    private String identifier;
    private String originCity;
    private String destinationCity;
    private double preis;
    private int maxNumPassenger;
    private int currentNumPassenger;
    
    private Passenger passengerList[];

    public Flight(String identifer, String originCity, String destinationCity, double preis, int maxNumPassenger){
        this.identifier = identifer;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.preis = preis;
        this.maxNumPassenger = maxNumPassenger;
        this.currentNumPassenger = 0;
        this.passengerList = new Passenger[maxNumPassenger];
    }

    public String getIdentifer(){
        return identifier;
    }
    public String getOriginCity(){
        return originCity;
    }
    public String getDestinationCity(){
        return destinationCity;
    }
    public double getPreis(){
        return preis;
    }
    public int getMaxNumPassenger(){
        return maxNumPassenger;
    }
    public int getCurrentNumberPassenger(){
        return currentNumPassenger;
    }

    public Passenger getPassenger(int i){
        return passengerList[i];
    }

    public void insertPassenger(Passenger p){
        passengerList[currentNumPassenger] = p;
    }

    public Passenger getPassenger(String passport){
        boolean found = false;
        int i=0;

        Passenger pas = null;
        while((!found) && (i<passengerList.length)){
            if(passport.equals(passengerList[i].getPassport())){
                found = true;
                pas = passengerList[i];
            }
            i++;
        }
        return pas;
    }
}
