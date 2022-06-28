package modelo;

public class Jugador
{
    //Atributos
    private String nombre;
    private int numgoles;
    private String apellido;
    private int edad;
    private String seleccionar;
    private String posicion;
    


    //Métodos
    public String getSeleccionar() {
        return seleccionar;
    }

    public void setSeleccionar(String seleccionar) {
        this.seleccionar = seleccionar;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
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

    
    public int getNumgoles() {
        return numgoles;
    }

    public void setNumgoles(int numgoles) {
        this.numgoles = numgoles;
    }


    public Jugador(String nombre2, String apellido2, int edad2, String posicion2, int numgoles2, String seleccionar2)
    {
        nombre = "";
        apellido="";
        edad=0;
        numgoles = 0;
        posicion="";
    }

    public Jugador(String nom, int numgol,String ap,String pos,int ed)
    {
        nombre = nom;
        apellido = ap;
        edad = ed;
        numgoles = numgol;
        posicion= pos;
    }
    
    public void setNombre(String n)
    {
        nombre = n;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String toString()
    {
        return nombre + " con " + numgoles + " goles.";
    }
}
