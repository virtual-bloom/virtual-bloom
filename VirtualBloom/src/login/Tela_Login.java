package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import gerenciador.GerenciadorUsuarios;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.ActionListener;

import java.awt.Toolkit;
import menu.Tela_Menu;

public class Tela_Login {

	public JFrame frame;
	private JTextField textField_Email;
	private JButton btnResetar;
	private JPasswordField passwordField;
	private JButton btnAjuda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Login window = new Tela_Login();
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
	public Tela_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Login.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null); //centraliza a janela 
		
		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
		textField_Email.setBounds(188, 119, 230, 20);
		frame.getContentPane().add(textField_Email);
		textField_Email.setColumns(10);
		textField_Email.setBorder(new LineBorder(new Color(180, 180, 180), 1, true));
        textField_Email.setBackground(new Color(245, 245, 245));
        textField_Email.setForeground(Color.BLACK);
		
		JButton btnEntrar = new JButton();
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEntrar.setBackground(UIManager.getColor("Button.background"));
		btnEntrar.setBounds(188, 218, 65, 23);
		frame.getContentPane().add(btnEntrar);
		btnEntrar.setContentAreaFilled(false); 
		btnEntrar.setBorderPainted(false); 
		btnEntrar.setFocusPainted(false); 
		btnEntrar.setOpaque(false); 
		btnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarLogin();
            }
        });
		
		btnResetar = new JButton();
		btnResetar.setBounds(352, 218, 71, 23);
		frame.getContentPane().add(btnResetar);
		btnResetar.setContentAreaFilled(false); 
		btnResetar.setBorderPainted(false); 
		btnResetar.setFocusPainted(false); 
		btnResetar.setOpaque(false); 
		btnResetar.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
	
	    btnResetar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           
	            textField_Email.setText(""); 
	            passwordField.setText("");  
	        }
	    });
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 170, 230, 20);
		frame.getContentPane().add(passwordField);
		passwordField.setBorder(new LineBorder(new Color(180, 180, 180), 1, true));
		passwordField.setBackground(new Color(245, 245, 245));
		passwordField.setForeground(Color.BLACK);
		
		btnAjuda = new JButton();
		btnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Tela_Ajuda telaAjuda = new Tela_Ajuda();
	            telaAjuda.frame.setVisible(true); 
			}
		});
		btnAjuda.setBounds(502, 11, 94, 12);
		frame.getContentPane().add(btnAjuda);
		btnAjuda.setContentAreaFilled(false); 
		btnAjuda.setBorderPainted(false); 
		btnAjuda.setFocusPainted(false); 
		btnAjuda.setOpaque(false); 
		btnAjuda.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
	
		JLabel lbFundo = new JLabel();
		lbFundo.setBackground(new Color(255, 255, 255));
		lbFundo.setIcon(new ImageIcon(Tela_Login.class.getResource("/resourses/Tela_Login.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
	}
	
	private void verificarLogin() {
		 String emailDigitado = textField_Email.getText();
		    String senhaDigitada = new String(passwordField.getPassword());

		    GerenciadorUsuarios gerenciador = GerenciadorUsuarios.getInstance();
		    GerenciadorUsuarios.Usuario usuario = gerenciador.encontrarUsuario(emailDigitado);

		    if (usuario != null) {
		        if (usuario.getSenha().equals(senhaDigitada)) {
		            mostrarMensagem(usuario.getNome());
		        } else {
		            JOptionPane.showMessageDialog(frame, "Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
		        }
		    } else {
		    	Object[] options = {"Sim", "Não"};
		    	int resposta = JOptionPane.showOptionDialog(frame, 
		    	    "Não encontramos esse email. Deseja registrá-lo?", 
		    	    "Registro", 
		    	    JOptionPane.YES_NO_OPTION, 
		    	    JOptionPane.QUESTION_MESSAGE, 
		    	    null, 
		    	    options, 
		    	    options[0]);
		        if (resposta == JOptionPane.YES_OPTION) {
		            registrarNovoUsuario(emailDigitado, senhaDigitada);
		        }
		    }
		}
	private void registrarNovoUsuario(String email, String senha) {
		String nome = JOptionPane.showInputDialog(frame, "Digite seu nome:");
	    if (nome != null && !nome.trim().isEmpty()) {
	        GerenciadorUsuarios gerenciador = GerenciadorUsuarios.getInstance();
	        gerenciador.adicionarUsuario(new GerenciadorUsuarios.Usuario(email, senha, nome));  // Adiciona ao Gerenciador
	        JOptionPane.showMessageDialog(frame, "Usuário registrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	        mostrarMensagem(nome);
	    }
	}
	    private void mostrarMensagem(String nome) {
	        JOptionPane.showMessageDialog(frame, "Bem-vinda " + nome + "!", "VirtualBloom", JOptionPane.INFORMATION_MESSAGE);
	        Tela_Menu telaMenu = new Tela_Menu();
	        telaMenu.frame.setVisible(true);
	        frame.dispose(); // Fecha a tela de login
	    }
	    
}