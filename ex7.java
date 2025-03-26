/******************************************************************************

exercicio 7 github
 Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.

*******************************************************************************/
import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double n1, n2, n3;
        System.out.print("Qual o total vendido durante o mes de abril? ");
        n1 = ler.nextDouble();
        
        //salario base é de 1200
        
        //n2 = comissao
        n2 = 10/n1 * 100;
        
        if ( n1 > 2000 ){
        
        // n3 = salario com comissao
        
            n3 = 1200 + n2;
            System.out.println("A comissao recebida é de "+ n2 +". O salario bruto juntamente da comissao é igual a: "+ n3 );
        }
        else {
            System.out.println("O numero de vendas foi insuficiente. A condicao para ganho de comissao foi reprovada.");
        }
     
    }
}