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

public class Tela_Tulipa {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Tulipa window = new Tela_Tulipa();
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
	public Tela_Tulipa() {
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
		
		JButton btnVoltarT = new JButton();
		btnVoltarT.setBounds(18, 23, 80, 23);
		frame.getContentPane().add(btnVoltarT);
		btnVoltarT.setContentAreaFilled(false); 
		btnVoltarT.setBorderPainted(false); 
		btnVoltarT.setFocusPainted(false); 
		btnVoltarT.setOpaque(false); 
		btnVoltarT.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnVoltarT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Lirio telaLirio = new Tela_Lirio(); // Cria uma nova instância da Tela_Sobre
				telaLirio.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JButton btnAvançarT = new JButton();
		btnAvançarT.setBounds(516, 23, 80, 23);
		frame.getContentPane().add(btnAvançarT);
		btnAvançarT.setContentAreaFilled(false); 
		btnAvançarT.setBorderPainted(false); 
		btnAvançarT.setFocusPainted(false); 
		btnAvançarT.setOpaque(false); 
		btnAvançarT.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnAvançarT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Margarida telaMargarida = new Tela_Margarida(); // Cria uma nova instância da Tela_Sobre
				telaMargarida.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Tulipa.class.getResource("/resourses/Tela_Tulipa.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
	}

}
