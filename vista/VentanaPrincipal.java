package vista;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame
{
        //----------
    // Atributos
    //----------
    public PanelEntradaDeDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;


    //----------
    // Metodos
    //----------

    /*Método constructor*/
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        // Crear y agregar el PanelEntrada
        miPanelEntradaDatos = new PanelEntradaDeDatos();
        miPanelEntradaDatos.setBounds(10,10,480,240);
        this.add(miPanelEntradaDatos);
        

        // Crear y agregar el PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,255,480,100);
        this.add(miPanelOperaciones);

        // Crear y agregar el PanelEntrada
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,360,480,290);
        this.add(miPanelResultados);
        
        

        // Caracteristicas de la ventana
        this.setTitle("APP FIFA");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    

}
