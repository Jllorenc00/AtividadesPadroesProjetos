package estruturais.decorator;

/**
 *
 * @author joao-
 */
public class LogAuditoriaDecorator extends NotificacaoDecorator {

    public LogAuditoriaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        log(mensagem);
        super.enviar(mensagem);
    }

    private void log(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }
}
