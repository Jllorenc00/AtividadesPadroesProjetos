package comportamentais.observer;

/**
 *
 * @author joao-
 */
class Jornalista implements Observer {

    private String nome;

    public Jornalista(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("Jornalista " + nome + " recebeu a notícia: " + noticia);
    }
}
