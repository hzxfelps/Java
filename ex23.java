/******************************************************************************

ex23
Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. Calcule e mostre as médias dos pesos das 
pessoas da mesma faixa etária. 
As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.


*******************************************************************************/
import java.util.Scanner;
public class ex23
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    
	    int somapeso1a10 = 0;
	    int somapeso11a20 = 0;
	    int somapeso21a30 = 0;
	    int somapeso30mais = 0;
	    int faixaet1a10 = 0;
	    int faixaet11a20 = 0;
	    int faixaet21a30 = 0;
	    int faixaet30mais = 0;
	    
	    for(int i = 1; i <= 5; i++){
	        
		System.out.println("Digite o peso da "+ i +" º pessoa:");
		double peso = ler.nextDouble();
		
		System.out.println("Digite a idade da "+ i +" º pessoa: ");
		double idade = ler.nextDouble();
		
		if(idade >= 1 && idade <= 10){
		somapeso1a10 += peso;
		faixaet1a10++;
		} else if(idade >= 11 && idade <=20){
		somapeso11a20 += peso;
		faixaet11a20++;
		} else if(idade >= 21 && idade <= 30){
		somapeso21a30 += peso;
		faixaet21a30++;
		} else if (idade >= 31){
		somapeso30mais += peso;
		faixaet30mais++;
		  }
	    }
	    
	    double media1a10 = (faixaet1a10 > 0) ? somapeso1a10 / faixaet1a10 : 0;
        double media11a20 = (faixaet11a20 > 0) ? somapeso11a20 / faixaet11a20 : 0;
        double media21a30 = (faixaet21a30 > 0) ? somapeso21a30 / faixaet21a30 : 0;
        double media30mais = (faixaet30mais > 0) ? somapeso30mais / faixaet30mais : 0;
	    
	    System.out.print("A media de pesos da faixa etaria de 1 a 10 anos é: " + media1a10);
	    System.out.print("\nA media de pesos da faixa etaria de 11 a 20 anos é: "+ media11a20);
		System.out.print("\nA media de pesos da faixa etaria de 21 a 30 anos é: "+ media21a30);
		System.out.print("\nA media de pesos da faixa etaria acima de 31 é: "+ media30mais);
	     
	    
		
		
	}
}
