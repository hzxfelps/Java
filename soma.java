/******************************************************************************

Soma

*******************************************************************************/
import java.util.Scanner;
public class soma
{
	public static void main(String[] args) {
		Double a, b, soma;
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Insira o primeiro numero: ");
		a = ler.nextDouble();
		
		System.out.print("Insira o segundo numero: ");
		b = ler.nextDouble();
		
		soma = a + b;
		
		System.out.println("A soma dos dois números será de: " + soma);
	}
}
