package menu;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import login.Tela_Login;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import jogo.Tela_Jogo;
import app.Tela_Aplicativo;

public class Tela_Menu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Menu window = new Tela_Menu();
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
	public Tela_Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Menu.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnVoltarM = new JButton();
		btnVoltarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Login telaLogin = new Tela_Login(); // Cria uma nova instância da Tela_Sobre
				telaLogin.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		btnVoltarM.setOpaque(false);
		btnVoltarM.setFocusPainted(false);
		btnVoltarM.setContentAreaFilled(false);
		btnVoltarM.setBorderPainted(false);
		btnVoltarM.setBounds(20, 11, 56, 24);
		frame.getContentPane().add(btnVoltarM);
		btnVoltarM.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		JButton btnJogo = new JButton();
		btnJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Jogo telaJogo = new Tela_Jogo(); // Cria uma nova instância da Tela_Sobre
				telaJogo.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		btnJogo.setOpaque(false);
		btnJogo.setFocusPainted(false);
		btnJogo.setContentAreaFilled(false);
		btnJogo.setBorderPainted(false);
		btnJogo.setBounds(36, 99, 105, 105);
		frame.getContentPane().add(btnJogo);
		btnJogo.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		
		JButton btnApp = new JButton();
		btnApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Aplicativo telaApp = new Tela_Aplicativo(); // Cria uma nova instância da Tela_Sobre
				telaApp.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		btnApp.setOpaque(false);
		btnApp.setFocusPainted(false);
		btnApp.setContentAreaFilled(false);
		btnApp.setBorderPainted(false);
		btnApp.setBounds(253, 98, 106, 106);
		frame.getContentPane().add(btnApp);
		btnApp.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		JButton btnSobre = new JButton();
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Sobre telaSobre = new Tela_Sobre(); // Cria uma nova instância da Tela_Sobre
				telaSobre.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		btnSobre.setOpaque(false);
		btnSobre.setFocusPainted(false);
		btnSobre.setContentAreaFilled(false);
		btnSobre.setBorderPainted(false);
		btnSobre.setBounds(470, 96, 106, 106);
		frame.getContentPane().add(btnSobre);
		btnSobre.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Menu.class.getResource("/resourses/Tela_Menu.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
		}
}