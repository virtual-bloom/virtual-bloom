package jogo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.Font;

import menu.Tela_Menu;

public class Tela_Jogo {

	public JFrame frame;
	private JTextField textField;
	private JTextField[] camposLetras;  // Para armazenar as letras da palavra oculta
    private String palavra = "LIRIO";  // Palavra secreta
    private int tentativasErradas = 0;
    private final int MAX_TENTATIVAS = 6;
    private JLabel lbCabeca, lbCorpo, lbPerna1, lbPerna2, lbBraco1, lbBraco2;
    private ArrayList<Character> letrasTentadas = new ArrayList<>();
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Jogo window = new Tela_Jogo();
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
	public Tela_Jogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela_Jogo.class.getResource("/resourses/Logo_Icon.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 622, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		camposLetras = new JTextField[palavra.length()];
	        for (int i = 0; i < palavra.length(); i++) {
	            camposLetras[i] = new JTextField("_");
	            camposLetras[i].setFont(new Font("Gill Sans MT", Font.PLAIN, 42));
	            camposLetras[i].setBounds(170 + (i * 50), 220, 40, 50);
	            camposLetras[i].setHorizontalAlignment(JTextField.CENTER);
	            camposLetras[i].setEditable(false);
	            camposLetras[i].setBackground(new Color(0xFBF8F1));
	            camposLetras[i].setBorder(BorderFactory.createEmptyBorder()); // Remove a borda
	            camposLetras[i].setFocusable(false);
	            frame.getContentPane().add(camposLetras[i]);
	            }
		
	    JButton btnVoltarJ = new JButton();
			btnVoltarJ.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose(); 
					Tela_Menu telaMenu = new Tela_Menu(); // Cria uma nova instância da Tela_Sobre
					telaMenu.frame.setVisible(true); // Torna a nova tela visível
				}
		});
		
		btnVoltarJ.setBounds(10, 306, 65, 17);
		frame.getContentPane().add(btnVoltarJ);
		btnVoltarJ.setOpaque(false);
		btnVoltarJ.setFocusPainted(false);
		btnVoltarJ.setContentAreaFilled(false);
		btnVoltarJ.setBorderPainted(false);
		btnVoltarJ.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		
		JButton btnVerificar = new JButton();
		btnVerificar.setBounds(456, 185, 65, 28);
		frame.getContentPane().add(btnVerificar);
		btnVerificar.setOpaque(false);
		btnVerificar.setFocusPainted(false);
		btnVerificar.setContentAreaFilled(false);
		btnVerificar.setBorderPainted(false);
		btnVerificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText();
                System.out.println("Texto digitado" + texto);
                if (!texto.isEmpty()) {
                    char letra = texto.toUpperCase().charAt(0);
                    verificarLetra(letra);
                    textField.setText(""); // Limpa o campo de texto após a tentativa
                }
            }
        });
		

		JButton btnComo = new JButton();
		btnComo.setOpaque(false);
		btnComo.setFocusPainted(false);
		btnComo.setContentAreaFilled(false);
		btnComo.setBorderPainted(false);
		btnComo.setBounds(528, 11, 68, 17);
		frame.getContentPane().add(btnComo);
		btnComo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				Tela_Como telaComo = new Tela_Como(); // Cria uma nova instância da Tela_Sobre
				telaComo.frame.setVisible(true); // Torna a nova tela visível
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Gill Sans MT", Font.PLAIN, 42));
		textField.setBounds(456, 106, 65, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setOpaque(false); // Remove fundo
		textField.setBorder(BorderFactory.createEmptyBorder()); // Remove borda
		textField.setForeground(new Color(0, 0, 0, 0)); // Torna o texto invisível
		textField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); 
		textField.setForeground(Color.BLACK);
	    
	    lbCabeca = criarParteCorpo("/resourses/boneco1.png", 211, 76, 77, 75);
        lbCorpo = criarParteCorpo("/resourses/boneco2.png", 211, 145, 48, 57);
        lbBraco1 = criarParteCorpo("/resourses/boneco3.png", 200, 148, 74, 40);
        lbBraco2 = criarParteCorpo("/resourses/boneco4.png", 222, 148, 74, 40);
        lbPerna1 = criarParteCorpo("/resourses/boneco5.png", 216, 186, 54, 37);
        lbPerna2 = criarParteCorpo("/resourses/boneco6.png", 207, 186, 54, 37);
        
        
		
		JLabel lbFundo = new JLabel();
		lbFundo.setIcon(new ImageIcon(Tela_Jogo.class.getResource("/resourses/Tela_Jogo.png")));
		lbFundo.setBounds(0, 0, 606, 346);
		frame.getContentPane().add(lbFundo);
		
	}
		private JLabel criarParteCorpo(String imagem, int x, int y, int largura, int altura) {
        JLabel parte = new JLabel();
        parte.setIcon(new ImageIcon(Tela_Jogo.class.getResource(imagem)));
        parte.setBounds(x, y, largura, altura);
        parte.setVisible(false); // Inicialmente invisível
        frame.getContentPane().add(parte);
        return parte;
    }
		private void verificarLetra(char letra) {
			// Verifica se a letra já foi tentada
		    if (letrasTentadas.contains(letra)) {
		        JOptionPane.showMessageDialog(frame, "Você já tentou essa letra!");
		        return;  // Retorna sem fazer nada se a letra já foi tentada
		    }

		    letrasTentadas.add(letra);  // Adiciona a letra ao ArrayList de tentativas
			
			boolean acertou = false;
		for (int i = 0; i < palavra.length(); i++) {
        if (palavra.toUpperCase().charAt(i) == letra) {
            camposLetras[i].setText(String.valueOf(letra));
            acertou = true;
        }}
	
	    if (!acertou) {
	        tentativasErradas++;
	        atualizarImagemBoneco();
	    }
	
	
	    if (tentativasErradas >= MAX_TENTATIVAS) {
	    	JOptionPane.showMessageDialog(frame, "Game Over!");
	    	reiniciarJogo();
	    }
	    verificarVitoria();
		}
	private void verificarVitoria() {
		boolean venceu = true;
		for (JTextField campo : camposLetras) {
	            if (campo.getText().equals("_")) {
	                venceu = false; // Ainda há letras não descobertas
	            }
	        }
		if (venceu) {
			JOptionPane.showMessageDialog(frame, "Você avançou para a próxima fase!");
		 	frame.dispose(); // Fecha a tela atual
		    Tela_Jogo1 telaJogo1 = new Tela_Jogo1(); // Cria uma nova instância da Tela_Jogo1
		    telaJogo1.frame.setVisible(true);
		}
	    }
		 private void atualizarImagemBoneco() {
			 switch (tentativasErradas) {
	            case 1:
	                lbCabeca.setVisible(true);
	                break;
	            case 2:
	                lbCorpo.setVisible(true);
	                break;
	            case 3:
	                lbBraco1.setVisible(true);
	                break;
	            case 4:
	                lbBraco2.setVisible(true);
	                break;
	            case 5:
	                lbPerna1.setVisible(true);
	                break;
	            case 6:
	                lbPerna2.setVisible(true);
	                break;
	        }
	    }

		 private void reiniciarJogo() {
			 // Reseta as variáveis
			    tentativasErradas = 0;
			    palavra = "LIRIO"; // Ou você pode escolher uma nova palavra aleatória aqui
			    
			    letrasTentadas.clear();
			    // Restaura o texto das letras
			    for (int i = 0; i < camposLetras.length; i++) {
			        camposLetras[i].setText("_");
			    }

			    // Restaura a visibilidade das partes do corpo
			    lbCabeca.setVisible(false);
			    lbCorpo.setVisible(false);
			    lbPerna1.setVisible(false);
			    lbPerna2.setVisible(false);
			    lbBraco1.setVisible(false);
			    lbBraco2.setVisible(false);

			    // Limpa o campo de texto para a próxima tentativa
			    textField.setText("");
			}
			   
}
