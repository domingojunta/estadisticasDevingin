package es.domingojunta.eventManagers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import es.domingojunta.components.HomeWindowComponents;

public class HomeWindowEventManager extends WindowAdapter implements ActionListener{
	
	private HomeWindowComponents homeWindowComponents;
	
	public HomeWindowEventManager (HomeWindowComponents homeWindowComponents) {
		this.homeWindowComponents = homeWindowComponents;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String nombreComponente = e.getActionCommand();
		System.out.println("El componente pulsado es: "+nombreComponente);
		
		switch (nombreComponente) {
		case "btnSalir": {
			
			System.exit(0);
			break;
		}
		default:
			System.out.println("El componente pulsado: "+nombreComponente+" no tiene acción asociada...");
		}
		
	}
	
	

}
