package criacional.build;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        Sanduiche sanduiche1 = new Sanduiche.Builder("Pao Branco")
                .comCarne("Presunto")
                .build();

        Sanduiche sanduiche2 = new Sanduiche.Builder("Pao Integral")
                .comCarne("Peito de Frango")
                .comQueijo("Queijo Cheddar")
                .comAlface(true)
                .comTomate(true)
                .comMolho("Molho Barbecue")
                .build();

        System.out.println(sanduiche1);
        System.out.println(sanduiche2);
    }
}
