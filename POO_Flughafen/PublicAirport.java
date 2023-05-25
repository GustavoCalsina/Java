package POO_Flughafen;

public class PublicAirport extends Airport {
    
    private double subvention;

    public PublicAirport(String name, String city, String country){
        super(name, city, country);
    }
    public PublicAirport(double subvention, String name, String city, String country, Company[] c){
        super(name, city, country, c);
        this.subvention = subvention;
    }
    public PublicAirport(double subvention, String name, String city, String country){
        super(name, city, country);
        this.subvention = subvention;
    }

    public double getSubvention(){
        return subvention;
    }


}
