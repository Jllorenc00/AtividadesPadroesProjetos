package estruturais.facade;

/**
 *
 * @author joao-
 */
public class Notificacoes {

    public void enviarNotificacao(String nomeUsuario, String mensagem) {
        System.out.println("Notificando " + nomeUsuario + ": " + mensagem);
    }
}
