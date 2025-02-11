package app;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tela_Buque {

	public JFrame frame;
	private JLabel lbLirio, lbTulipa, lbMargarida, lbCris, lbLaco;
	private JButton btnReiniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Buque window = new Tela_Buque();
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
	public Tela_Buque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Buque.class.getResource("/resourses/Logo_Icon.png")));
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		JButton btnLirio = new JButton();
		btnLirio.setBounds(140, 225, 67, 69);
		frame.getContentPane().add(btnLirio);
		btnLirio.setContentAreaFilled(false); 
		btnLirio.setBorderPainted(false); 
		btnLirio.setFocusPainted(false); 
		btnLirio.setOpaque(false); 
		btnLirio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btnTulipa = new JButton();
		btnTulipa.setBounds(227, 225, 67, 69);
		frame.getContentPane().add(btnTulipa);
		btnTulipa.setContentAreaFilled(false); 
		btnTulipa.setBorderPainted(false); 
		btnTulipa.setFocusPainted(false); 
		btnTulipa.setOpaque(false); 
		btnTulipa.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		JButton btnMargarida = new JButton();
		btnMargarida.setBounds(315, 225, 67, 69);
		frame.getContentPane().add(btnMargarida);
		btnMargarida.setContentAreaFilled(false); 
		btnMargarida.setBorderPainted(false); 
		btnMargarida.setFocusPainted(false); 
		btnMargarida.setOpaque(false); 
		btnMargarida.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		JButton btnCris = new JButton();
		btnCris.setBounds(403, 225, 67, 69);
		frame.getContentPane().add(btnCris);
		btnCris.setContentAreaFilled(false); 
		btnCris.setBorderPainted(false); 
		btnCris.setFocusPainted(false); 
		btnCris.setOpaque(false); 
		btnCris.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		JButton btnTerminar = new JButton();
		btnTerminar.setBounds(268, 312, 75, 23);
		frame.getContentPane().add(btnTerminar);
		btnTerminar.setContentAreaFilled(false); 
		btnTerminar.setBorderPainted(false); 
		btnTerminar.setFocusPainted(false); 
		btnTerminar.setOpaque(false); 
		btnTerminar.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		btnReiniciar = new JButton("Reiniciar");
	    btnReiniciar.setBounds(250, 20, 100, 23);
	    btnReiniciar.setVisible(false);
	    frame.getContentPane().add(btnReiniciar);
	    btnReiniciar.setFont(new Font("Gill Sans MT", Font.BOLD, 14)); // Define a fonte
	    btnReiniciar.setBackground(new Color(85, 144, 90)); // Cor de fundo azul suave
	    btnReiniciar.setForeground(Color.WHITE); // Cor do texto branco
	    btnReiniciar.setFocusPainted(false); // Remove borda de foco ao clicar
	  
	    btnReiniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btnVoltarB = new JButton();
		btnVoltarB.setBounds(24, 22, 56, 16);
		frame.getContentPane().add(btnVoltarB);
		btnVoltarB.setContentAreaFilled(false); 
		btnVoltarB.setBorderPainted(false); 
		btnVoltarB.setFocusPainted(false); 
		btnVoltarB.setOpaque(false); 
		btnVoltarB.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		btnVoltarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Aplicativo telaApp = new Tela_Aplicativo(); // Cria uma nova instância da Tela_Sobre
				telaApp.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		lbLaco = new JLabel();
		lbLaco.setIcon(new ImageIcon(Tela_Buque.class.getResource("/resourses/Laco.png")));
		lbLaco.setBounds(256, 119, 92, 95);
		frame.getContentPane().add(lbLaco);
		
		lbCris = new JLabel();
		lbCris.setIcon(new ImageIcon(Tela_Buque.class.getResource("/resourses/Crisantemo.png")));
		lbCris.setBounds(240, 97, 67, 85);
		frame.getContentPane().add(lbCris);
		
		lbMargarida = new JLabel();
		lbMargarida.setIcon(new ImageIcon(Tela_Buque.class.getResource("/resourses/Margarida.png")));
		lbMargarida.setBounds(261, 97, 92, 80);
		frame.getContentPane().add(lbMargarida);
		
		lbLirio = new JLabel();
		lbLirio.setIcon(new ImageIcon(Tela_Buque.class.getResource("/resourses/Lirio.png")));
		lbLirio.setBounds(251, 57, 92, 118);
		frame.getContentPane().add(lbLirio);
		
		lbTulipa = new JLabel();
		lbTulipa.setIcon(new ImageIcon(Tela_Buque.class.getResource("/resourses/Tulipa.png")));
		lbTulipa.setBounds(277, 72, 80, 95);
		frame.getContentPane().add(lbTulipa);

		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Buque.class.getResource("/resourses/Tela_Buque.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
		
		lbLirio.setVisible(false);
        lbTulipa.setVisible(false);
        lbMargarida.setVisible(false);
        lbCris.setVisible(false);
        lbLaco.setVisible(false);
		
        btnLirio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            lbLirio.setVisible(true);
                    }
            });
        
        btnTerminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 lbLaco.setVisible(true);
                 btnReiniciar.setVisible(true);
                 JOptionPane.showMessageDialog(frame, "Parabéns! Você montou seu buque!");
            }
             });
        
        btnReiniciar.addActionListener(e -> reiniciarJogo());
	
        btnCris.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbCris.setVisible(true);
            }
        });
        
        btnMargarida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbMargarida.setVisible(true);
            }
        });
        
        btnTulipa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbTulipa.setVisible(true);
            }
        });
	}
	private void reiniciarJogo() {
        lbLirio.setVisible(false);
        lbTulipa.setVisible(false);
        lbMargarida.setVisible(false);
        lbCris.setVisible(false);
        lbLaco.setVisible(false);
        btnReiniciar.setVisible(false);
    }
}


