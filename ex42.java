/******************************************************************************
ex.42
Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.

*******************************************************************************/
import java.util.Scanner;
public class ex42
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		System.out.println("Tamanhos de camisetas disponíveis: \n 1) P (Pequeno) \n 2) M (Médio) \n 3) G (Grande) \nPor favor, selecione o tamanho da camiseta:");
		int typeshirt = ler.nextInt();
		switch (typeshirt){
		    case 1:
		     System.out.println("Tamanho pequeno selecionado. Insira a quantidade de camisetas desejadas: ");
		     int amountsmall = ler.nextInt();
		     double valuesmall = amountsmall * 10;
		     System.out.println("Quantidade de camisetas: "+ amountsmall +"\nValor total: "+ valuesmall);
		     break;
		    case 2: 
		     System.out.println("Tamanho médio selecionado. Insira a quantidade de camisetas desejadas: ");
		     int amountmed = ler.nextInt();
		     double valuemed = amountmed * 12;
		     System.out.println("Quantidade de camisetas: "+ amountmed +"\nValor total: "+ valuemed);
		     break;
		    case 3: 
		     System.out.println("Tamanho grande selecionado. Insira a quantidade de camisetas desejadas: ");
		     int amountlarg = ler.nextInt();
		     double valuelarg = amountlarg * 15;
		     System.out.println("Quantidade de camisetas: "+ amountlarg +"\nValor total: "+ valuelarg);
		     break;
		        
		}
	}
}
