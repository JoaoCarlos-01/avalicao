public class MotoristaPremium extends Motorista {
    private static final double TAXA_PLATAFORMA = 0.15;
    private static final double BONUS_POR_CORRIDA = 2.00;

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public void registrarCorrida(double valor) {
        // O bônus é somado ao bruto antes do cálculo da taxa da plataforma.
        super.registrarCorrida(valor + BONUS_POR_CORRIDA);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBruto() * (1.0 - TAXA_PLATAFORMA);
    }
}
