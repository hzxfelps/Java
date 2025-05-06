/*
Exercicio 010- Faça um Programa que peça dois números e imprima o maior deles.
*/
import java.util.Scanner;
public class rev0010
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	
	System.out.print("Digite o primeiro numero: ");
	int num1 = scanner.nextInt();
	System.out.print("Digite o segundo numero: ");
	int num2 = scanner.nextInt();
	
	if(num1 > num2){
	System.out.print("O primeiro numero é maior: "+num1);
	} else {
	System.out.print("O segundo numero é maior: "+num2);
	}
	
	}
}
