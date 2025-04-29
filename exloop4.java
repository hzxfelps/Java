/******************************************************************************
4.
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner;
public class exloop4
{
	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int num;
        int multinatabuada;

        System.out.print("Insira um número: ");
        num = ler.nextInt();

        System.out.print("\nTabuada do " + num +":");

        for (int i = 1; i <= num; i++){
            multinatabuada = num * i;

            System.out.print("\n" +num+ " * "+ i +" = "+ multinatabuada);
        }
        }
        
	}