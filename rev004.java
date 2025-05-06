/*
Exercicio 004- Faça um Programa que converta
metros para centímetros.
*/
import java.util.Scanner;
public class rev004
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double conv = 0;
	
	System.out.print("Digite um numero em metros para converter em centímetros: ");
	double num = scanner.nextDouble();
	
	conv = num*100;
	
	System.out.print("A conversão é de: "+conv+"cm.");
	}
}