package es.domingojunta.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

import es.domingojunta.components.HomeWindowComponents;
import es.domingojunta.eventManagers.HomeWindowEventManager;


public class HomeWindow extends JFrame{
	
	private JMenuBar menuBar;
	private JMenu menuArchivo;
	private JMenuItem menuItemSalir;
	private JMenuItem menuItemReasignacion;
	private JMenuItem menuItemEstadistica;
	private JPanel defaultPanel;
	private JPanel panelCentral;
	
	private HomeWindowEventManager homeWindowEventManager;
	private HomeWindowComponents homeWindowComponents;
	
	
	public HomeWindow (){
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimension = getToolkit().getScreenSize();
		setSize(dimension);
//		setMinimumSize(new Dimension(800,500));
		setTitle("Estadísticas y reasignación de expedientes");
		setExtendedState(this.MAXIMIZED_BOTH);
		setFont(new Font("Arial", Font.PLAIN, 12));
		
		homeWindowComponents = new HomeWindowComponents();
		homeWindowEventManager = new HomeWindowEventManager(homeWindowComponents);
		
		//Menú
		
				menuBar = new JMenuBar();
				menuBar.setFont(new Font("Arial", Font.PLAIN, 14));
				
				//menuItemArchivo
				menuArchivo = new JMenu("Archivo");
				menuArchivo.setFont(new Font("Arial", Font.PLAIN, 14));
				menuArchivo.setActionCommand("btnArchivo");
				menuBar.add(menuArchivo);
				
				
				
				//menuItemReasignación
				menuItemReasignacion = new JMenu("Reasignación");
				menuItemReasignacion.setFont(new Font("Arial", Font.PLAIN, 14));
				menuItemReasignacion.setActionCommand("btnReasignacion");
				menuBar.add(menuItemReasignacion);
				
				
				//menuItemEstadísticas
				
				menuItemEstadistica = new JMenu("Estadística");
				menuItemEstadistica.setFont(new Font("Arial", Font.PLAIN, 14));
				menuItemEstadistica.setActionCommand("btnEstadistica");
				menuBar.add(menuItemEstadistica);
				
				
				//menuItemSalir
				menuItemSalir = new JMenuItem("Salir");
				menuItemSalir.setActionCommand("btnSalir");
				menuItemSalir.addActionListener(homeWindowEventManager);
				menuItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
				menuArchivo.add(menuItemSalir);
				
				setJMenuBar(menuBar);
		
		
		//Panel Central
				
				panelCentral = new DefaultPanel();
				getContentPane().add(panelCentral, BorderLayout.CENTER);
		
	}

}
