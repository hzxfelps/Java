/******************************************************************************

exercicio 5 github
 Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.

*******************************************************************************/
import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double n1, n2, n3, salario30porcento, valorparcela;
        System.out.print("Qual sera o valor do emprestimo? : ");
        n1 = ler.nextDouble();
       
        System.out.print("Em quantas parcelas sera pago? : ");
        n2 = ler.nextDouble();
       
        System.out.print("Qual o salario do solicitante? : ");
        n3 = ler.nextDouble();
        
        salario30porcento = 30/n3 * 100;
        valorparcela = n1/n2;
        
        if ( valorparcela <= salario30porcento ){
            System.out.println("O emprestimo foi aprovado!");
        }
        else {
            System.out.println("O emprestimo foi reprovado!");
        }
     
    }
}