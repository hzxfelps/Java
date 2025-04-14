import java.util.Scanner;

public class example2Array
{
	public static void main(String[] args) {
		int [] num = new int[5];
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < num.length; i++){
		    System.out.print("Insira o "+ (i+1) + "° número: ");
		    num[i] = ler.nextInt();
		}
		for (int i = 0; i < num.length; i++){
		    System.out.print("\nO " + (i+1)+ "° número é igual a: " + num[i]);
		}
		}
	}

