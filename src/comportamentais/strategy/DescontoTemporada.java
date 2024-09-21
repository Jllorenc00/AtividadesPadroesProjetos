package comportamentais.strategy;

/**
 *
 * @author joao-
 */
class DescontoTemporada implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.15;
    }
}
