import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        Motorista iniciante = new MotoristaIniciante("Ana Souza", "ABC1D23");
        Motorista premium = new MotoristaPremium("Bruno Lima", "DEF4G56");
        Motorista frotista = new MotoristaParceiroFrotista("Carla Mendes", "GHI7J89");

        iniciante.registrarCorrida(40.00);
        iniciante.registrarCorrida(35.50);
        iniciante.registrarCorrida(28.00);

        premium.registrarCorrida(50.00);
        premium.registrarCorrida(62.50);
        premium.registrarCorrida(45.00);

        frotista.registrarCorrida(300.00);
        frotista.registrarCorrida(450.00);
        frotista.registrarCorrida(500.00);

        List<Motorista> motoristas = List.of(iniciante, premium, frotista);

        System.out.println("========== EXTRATOS DE PAGAMENTO ==========");
        for (Motorista motorista : motoristas) {
            imprimirExtrato(motorista);
        }
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Motorista: " + motorista.getNome());
        System.out.println("Placa: " + motorista.getPlacaVeiculo());
        System.out.println("Corridas realizadas: " + motorista.getQuantidadeCorridas());
        System.out.printf("Valor bruto: R$ %.2f%n", motorista.getValorBruto());
        System.out.printf("Valor líquido a receber: R$ %.2f%n",
                motorista.calcularPagamentoLiquido());
        System.out.println("-------------------------------------------");
    }
}
