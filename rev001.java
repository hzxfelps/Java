/*
Exercicio 001- Faça um Programa que peça um número e então 
mostre a mensagem O número informado foi [número].
*/
import java.util.Scanner;
public class rev001
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Digite o numero: ");
    double num = scanner.nextDouble();
    
    System.out.print("O numero informado foi: "+num);
	}
}