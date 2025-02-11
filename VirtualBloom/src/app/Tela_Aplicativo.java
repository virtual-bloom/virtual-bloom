package app;

import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import menu.Tela_Menu;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Tela_Aplicativo {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Aplicativo window = new Tela_Aplicativo();
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
	public Tela_Aplicativo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Aplicativo.class.getResource("/resourses/Logo_Icon.png")));
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnBiblioteca = new JButton();
		btnBiblioteca.setBounds(130, 121, 129, 127);
		frame.getContentPane().add(btnBiblioteca);
		btnBiblioteca.setContentAreaFilled(false); 
		btnBiblioteca.setBorderPainted(false); 
		btnBiblioteca.setFocusPainted(false); 
		btnBiblioteca.setOpaque(false); 
		btnBiblioteca.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		btnBiblioteca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Lirio telaBibi = new Tela_Lirio(); // Cria uma nova instância da Tela_Sobre
				telaBibi.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JButton btnBuque = new JButton();
		btnBuque.setBounds(351, 121, 129, 127);
		frame.getContentPane().add(btnBuque);
		btnBuque.setContentAreaFilled(false); 
		btnBuque.setBorderPainted(false); 
		btnBuque.setFocusPainted(false); 
		btnBuque.setOpaque(false); 
		btnBuque.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		btnBuque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Buque telaBuque = new Tela_Buque(); // Cria uma nova instância da Tela_Sobre
				telaBuque.frame.setVisible(true); // Torna a nova tela visível
			}
		});
	
		JButton btnVoltarAp = new JButton();
		btnVoltarAp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Menu telaMenu = new Tela_Menu(); // Cria uma nova instância da Tela_Sobre
				telaMenu.frame.setVisible(true); // Torna a nova tela visível
			}
		});

		btnVoltarAp.setBounds(20, 23, 57, 16);
		frame.getContentPane().add(btnVoltarAp);
		btnVoltarAp.setContentAreaFilled(false); 
		btnVoltarAp.setBorderPainted(false); 
		btnVoltarAp.setFocusPainted(false); 
		btnVoltarAp.setOpaque(false); 
		btnVoltarAp.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Aplicativo.class.getResource("/resourses/Tela_Aplicativo.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
		
	}
}
