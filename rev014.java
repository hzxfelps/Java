/*
Exemplo11- Faça um programa que recebe o salário de um colaborador e o reajuste 
segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*/
import java.util.Scanner;
public class rev014
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = 0;

	double salario1; 
	double salario2; 
	double salario3; 
	double salario4;
	
	System.out.print("Digite o salario: ");
	double salario = scanner.nextDouble();
	
	if(salario <= 280) {
	salario1 = (salario*0.20)+ salario;
	System.out.print("O valor do novo salário é: R$"+salario1+"\nO aumento foi de 20%, ou seja: R$" + (salario1 - salario));
	
	} else if(salario < 280 && salario < 700) {
	salario2 = (salario*0.15)+ salario;
	System.out.print("O valor do novo salário é: R$"+salario2+"\nO aumento foi de 15%, ou seja: R$" + (salario2 - salario));
	
	} else if(salario > 280 && salario < 1500) {
	salario3 = (salario*0.10)+ salario;
	 System.out.println("O valor do novo salário é: R$" + salario3+"\nO aumento foi de 10%, ou seja: R$" + (salario3 - salario));
	
	} else {
	salario4 = (salario*0.5)+salario;
	System.out.print("O valor do novo salário é: R$"+salario4+"\nO aumento foi de 5%, ou seja: R$" + (salario4 - salario));
	}
}
}
