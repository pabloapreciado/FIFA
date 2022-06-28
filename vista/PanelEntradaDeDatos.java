package vista;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDeDatos extends JPanel
{

    private JLabel lx;
    private JLabel ly;
    private JLabel lp;
    private JLabel lc;
    private JTextField tfp;
    private JTextField tfc;
    private JComboBox cbEquipos;
    private JComboBox cbContinentes;
    private String[] equipos = {"Qatar", "Alemania", "Dinamarca", "Brasil", "Francia", "Bélgica", "Croacia", 
    "España","Serbia", "Inglaterra", "Suiza", "Países Bajos", "Argentina", "Irán", "Corea del Sur", 
    "Japón", "Arabia Saudita", "Ecuador", "Uruguay", "Canadá", "Ghana", "Senegal", "Marruecos", "Túnez",
    "Portugal", "Polonia", "Camerún", "México", "Estados Unidos", "Gales", "Australia", "Costa Rica"};

    private String[] continentes = {"América","Asia","Europa","África"};
    private JLabel lImagen;
    private ImageIcon iImagen;

    

    public PanelEntradaDeDatos(){

    iImagen = new ImageIcon(("juan.png"));
    lImagen = new JLabel(iImagen);
    lImagen.setBounds(50,27,238,212);
    this.add(lImagen);


        lx = new JLabel("EQUIPOS");
        lx.setBounds(320, 70, 130, 20);
        
        ly = new JLabel("CONTINENTES");
        ly.setBounds(300, 20, 150, 20);


       // tfp = new JTextField();
        ///tfp.setBounds(480, 50, 40, 20);
        //add(tfp);


        //tfc = new JTextField();
        //tfc.setBounds(480, 100, 40, 20);
        //add(tfc);

        this.add(lx);
        this.add(ly);

        
        cbEquipos = new JComboBox();
        for(int i=0; i<equipos.length;i++)
        {
            cbEquipos.addItem(equipos[i]);
        }
        cbEquipos.setBounds(300,95,110,20);
        this.add(cbEquipos);

        cbContinentes = new JComboBox();
        for(int i=0; i<continentes.length;i++)
        {
            cbContinentes.addItem(continentes[i]);
        }
        cbContinentes.setBounds(300,50,110,20);
        this.add(cbContinentes);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.GRAY);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);
    }

    public String getQatar()
    {
        return (String) cbEquipos.getSelectedItem();
    }

    public String getContinente()
    {
        return (String) cbContinentes.getSelectedItem();
    }


    }


