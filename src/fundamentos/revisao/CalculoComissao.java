package fundamentos.revisao;

import java.util.Scanner;

public class CalculoComissao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Quantos veículos foram vendidos: ");
        int quantidadeDeVeiculosVendidos = scanner.nextInt();

        System.out.print("Valor da comissão por veículo: R$ ");
        double comissaoPorVeiculo = scanner.nextDouble();

        double comissaoTotal = quantidadeDeVeiculosVendidos * comissaoPorVeiculo;

        int comissaoTotalInteira = (int) comissaoTotal;

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Veículos vendidos: " + quantidadeDeVeiculosVendidos);
        System.out.println("Comissão por veículo: R$ " + comissaoPorVeiculo);
        System.out.println("Comissão total: R$ " + comissaoTotal);
        System.out.println("Comissão total sem centavos: R$ " + comissaoTotalInteira);

        scanner.close();

    }
}
