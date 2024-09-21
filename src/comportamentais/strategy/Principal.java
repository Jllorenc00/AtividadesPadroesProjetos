package comportamentais.strategy;

/**
 *
 * @author joao-
 */
public class Principal {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        double valorCompra = 100.0;
        
        System.out.println("Valor original: " + valorCompra);

        carrinho.setEstrategiaDesconto(new DescontoQuantidade(15));
        System.out.println("Valor final com desconto por quantidade: " + carrinho.calcularValorFinal(valorCompra));

        carrinho.setEstrategiaDesconto(new DescontoTemporada());
        System.out.println("Valor final com desconto de temporada: " + carrinho.calcularValorFinal(valorCompra));

        carrinho.setEstrategiaDesconto(new DescontoMembroVIP());
        System.out.println("Valor final com desconto de membro VIP: " + carrinho.calcularValorFinal(valorCompra));
    }
}
