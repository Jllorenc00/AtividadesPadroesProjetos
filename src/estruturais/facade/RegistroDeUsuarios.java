package estruturais.facade;

/**
 *
 * @author joao-
 */
public class RegistroDeUsuarios {

    public void registrarUsuario(String nome) {
        System.out.println("Registrando usuario: " + nome);
    }

    public void consultarUsuario(String nome) {
        System.out.println("Consultando usario: " + nome);
    }
}
