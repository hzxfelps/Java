/*
Exercicio 022- Crie um vetor de 5 números inteiros, preencha 
com valores de sua escolha e calcule a soma de todos os elementos 
desse vetor. Exiba o resultado.
*/
import java.util.Scanner;
public class rev022
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int [] num = {1, 7, 14, 21, 28};
    int soma = 0;
   
   System.out.print("Os vetores são: ");
    for( int i = 0; i < 5; i++) {
    System.out.print("\n"+num[i]);
    soma += num[i];
    }
    System.out.print("\nA sua soma é: "+soma);
	    
	}
	}


