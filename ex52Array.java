/******************************************************************************
ex52
Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array, calcule e apresente a soma das idades. 
Verificar as idades e apresentar se a pessoal é " Melhor idade", " Adulto" ou "Criança".

*******************************************************************************/

import java.util.Scanner;
public class ex52
{
	public static void main(String[] args) {
		int length = 6;
		int [] age = new int[length];
		String[] name = new String[length];
		int lakers = 0;
		Scanner ler = new Scanner (System.in);
	
		
		for(int i = 0; i < age.length; i++){
		System.out.println("Digite o nome da "+ (i+1)+ " º Pessoa ");
		name[i] = ler.nextLine();
		
		
		System.out.println("Digite a idade da "+ (i+1) +"º Pessoa ");
		age[i] = ler.nextInt();
		lakers += age[i];
		
		ler.nextLine();
		}
		
		for(int i = 0 ; i < age.length; i++){
		    if(age[i] < 18){
		    System.out.println(name[i]+ " é crianças.");
		    } else if(age[i] >= 18 && age[i] <= 60){
		        System.out.println(name[i]+ " é adultos.");
		    } else if(age[i] >= 60) {
		        System.out.println(name[i]+ " é da melhor idade.");
		    }
		   
		    
		}
		System.out.println("E o total das idades é de: "+ lakers);
		
		
	
			
	}
}