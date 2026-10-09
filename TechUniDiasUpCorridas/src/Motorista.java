public abstract class Motorista {
    private final String nome;
    private final String placaVeiculo;
    private int quantidadeCorridas;
    private double valorBruto;

    public Motorista(String nome, String placaVeiculo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do motorista é obrigatório.");
        }
        if (placaVeiculo == null || placaVeiculo.isBlank()) {
            throw new IllegalArgumentException("A placa do veículo é obrigatória.");
        }

        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridas = 0;
        this.valorBruto = 0.0;
    }

    public void registrarCorrida(double valor) {
        if (valor < 0 || !Double.isFinite(valor)) {
            throw new IllegalArgumentException("O valor da corrida deve ser válido e não negativo.");
        }

        quantidadeCorridas++;
        valorBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorBruto() {
        return valorBruto;
    }
}
