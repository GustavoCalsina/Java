package POO_Flughafen;


public class Company {
    
    private String name;
    private int numFlight = 0;
    private Flight flightList [] = new Flight [10];

    public Company(String name){
        this.name = name;
    }
    public Company(String name, Flight f[]){
        this.name = name;
        flightList = f;
        numFlight = f.length;
    }

    public void insertFlight(Flight flight){
        flightList[numFlight] = flight;
        numFlight++;
    }

    //getter Methonde
    public String getName(){
        return name;
    }
    public int getNumFlight(){
        return numFlight;
    }

    public Flight getFlight(int i){

        return flightList[i];
    }
    public Flight getFlight(String identifier){
        boolean found = false;
        int i=0;
        Flight f = null;
        while((!found)&& (i<flightList.length)){
            if(identifier.equals(flightList[i].getIdentifer())){
                found = true;
                f = flightList[i];
            }
            i++;
        }
        return f;
    }
}
