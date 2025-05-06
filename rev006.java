/*
Exercicio 006- Faça um Programa que peça a temperatura 
em graus Farenheit, transforme e mostre a temperatura em 
graus Celsius. C = (5 * (F-32) / 9).
*/
import java.util.Scanner;
public class rev006
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double celsius = 0;
	
	System.out.print("Digite a temperatura em graus Farenheit: ");
	double Farenheit = scanner.nextDouble();
	celsius = 5*(Farenheit - 32) / 9;
	
	System.out.print("A conversão para graus Celsius foi de: "+celsius);
	}
}