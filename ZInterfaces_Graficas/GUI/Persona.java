package ZInterfaces_Graficas.GUI;

public class Persona {
    private String nombres, apellidos, email, mobil, direccion;

    public Persona(String nombres, String apellidos, String email, String mobil, String direccion){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.mobil = mobil;
        this.direccion = direccion;
    }

    public String getNombres(){
        return nombres;
    }
    public void setNombres(){
        this.nombres = nombres;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(){
        this.apellidos = apellidos;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }

    public String getMobil(){
        return mobil;
    }
    public void setMobil(){
        this.mobil = mobil;
    }

    public  String getDireccion() {
        return direccion;
    }
    public void setDireccion(){
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return this.nombres+" "+ this.apellidos;
    }
}
