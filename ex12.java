/******************************************************************************

ex.12

*******************************************************************************/
import java.util.Scanner;
public class ex12
{
	public static void main(String[] args) {
	    Double anoNasc, anoAlis, alistamento, anosFalta, anosPass;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Por favor, informe o seu nome: ");
		String Nome = ler.nextLine();
		System.out.println("Por favor, Informe o ano que nasceu: ");
		anoNasc = ler.nextDouble();
		System.out.println("Por favor, Informe qual o ano atual : ");
		anoAlis = ler.nextDouble();
		alistamento = anoAlis - anoNasc;
		anosFalta = 18 - alistamento;
		anosPass = alistamento - 18;
		if(alistamento > 18){
		 System.out.println("Já se passaram: "+ anosPass +" anos!");
		}
		 else if(alistamento < 18) { 
		   System.out.println("Ainda faltam: "+ anosFalta +" anos!");
		   }
		 else
		 System.out.println("Está na hora de se alistar!");
		 
		
	}
}
