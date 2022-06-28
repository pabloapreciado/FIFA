package ejecutable;

import vista.VentanaPrincipal;
import modelo.Qatar;
import modelo.Jugador;
import controlador.Controlador;
public class test
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Qatar miQatar = null;
        Jugador miJugador = null;
        Controlador miControlador = new Controlador(miVentana, miQatar, miJugador);
        //Equipo miModelo = null;
    }
}
       
