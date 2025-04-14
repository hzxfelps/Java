/******************************************************************************
desafio4
 Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa informa quantas cédulas de R$100,
R$50, R$20, R$10 e R$5 serão entregues, com base nas cédulas disponíveis. Caso não seja possível realizar o 
saque com as cédulas, exiba uma mensagem de erro.
*******************************************************************************/
import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("=== Caixa Eletrônico ===");
        System.out.print("Informe o valor do saque: R$ ");
        int valor = ler.nextInt();

        if (valor % 5 != 0 || valor <= 0) {
            System.out.println("Não é possível sacar esse valor com as cédulas disponíveis.");
        } else {
            int ced100 = valor / 100;
            valor = valor % 100;

            int ced50 = valor / 50;
            valor = valor % 50;

            int ced20 = valor / 20;
            valor = valor % 20;

            int ced10 = valor / 10;
            valor = valor % 10;

            int ced5 = valor / 5;
            valor = valor % 5;

            System.out.println("Cédulas entregues:");
            System.out.println("R$100: " + ced100);
            System.out.println("R$50: " + ced50);
            System.out.println("R$20: " + ced20);
            System.out.println("R$10: " + ced10);
            System.out.println("R$5: " + ced5);
        }
    }
}
