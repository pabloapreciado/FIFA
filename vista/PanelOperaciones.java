package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //---------------
    // Atributos
    // --------------
    public JButton btJugador;
    public JButton btInformacion;
    public JButton btSalir;

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelOperaciones()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

    
        // crear y agregar boton borrar
        btJugador = new JButton("Jugador");
        btJugador.setBounds(40,40,100,30);
        this.add(btJugador);
        btJugador.setActionCommand("jugador");

        btInformacion = new JButton("Informacion");
        btInformacion.setBounds(180,40,130,30);
        this.add(btInformacion);
        btInformacion.setActionCommand("informacion");

        // crear y agregar boton salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(300,40,100,30);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void activarBotones()
    {

        btJugador.setEnabled(true);
    }
}