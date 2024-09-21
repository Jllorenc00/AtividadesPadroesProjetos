package estruturais.decorator;

/**
 *
 * @author joao-
 */
public class SMSNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
