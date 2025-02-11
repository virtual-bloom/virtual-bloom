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

public class Tela_Margarida {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Margarida window = new Tela_Margarida();
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
	public Tela_Margarida() {
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
		
		JButton btnVoltarM = new JButton();
		btnVoltarM.setBounds(18, 23, 80, 23);
		frame.getContentPane().add(btnVoltarM);
		btnVoltarM.setContentAreaFilled(false); 
		btnVoltarM.setBorderPainted(false); 
		btnVoltarM.setFocusPainted(false); 
		btnVoltarM.setOpaque(false); 
		btnVoltarM.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnVoltarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Tulipa telaTulipa = new Tela_Tulipa(); // Cria uma nova instância da Tela_Sobre
				telaTulipa.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JButton btnAvançarM = new JButton();
		btnAvançarM.setBounds(516, 23, 80, 23);
		frame.getContentPane().add(btnAvançarM);
		btnAvançarM.setContentAreaFilled(false); 
		btnAvançarM.setBorderPainted(false); 
		btnAvançarM.setFocusPainted(false); 
		btnAvançarM.setOpaque(false); 
		btnAvançarM.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnAvançarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Cris telaCrisantemo = new Tela_Cris(); // Cria uma nova instância da Tela_Sobre
				telaCrisantemo.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Margarida.class.getResource("/resourses/Tela_Margarida.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
	}

}
