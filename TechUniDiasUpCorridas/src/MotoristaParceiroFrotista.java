public class MotoristaParceiroFrotista extends Motorista {
    private static final double TAXA_PLATAFORMA = 0.20;
    private static final double ALUGUEL_VEICULO = 800.00;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoAposTaxa = getValorBruto() * (1.0 - TAXA_PLATAFORMA);
        double pagamentoAposAluguel = pagamentoAposTaxa - ALUGUEL_VEICULO;

        return Math.max(0.0, pagamentoAposAluguel);
    }
}
