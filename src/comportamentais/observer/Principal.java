package comportamentais.observer;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Noticia noticia = new Noticia();

        Leitor leitor1 = new Leitor("Joao");
        Leitor leitor2 = new Leitor("Isadora");
        Jornalista jornalista1 = new Jornalista("Gustavo");

        noticia.adicionarObservador(leitor1);
        noticia.adicionarObservador(leitor2);
        noticia.adicionarObservador(jornalista1);

        noticia.publicarNoticia("Novo artigo sobre testes.");

    }

}
