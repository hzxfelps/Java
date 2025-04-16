/******************************************************************************
53.Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
       * pesquisar para obter os valores em ordem crescente e decrescente.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class ex53
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double[] infive = new double[10];
		for(int i = 0; i < infive.length; i++){
		    System.out.println("Digite o "+ (i+1) +" º numero");
		    infive[i] = ler.nextDouble();
		}
		 
	  Arrays.sort(infive);
	  System.out.println("Ordem crescente: ");
	  for(int i = 0; i < infive.length; i++){
	      System.out.println(infive[i] + " ");
	  }
	  
	  System.out.println("Ordem decrescente: ");
	   for(int i = infive.length - 1; i >= 0; i--){
	       System.out.println(infive[i] + " ");
	   }
	   
	     System.out.println("Ordem invertida:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(infive[i] + " ");
        }
       
		 
		
		 

		
	}
}