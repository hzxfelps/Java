//**************************************************************************************************************
//
//ex49Array
//
//Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
//cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.
//***********************************************************************************************************************//
import java.util.Scanner;

public class ex49Array
{
	public static void main(String[] args) {
	    int TAMANHO = 10;
		int [] num1 = new int[TAMANHO];
        int [] num2 = new int[TAMANHO];
        int [] somaarrays = new int[TAMANHO];
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Primeiro array:\n");

		for (int i = 0; i < TAMANHO; i++){
		    System.out.print("Insira o "+ (i+1) + "° número: ");
		    num1[i] = ler.nextInt();
		}
		
		System.out.print("Segundo array:\n");

        for (int j = 0; j < TAMANHO; j++){
		    System.out.print("Insira o "+ (j+1) + "° número: ");
		    num2[j] = ler.nextInt();
		}

		int total = 0;
		for (int i = 0; i < TAMANHO; i++) {
		    total += num1[i] + num2[i];
		}
		somaarrays[0] = total; 

        System.out.println("A soma dos dois arrays é igual a: " + somaarrays[0]);
	}
}
