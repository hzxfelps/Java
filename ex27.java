/******************************************************************************
ex.27
 Faça um programa, utilizando while, que permita o usuário escrever o nome de cinco pessoas e os mostre na tela.

*******************************************************************************/
import java.util.Scanner;
public class ex27
{
	public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in); 
	   String nome ="";
	   int i = 0;
	   while(i <= 4){
	   i++;
	   System.out.println("Por favor, digite o nome da " +i+ " Pessoa:");
	   nome = ler.nextLine();
	  System.out.println("nome digitado: "+ nome);
	  
	    
	    }
	     ;
	}
}

