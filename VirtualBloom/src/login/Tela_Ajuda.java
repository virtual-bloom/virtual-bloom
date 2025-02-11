package login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Tela_Ajuda {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Ajuda window = new Tela_Ajuda();
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
	public Tela_Ajuda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Ajuda.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		JButton btnVoltarA = new JButton();
		btnVoltarA.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        frame.dispose(); // Fecha a tela de ajuda
		        Tela_Login telaLogin = new Tela_Login(); // Cria uma nova tela de login
		        telaLogin.frame.setVisible(true); // Torna a tela de login visível
		    }
		});

		btnVoltarA.setBounds(21, 21, 53, 14);
		frame.getContentPane().add(btnVoltarA);
		btnVoltarA.setContentAreaFilled(false); // Remove o fundo
		btnVoltarA.setBorderPainted(false); // Remove a borda
		btnVoltarA.setFocusPainted(false); // Remove o efeito de foco
		btnVoltarA.setOpaque(false); // Garante a transparência
		btnVoltarA.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		JLabel lbFundo = new JLabel();
		lbFundo.setBounds(0, 0, 611, 352);
		lbFundo.setIcon(new ImageIcon(Tela_Ajuda.class.getResource("/resourses/Tela_Ajuda.png")));
		lbFundo.setBackground(Color.WHITE);
		frame.getContentPane().add(lbFundo);
	}

}