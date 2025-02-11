package menu;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Tela_Sobre {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Sobre window = new Tela_Sobre();
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
	public Tela_Sobre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Sobre.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnVoltarS = new JButton();
		btnVoltarS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Menu telaMenu = new Tela_Menu(); // Cria uma nova instância da Tela_Sobre
				telaMenu.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		btnVoltarS.setBounds(20, 11, 53, 18);
		frame.getContentPane().add(btnVoltarS);
		btnVoltarS.setOpaque(false);
		btnVoltarS.setFocusPainted(false);
		btnVoltarS.setContentAreaFilled(false);
		btnVoltarS.setBorderPainted(false);
		btnVoltarS.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Muda o cursor para mãozinha
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Sobre.class.getResource("/resourses/Tela_Sobre.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
		
	
	}

}