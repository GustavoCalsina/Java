package POO_Flughafen;

public class PrivateAirport extends Airport {
    
    private String companyList[] = new String[10];
    private int numCompany;  

    public PrivateAirport(String name, String city, String country ){
        super(name, city, country);
    }
    public PrivateAirport(String name, String city, String country, Company[] c, String co[]){
        super(name, city, country, c);
        this.companyList = co;
        numCompany = co.length;
    }

    public void insertCompanys(String e[] ){
        this.companyList = e;
        this.numCompany = e.length;
    }
    public void insertCompany(String e){
        companyList[numCompany] = e;
        numCompany++;
    }

    public String[] getCompanyList(){
        return companyList;
    }
    public int getNumCompany(){
        return numCompany;
    }
}
