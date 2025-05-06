/*
Exercicio 003- Faça um Programa que peça as 
4 notas bimestrais e mostre a média.
*/
import java.util.Scanner;
public class rev003
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double soma = 0;
	double media = 0;
	for(int i = 0; i <4; i++){
    System.out.print("Digite a " +(i+1)+ "° nota: ");
    double num = scanner.nextDouble();
    soma += num;
    media = soma / 4;
	}
    System.out.print("A media do bimentre foi: "+media);
	
}
}