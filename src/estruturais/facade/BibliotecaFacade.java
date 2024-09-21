package estruturais.facade;

/**
 *
 * @author joao-
 */
public class BibliotecaFacade {

    private CatalogoDeLivros catalogo;
    private RegistroDeUsuarios registroUsuarios;
    private GerenciamentoDeEmprestimos gerenciamentoEmprestimos;
    private Notificacoes notificacoes;

    public BibliotecaFacade() {
        this.catalogo = new CatalogoDeLivros();
        this.registroUsuarios = new RegistroDeUsuarios();
        this.gerenciamentoEmprestimos = new GerenciamentoDeEmprestimos();
        this.notificacoes = new Notificacoes();
    }

    public void buscarELocarLivro(String tituloLivro, String nomeUsuario) {
        catalogo.buscarLivro(tituloLivro);
        registroUsuarios.consultarUsuario(nomeUsuario);
        gerenciamentoEmprestimos.emprestarLivro(tituloLivro, nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "Voce emprestou o livro '" + tituloLivro + "'.");
    }

    public void registrarNovoUsuario(String nomeUsuario) {
        registroUsuarios.registrarUsuario(nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "Bem-vindo a biblioteca!");
    }

    public void devolverLivro(String tituloLivro, String nomeUsuario) {
        gerenciamentoEmprestimos.devolverLivro(tituloLivro, nomeUsuario);
        notificacoes.enviarNotificacao(nomeUsuario, "voce devolveu o livro '" + tituloLivro + "'.");
    }
}
