package comportamentais.observer;

/**
 *
 * @author joao-
 */
class Leitor implements Observer {

    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("Leitor " + nome + " recebeu a notícia: " + noticia);
    }
}
