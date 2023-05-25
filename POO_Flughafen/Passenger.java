package POO_Flughafen;

public class Passenger {
    
    private String name;
    private String passport;
    private String nationality;

    public Passenger(String name, String passport, String nationality){
        this.name = name;
        this.passport = passport;
        this.nationality = nationality;
    }

    public String getName(){
        return name;
    }
    public String getPassport(){
        return passport;
    }
    public String getNationality(){
        return nationality;
    }

}
