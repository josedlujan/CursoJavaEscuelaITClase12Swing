import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

	public static void main(String[] argumentos){
		final VentanaBienvenida ventana = new VentanaBienvenida();
		final VentanaFormulario formulario = new VentanaFormulario();
		
		
		ventana.boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				switch (e.getActionCommand()) {
				case "Entrar":
					ventana.Desaparecer();
					formulario.Aparecer();
					
					break;

				default:
					break;
				}
			}
		});
		
		
		
		
	}
}
