/******************************************************************************
3.   
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class exloop3
{
	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int num;
        int multinatabuada;
        int i = 0;

        System.out.print("Insira um número: ");
        num = ler.nextInt();

        System.out.print("\nTabuada do " + num +":");

        while ( i < num){
            i++;
            multinatabuada = num * i;

            System.out.print("\n" +num+ " x "+ i +" = "+ multinatabuada);
        }
        

	}
}