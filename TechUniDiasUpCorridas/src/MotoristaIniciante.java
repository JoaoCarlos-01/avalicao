public class MotoristaIniciante extends Motorista {
    private static final double TAXA_PLATAFORMA = 0.25;
    private static final int LIMITE_CORRIDAS_SEM_TAXA_INATIVIDADE = 5;
    private static final double TAXA_INATIVIDADE = 50.00;

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoAposTaxa = getValorBruto() * (1.0 - TAXA_PLATAFORMA);

        if (getQuantidadeCorridas() < LIMITE_CORRIDAS_SEM_TAXA_INATIVIDADE) {
            pagamentoAposTaxa -= TAXA_INATIVIDADE;
        }

        return pagamentoAposTaxa;
    }
}
