/*
Exercicio 007- Tendo como dados de entrada a
altura de uma pessoa,construa um algoritmo que 
calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
*/
import java.util.Scanner;
public class rev007
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double pesoIdeal = 0;
	
	System.out.print("Digite a sua altura: ");
	double alt = scanner.nextDouble();
	pesoIdeal = (72.7*alt) - 58;
	
	System.out.print("Seu peso ideal é: "+pesoIdeal);
	}
}