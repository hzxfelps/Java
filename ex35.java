/******************************************************************************
 ex35 
 Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.

 * Montar um menu com os itens acima para o usuário escolher a forma de pagamento e mostrar a lista dos produtos comprados e o valor a ser pago.
*******************************************************************************/
import java.util.Scanner;
public class ex35
{
public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   int formaPgmnt;
   double preço;
   int i = 0;
   double totalprodutos = 0;
   String opção;
  do{
System.out.println("Nome do produto que deseja: ");

String nome = ler.nextLine();

System.out.println("Preço do produto que deseja: ");

preço = ler.nextDouble();

i++;

totalprodutos+=preço;

ler.nextLine();

} while (i < 10);

System.out.println(" Por favor! Selecione a forma de pagamento: \n 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto. \n 2 - À Vista no cartão de crédito, recebe 3% de desconto. \n 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros. \n 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%. forma de pagamento:");
formaPgmnt = ler.nextInt();

double desconto;
double valor;
double total;

if (formaPgmnt == 1) {
desconto = totalprodutos * 0.08;
valor = totalprodutos;
total = valor + desconto;
System.out.println("Pix selecionado: \nO pagamento irá ficar em:"+ total +"\nO desconto em cima dos produtos foi de:"+ desconto);
} else if (formaPgmnt == 2) {
 desconto = totalprodutos * 0.03;
 valor = totalprodutos;
 total = valor + desconto;
System.out.println("Cartão de crédito selecionado: \nO pagamento irá ficar em:"+ total +"\nO desconto em cima do produto foi de:"+ desconto);
} else if (formaPgmnt == 3) {
valor = totalprodutos;
System.out.println("Parcelado em duas vezes selecionado: \nO pagamento irá ficar em:"+ valor );
} else if (formaPgmnt == 4) {
double juros = totalprodutos * 0.10;
 valor = totalprodutos;
 total = valor + juros;
System.out.println("Parcelado em três vezes ou até 10 parcelas selecionado: \nO pagamento irá ficar em:"+ total +"\nO juros dos produtos foi de: "+ juros);
} else {
System.out.println("Opção inválida.");
}


}
}