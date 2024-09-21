package comportamentais.strategy;

/**
 *
 * @author joao-
 */
class DescontoMembroVIP implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20; 
    }
}
