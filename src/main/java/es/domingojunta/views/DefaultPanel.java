package es.domingojunta.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;

public class DefaultPanel extends JPanel {
	
	private JLabel lblTitle;
	private JTextArea txtInstruccionesGenerales;

	
	public DefaultPanel() {
		
		setBackground(Color.CYAN);
		setLayout(new BorderLayout(0, 0));
		
		
		
		txtInstruccionesGenerales = new JTextArea();
		txtInstruccionesGenerales.setRows(25);
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n\n");
		sb.append("   Este aplicativo sirve para dos propósitos, que a su vez responde a dos menús de opciones ");
		sb.append("\n");
		sb.append("   que podemos ver en dos opciones de menú:");
		sb.append("\n\n");
		sb.append("   1.- La primera es la generación de archivos csv necesarios para poder proceder a la reasignación automática en SUR.");
		sb.append("\n");
		sb.append("   2.- La segunda es la generación de estadísticas del grupo regional de devoluciones");
		
		
		txtInstruccionesGenerales.setText(sb.toString());
		txtInstruccionesGenerales.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JScrollPane scrollPane = new JScrollPane(txtInstruccionesGenerales);
		add(scrollPane, BorderLayout.CENTER);
		
		lblTitle = new JLabel("Página principal del aplicativo");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
		add(lblTitle, BorderLayout.NORTH);
		setVisible(true);
	}
	
}
