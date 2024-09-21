package comportamentais.observer;

/**
 *
 * @author joao-
 */
import java.util.ArrayList;
import java.util.List;

class Noticia {

    private List<Observer> observadores = new ArrayList<>();
    private String conteudo;

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(conteudo);
        }
    }

    public void publicarNoticia(String conteudo) {
        this.conteudo = conteudo;
        notificarObservadores();
    }
}
