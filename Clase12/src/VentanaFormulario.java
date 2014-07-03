import java.awt.Component;
import java.awt.Container;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class VentanaFormulario {
	JFrame frame = new JFrame("Formulario");
	JPanel panel;

	
	public void crearFormulario(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();
		
		SpringLayout layout = new SpringLayout();
		contentPane.setLayout(layout);
		
		Component nombre = new JLabel("Nombre:");
		Component TNombre = new JTextField(15);
		Component apellido = new JLabel("Apellido:");
		Component TApellido = new JTextField(15);
		Component correo = new JLabel("Correo:");
		Component TCorreo = new JTextField(15);
		
		contentPane.add(nombre);
		contentPane.add(TNombre);
		contentPane.add(apellido);
		contentPane.add(TApellido);
		contentPane.add(correo);
		contentPane.add(TCorreo);
		
		layout.putConstraint(SpringLayout.WEST, nombre, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, nombre, 25, SpringLayout.NORTH, contentPane);		
		layout.putConstraint(SpringLayout.NORTH, TNombre, 25, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, TNombre, 20, SpringLayout.EAST, nombre);
		

		layout.putConstraint(SpringLayout.WEST, apellido, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, apellido, 50, SpringLayout.NORTH, contentPane);		
		layout.putConstraint(SpringLayout.NORTH, TApellido, 50, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, TApellido, 20, SpringLayout.EAST, apellido);
		
		layout.putConstraint(SpringLayout.WEST, correo, 10, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, correo, 75, SpringLayout.NORTH, contentPane);		
		layout.putConstraint(SpringLayout.NORTH, TCorreo, 75, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, TCorreo, 25, SpringLayout.EAST, correo);
		
		
		frame.setSize(300,300);
		frame.setVisible(false);
	}
	
	public void Aparecer(){
		frame.setVisible(true);
	}
	
	
	
	
	
	public VentanaFormulario(){
		crearFormulario();
		
	}
	
	
	
}
