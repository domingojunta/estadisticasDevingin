package es.domingojunta;

import java.awt.EventQueue;

import javax.swing.UIManager;

import es.domingojunta.views.HomeWindow;



public class Application {

	public static void main(String[] args) {
		
		String sistemaOperativo = System.getProperty("os.name");
		
		switch (sistemaOperativo) {
		case "Mac OS X": 
			
			System.setProperty( "apple.laf.useScreenMenuBar", "true" );
			System.setProperty( "apple.awt.application.name", "Estadísticas DEVINGIN" );
			System.setProperty( "apple.awt.application.appearance", "system" );
			System.out.println("Look and Field de Mac Os...");
			break;
		
		case "Windows" :
			
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e) {
				break;
			}
			System.out.println("Look and Field de Windows...");
			break;
		
		
		default:
			System.out.println("Look and Field de por defecto");
			
		}
		
		
		EventQueue.invokeLater( new Runnable() {
			
			public void run() {
				
				HomeWindow gui = new HomeWindow();
				

				gui.setVisible(true);
				
			}
		});

	}

	

}
