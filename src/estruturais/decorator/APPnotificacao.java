package estruturais.decorator;

/**
 *
 * @author joao-
 */
public class APPnotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação pelo app: " + mensagem);
    }
}
