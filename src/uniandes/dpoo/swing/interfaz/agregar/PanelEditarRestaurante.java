package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    private JTextField txtNombre;
    private JComboBox<String> cbbCalificacion;
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        setLayout(new GridLayout(3,1));
        JPanel panelNombre= new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelNombre.add(new JLabel("Nombre:"));
        txtNombre = new JTextField(15);
        panelNombre.add(txtNombre);
        add(panelNombre); 
        JPanel panelCalificacion= new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCalificacion.add(new JLabel("Calificación:"));
        String[] calificaciones= {"1","2","3","4","5"};
        cbbCalificacion= new JComboBox<>(calificaciones);
        panelCalificacion.add(cbbCalificacion);
        add(panelCalificacion); 
        JPanel panelVisitado= new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelVisitado.add(new JLabel("Visitado:"));
        String[] visitadoOpciones= {"Sí", "No"};
        cbbVisitado= new JComboBox<>(visitadoOpciones);
        panelVisitado.add(cbbVisitado);
        add(panelVisitado);
    }

    public boolean getVisitado( )
    {
        return cbbVisitado.getSelectedItem().equals("Sí");
    }

    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    public String getNombre( )
    {
        return txtNombre.getText( );
    }
}