package es.domingojunta;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import es.domingojunta.views.HomeWindow;



public class Application {

	public static void main(String[] args) {
		
		String sistemaOperativo = System.getProperty("os.name");
		System.out.println(sistemaOperativo);
		
		switch (sistemaOperativo) {
		case "Mac OS X": 
			
			System.setProperty( "apple.laf.useScreenMenuBar", "true" );
			System.setProperty( "apple.awt.application.name", "Estadísticas DEVINGIN" );
			System.setProperty( "apple.awt.application.appearance", "system" );
			System.out.println("Look and Field de Mac Os...");
			break;
		
		case "Windows","Windows 10","Windows 11" :
			
			try {
//				UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				break;
			}
			System.out.println("Look and Field de Windows...");
			break;
		
		
		default:
			System.out.println("Look and Field de por defecto");
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				System.out.println("Look and Field by default");
			} 
		}
		
		
		EventQueue.invokeLater( new Runnable() {
			
			public void run() {
				
				HomeWindow gui = new HomeWindow();
				

				gui.setVisible(true);
				
			}
		});

	}

	

}
