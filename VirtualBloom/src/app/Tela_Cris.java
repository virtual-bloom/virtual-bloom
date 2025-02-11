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

public class Tela_Cris {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cris window = new Tela_Cris();
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
	public Tela_Cris() {
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
		
		JButton btnVoltarC = new JButton();
		btnVoltarC.setBounds(18, 23, 80, 23);
		frame.getContentPane().add(btnVoltarC);
		btnVoltarC.setContentAreaFilled(false); 
		btnVoltarC.setBorderPainted(false); 
		btnVoltarC.setFocusPainted(false); 
		btnVoltarC.setOpaque(false); 
		btnVoltarC.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnVoltarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Margarida telaMargarida = new Tela_Margarida(); // Cria uma nova instância da Tela_Sobre
				telaMargarida.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Cris.class.getResource("/resourses/Tela_Crisantemo.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
	}

}
