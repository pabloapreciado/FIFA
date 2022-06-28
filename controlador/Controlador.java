package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;
import modelo.Qatar;
import modelo.Jugador;


public class Controlador implements ActionListener
{
    //------------
    // Atributos
    //------------
    
        private VentanaPrincipal vista;
        private Qatar modelo;
        private Jugador modelo1;

    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, Qatar pModelo, Jugador pModelo1)
        {
            this.vista = pVista;
            this.modelo = pModelo;
            this.modelo1 = pModelo1;
            this.vista.miPanelOperaciones.btJugador.addActionListener(this);
            this.vista.miPanelOperaciones.btInformacion.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
       
            String comando = ae.getActionCommand();
           

            
            if(comando.equals("informacion"))
            {

                    String pais = vista.miPanelEntradaDatos.getQatar();
                    String continente = vista.miPanelEntradaDatos.getContinente();
                    modelo = new Qatar(pais, continente, 0, 0);
                    vista.miPanelResultados.mostrarResultado("Los datos del equipo son los siguientes: \nPais = " + modelo.getpa() + "\nContinente = " + modelo.getConti());
                    vista.miPanelOperaciones.activarBotones();
                
                }  
                {
                    JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }

