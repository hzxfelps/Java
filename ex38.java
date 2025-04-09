/******************************************************************************
ex38
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. 
Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). 
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

*******************************************************************************/
import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double total = 0, savedmoney, totalvaluebroa = 0, totalvaluebread = 0;
        int option = 0, amountbroa = 0, amountbread = 0;

        while (option != 5){

            System.out.println("\nEntre com uma opção:\n1)Checar o valor arrecadado pelas vendas de broas;\n2)Checar o valor arrecadado pelas vendas de pães;\n3)Checar o valor total arrecadado;\n4)Checar o valor que será depositado na poupança;\n5) Sair.");
            option = ler.nextInt();

            switch(option) {
                case 1:
                    System.out.println("\nQuantas broas foram vendidas hoje?");
                    amountbroa = ler.nextInt();
                    totalvaluebroa = amountbroa * 1.50;
                    System.out.println("\nA venda de " + amountbroa + " broas arrecadou um total de R$" + totalvaluebroa + " reais.");
                    break;

                case 2:
                    System.out.println("\nQuantos pães foram vendidos hoje?");
                    amountbread = ler.nextInt();
                    totalvaluebread = amountbread * 0.12;
                    System.out.println("\nA venda de " + amountbread + " pães arrecadou um total de R$" + totalvaluebread + " reais.");
                    break;

                case 3:
                    if (amountbread == 0) {
                        total = (totalvaluebread + totalvaluebroa);
                        System.out.println("\nO total das vendas de " + amountbroa + " broas e " + amountbread + " pães equivale a R$" + total + " reais.");
                        break;
                    } else if (amountbroa == 0) {
                        total = (totalvaluebread + totalvaluebroa);
                        System.out.println("\nO total das vendas de " + amountbroa + " broas e " + amountbread + " pães equivale a R$" + total + " reais.");
                        break;
                    } else {
                        total = (totalvaluebread + totalvaluebroa);
                        System.out.println("\nO total das vendas de " + amountbroa + " broas e " + amountbread + " pães equivale a R$" + total + " reais.");
                    }
                    break;

                case 4:
                    savedmoney = (total * 10) / 100;
                    System.out.println("\nR$" + savedmoney + " reais, o equivalente a 10% da venda de broas e pães hoje, serão depositados em sua poupança.");
                    break;

                case 5:
                    System.out.println("\nAté amanhã!");
                    break;

                default:
                    System.out.println("\nERRO.");
                    break;
            }
        }
    }
}
