import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaBienvenida {
	JFrame ventanaBienvenida;
	JPanel panelArriba,panelAbajo;
	JLabel saludo;
	JButton boton;
	
	public void crearPanelArriba(){
		panelArriba = new JPanel();
		saludo = new JLabel();
		saludo.setText("Bienvenido a la mejor app del mundo");
		panelArriba.setLayout(new BoxLayout(panelArriba,BoxLayout.X_AXIS));
		panelArriba.add(saludo);
	}
	
	
	public void crearPanelAbajo(){
		panelAbajo = new JPanel();
		boton = new JButton();
		boton.setText("Entrar");
		panelAbajo.setLayout(new BoxLayout(panelAbajo, BoxLayout.X_AXIS));
		panelAbajo.add(boton);
		}
	
	
	public void crearVentana(){
		ventanaBienvenida = new JFrame();
		ventanaBienvenida.setTitle("La mejor app del mundo");
		ventanaBienvenida.setSize(300,300);
		ventanaBienvenida.setLayout(new BoxLayout(ventanaBienvenida.getContentPane(), BoxLayout.Y_AXIS));
		ventanaBienvenida.add(panelArriba);
		ventanaBienvenida.add(panelAbajo);
		ventanaBienvenida.setLocationRelativeTo(null);
		ventanaBienvenida.setVisible(true);
		ventanaBienvenida.setDefaultCloseOperation(ventanaBienvenida.EXIT_ON_CLOSE);	
	}
	
	
	public void Desaparecer(){
		ventanaBienvenida.setVisible(false);
	}
    public VentanaBienvenida() {
		// TODO Auto-generated constructor stub
    	crearPanelArriba();
    	crearPanelAbajo();
    	crearVentana();
	}
	
	
}
