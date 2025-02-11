package app;

import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tela_Lirio {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Lirio window = new Tela_Lirio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Lirio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Lirio.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnVoltarL = new JButton();
		btnVoltarL.setBounds(20, 11, 53, 23);
		frame.getContentPane().add(btnVoltarL);
		btnVoltarL.setContentAreaFilled(false); 
		btnVoltarL.setBorderPainted(false); 
		btnVoltarL.setFocusPainted(false); 
		btnVoltarL.setOpaque(false); 
		btnVoltarL.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnVoltarL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Aplicativo telaApp = new Tela_Aplicativo(); // Cria uma nova instância da Tela_Sobre
				telaApp.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JButton btnAvançarL = new JButton();
		btnAvançarL.setBounds(516, 23, 80, 23);
		frame.getContentPane().add(btnAvançarL);
		btnAvançarL.setContentAreaFilled(false); 
		btnAvançarL.setBorderPainted(false); 
		btnAvançarL.setFocusPainted(false); 
		btnAvançarL.setOpaque(false); 
		btnAvançarL.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnAvançarL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Tulipa telaTulipa = new Tela_Tulipa(); // Cria uma nova instância da Tela_Sobre
				telaTulipa.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Lirio.class.getResource("/resourses/Tela_Lirio.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
	}

}
