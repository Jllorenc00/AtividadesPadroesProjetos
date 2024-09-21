package comportamentais.strategy;

/**
 *
 * @author joao-
 */
class DescontoQuantidade implements EstrategiaDesconto {

    private int quantidade;

    public DescontoQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularDesconto(double valor) {
        if (quantidade > 10) {
            return valor * 0.10; 
        }
        return 0;
    }
}
