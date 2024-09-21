package estruturais.facade;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        biblioteca.registrarNovoUsuario("Joao");
        biblioteca.buscarELocarLivro("Java para Iniciantes", "Joao");
        biblioteca.devolverLivro("Java para Iniciantes", "Joao");
    }
}
