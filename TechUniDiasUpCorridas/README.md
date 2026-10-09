# Tech UniDiasUp — Simulador de Pagamento de Motoristas

Projeto Java simples para demonstrar herança, classe abstrata, polimorfismo por sobrescrita e encapsulamento, sem interfaces e sem composição de objetos de serviço.

## Requisitos

- Java 11 ou superior.
- Não utiliza bibliotecas externas.

## Como executar

No terminal, entre na pasta `src` e compile:

```bash
javac *.java
java Main
```

## Regras implementadas

- **Motorista**: classe abstrata com atributos privados, registro de corridas e método abstrato `calcularPagamentoLiquido()`.
- **MotoristaIniciante**: retém 25% do bruto e desconta R$ 50,00 se realizar menos de 5 corridas.
- **MotoristaPremium**: adiciona R$ 2,00 ao valor bruto por corrida e retém 15%.
- **MotoristaParceiroFrotista**: retém 20%, desconta R$ 800,00 de aluguel e limita o pagamento mínimo a R$ 0,00.

## Decisão sobre o bônus Premium

O bônus de R$ 2,00 é incluído no valor bruto por meio da sobrescrita de `registrarCorrida()`. Assim, a taxa de 15% é calculada sobre o valor da corrida somado ao bônus.

## Observação

O extrato exibe o valor bruto armazenado e o pagamento líquido. Para o extrato, o valor líquido é apresentado com piso de R$ 0,00; a regra de negócio exige explicitamente esse piso para o frotista.
