package estruturais.decorator;

/**
 *
 * @author joao-
 */
public class CriptografiaDecorator extends NotificacaoDecorator {

    public CriptografiaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        String mensagemCriptografada = criptografar(mensagem);
        super.enviar(mensagemCriptografada);
    }

    private String criptografar(String mensagem) {
        return mensagem;
    }
}
