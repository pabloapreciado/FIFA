package modelo;

public class Qatar {


    private String pa;
    private int parti;
    private int copas;
    private String conti;
    private String nombre;
    private String apellido;
    private int edad;
    private String equipo;

    
    public Qatar(String p, String con, int par, int cop)
    {
        this.pa = p;
        this.conti = con;
        this.parti = par;
        this.copas = cop;
        
    }

    public String getpa() {
        return pa;
    }

    public void setpa(String pa) {
        this.pa = pa;
    }

    public String getConti() {
        return conti;
    }

    public void setConti(String conti) {
        this.conti = conti;
    }

    public int getParti() {
        return parti;
    }

    public void setParti(int parti) {
        this.parti= parti;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public void director(String nom, String ape, int edad, String equi)
    {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.equipo = equi;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}
