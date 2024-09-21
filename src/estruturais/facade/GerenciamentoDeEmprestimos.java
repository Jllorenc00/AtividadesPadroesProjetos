package estruturais.facade;

/**
 *
 * @author joao-
 */
public class GerenciamentoDeEmprestimos {

    public void emprestarLivro(String titulo, String nomeUsuario) {
        System.out.println("Emprestando livro '" + titulo + "' para o usuario: " + nomeUsuario);
    }

    public void devolverLivro(String titulo, String nomeUsuario) {
        System.out.println("Devolvendo livro '" + titulo + "' do usuario: " + nomeUsuario);
    }
}
