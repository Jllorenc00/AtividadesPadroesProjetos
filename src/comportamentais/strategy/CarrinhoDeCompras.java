package comportamentais.strategy;

/**
 *
 * @author joao-
 */
class CarrinhoDeCompras {

    private EstrategiaDesconto estrategiaDesconto;

    public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double calcularValorFinal(double valor) {
        double desconto = estrategiaDesconto.calcularDesconto(valor);
        return valor - desconto;
    }
}
