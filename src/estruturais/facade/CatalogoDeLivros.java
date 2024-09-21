package estruturais.facade;

/**
 *
 * @author joao-
 */
public class CatalogoDeLivros {

    public void buscarLivro(String titulo) {
        System.out.println("Buscando livro: " + titulo);
    }

    public void adicionarLivro(String titulo) {
        System.out.println("Adicionando livro: " + titulo);
    }
}
