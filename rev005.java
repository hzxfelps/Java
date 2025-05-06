/*
Exercicio 005- Faça um Programa que pergunte quanto você ganha por 
hora e o número de horas trabalhadas no mês. Calcule e 
mostre o total do seu salário no referido mês.
*/
import java.util.Scanner;
public class rev005
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double total = 0;
	
	System.out.print("Digite quanto você ganha por hora: ");
	double hrs = scanner.nextDouble();
	System.out.print("Digite o numero de horas trabalhadas no mês: ");
	double trabMes = scanner.nextDouble();
	total = hrs*trabMes;
	
	System.out.print("O total do seu salário no mês foi: "+total);
	}
}