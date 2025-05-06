/*
Exercicio 002- Faça um Programa que peça dois
números e imprima a soma.
*/
import java.util.Scanner;
public class rev002
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double soma = 0;
	
	for(int i = 0; i <2; i++){
    System.out.print("Digite o " +(i+1)+ "° numero: ");
    double num = scanner.nextDouble();
    soma += num;
	}
    System.out.print("A soma dos numeros foi: "+soma);
	
}
}