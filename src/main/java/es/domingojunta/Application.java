package es.domingojunta;

import java.awt.EventQueue;

import javax.swing.UIManager;
<<<<<<< HEAD
import javax.swing.UnsupportedLookAndFeelException;
=======
>>>>>>> a9f27265802f2563a10bb402741b1c581cedb7be

import es.domingojunta.views.HomeWindow;



public class Application {

	public static void main(String[] args) {
		
		String sistemaOperativo = System.getProperty("os.name");
<<<<<<< HEAD
		System.out.println(sistemaOperativo);
=======
>>>>>>> a9f27265802f2563a10bb402741b1c581cedb7be
		
		switch (sistemaOperativo) {
		case "Mac OS X": 
			
			System.setProperty( "apple.laf.useScreenMenuBar", "true" );
			System.setProperty( "apple.awt.application.name", "Estadísticas DEVINGIN" );
			System.setProperty( "apple.awt.application.appearance", "system" );
			System.out.println("Look and Field de Mac Os...");
			break;
		
<<<<<<< HEAD
		case "Windows","Windows 10","Windows 11" :
			
			try {
//				UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
=======
		case "Windows" :
			
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
>>>>>>> a9f27265802f2563a10bb402741b1c581cedb7be
			} catch (Exception e) {
				break;
			}
			System.out.println("Look and Field de Windows...");
			break;
		
		
		default:
			System.out.println("Look and Field de por defecto");
<<<<<<< HEAD
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
				System.out.println("Look and Field by default");
			} 
=======
			
>>>>>>> a9f27265802f2563a10bb402741b1c581cedb7be
		}
		
		
		EventQueue.invokeLater( new Runnable() {
			
			public void run() {
				
				HomeWindow gui = new HomeWindow();
				

				gui.setVisible(true);
				
			}
		});

	}

	

}
