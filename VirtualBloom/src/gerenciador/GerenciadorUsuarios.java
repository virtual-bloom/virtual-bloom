package gerenciador;

import java.util.ArrayList;

public class GerenciadorUsuarios {
    private static GerenciadorUsuarios instance;
    private ArrayList<Usuario> usuarios;

    // Construtor privado para garantir que a classe tenha apenas uma instância
    private GerenciadorUsuarios() {
        usuarios = new ArrayList<>();
        carregarUsuarios();  // Carrega os usuários iniciais
    }

    // Método para obter a instância única da classe
    public static GerenciadorUsuarios getInstance() {
        if (instance == null) {
            instance = new GerenciadorUsuarios();
        }
        return instance;
    }

    // Método para acessar a lista de usuários
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    // Método para carregar usuários iniciais (pode ser expandido para carregar de um arquivo, por exemplo)
    public void carregarUsuarios() {
        usuarios.add(new Usuario("lunaandrade@aluno.ifce.edu.br", "1234", "Luna"));
        usuarios.add(new Usuario("naelyp@aluno.ifce.edu.br", "abcd", "Naely"));
        usuarios.add(new Usuario("a.nunes@aluno.ifce.edu.br", "1234abcd", "Ash"));
    }

    // Método para adicionar um novo usuário
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para encontrar um usuário pelo e-mail
    public Usuario encontrarUsuario(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    // Classe Usuario interna dentro de GerenciadorUsuarios
    public static class Usuario {
        private String email;
        private String senha;
        private String nome;

        public Usuario(String email, String senha, String nome) {
            this.email = email;
            this.senha = senha;
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public String getSenha() {
            return senha;
        }

        public String getNome() {
            return nome;
        }
    }
}

