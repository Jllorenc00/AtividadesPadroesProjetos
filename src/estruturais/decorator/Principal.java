package estruturais.decorator;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Notificacao email = new EmailNotificacao();
        Notificacao emailComCriptografiaELog = new LogAuditoriaDecorator(new CriptografiaDecorator(email));

        Notificacao sms = new SMSNotificacao();

        emailComCriptografiaELog.enviar("Mensagem por e-mail.");
        sms.enviar("Mensagem por SMS.");

    }
}
