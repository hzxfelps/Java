/******************************************************************************

exercicio 11 github
 Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano.
 Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo
 com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito.
 de 0 a 200 - nenhum crédito
 de 201 a 400 - 20% do valor do saldo médio
 de 401 a 600 - 30% do valor do saldo médio
 acima de 601 - 40% do valor do saldo médio

*******************************************************************************/
import java.util.Scanner;
public class ex11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double sm, vc, n1, n2, n3;
        String nome;
        System.out.println("Qual o nome do cliente?");
        nome = ler.nextLine();
        
        System.out.println("Qual o saldo médio do cliente?");
        sm = ler.nextDouble();
        
        n1 = sm * 0.20;
        
        n2 = sm * 0.30;
        
        n3 = sm * 0.40;
        
        if ( sm <= 200){
            
            System.out.println("O saldo medio foi insuficiente. Credito indisponivel.");
        }
        else if ( sm >= 201 && sm <= 400){
            System.out.println("O credito do cliente "+ nome +" é R$"+ n1);
        }
         else if ( sm >= 401 && sm <= 600){
            System.out.println("O credito do cliente "+ nome +" é R$"+ n2);
        }
         else if ( sm >= 601){
            System.out.println("O credito do cliente "+ nome +" é R$"+ n3);
        }
     
    }
}