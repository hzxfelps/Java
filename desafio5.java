/******************************************************************************
desafio5
Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. Calcule o valor final com juros 
compostos de 2% ao mês. Mostre o valor final e o valor de cada parcela. Permita simular vários empréstimos.
insira o valor
quantas parcelas
if parcelas >= 1
qntdparcelas += parcelas
calcular juros 
taxa = 0.02
double juroscompostos = valoremprestimo * Math.pow((1 + taxa), qntdparcelas);
*******************************************************************************/
import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valoremprestimo;
        int parcelas;

        System.out.println("--- Empréstimos ---");

        String continuar;

        do {
            System.out.print("Insira o valor do emprestimo: R$");
            valoremprestimo = ler.nextDouble();

            System.out.print("Quantas parcelas você gostaria de pagar?\n");
            parcelas = ler.nextInt();

            if (parcelas >= 1) {
                double taxa = 0.02;
                double totalvalue = valoremprestimo * Math.pow((1 + taxa), parcelas);
                double valueparcela = totalvalue / parcelas;

                System.out.println("Valor final com juros compostos: R$ " + totalvalue);
                System.out.println("Valor de cada parcela (" + parcelas + "x): R$ " + valueparcela);
            } else {
                System.out.println("Número de parcelas inválido.");
            }

            System.out.print("\nDeseja realizar outro empréstimo? (s/n): ");
            continuar = ler.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("\nAnálise de crédito finalizada.");
    }
}
