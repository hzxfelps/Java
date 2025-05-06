/*
Exercicio 023- Crie um vetor de 7 números inteiros e escreva um 
programa que encontre o maior número presente no vetor e exiba-o.
*/
import java.util.Scanner;
public class rev023
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int [] num = {1, 7, 14, 21, 28, 35, 42};
    int maior = num[0];
   
   System.out.print("Os vetores são: ");
   for( int i = 1; i < 7; i++) {
    System.out.print("\n"+num[i]);

    if(num[i] > maior) {
    maior = num[i];
    }
   }
    System.out.print("\nO maior número é: "+maior);
	}
	}


