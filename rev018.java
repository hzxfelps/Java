/*
Exercicio 018- Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
*/
import java.util.Scanner;
public class rev018
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	
	System.out.print("Digite o 1° numero: ");
	int num1 = scanner.nextInt();
	System.out.print("Digite o 2° numero: ");
	int num2 = scanner.nextInt();
	
	if ( num1 < num2){
	    for(int i = num1; i < num2; i++){
	    System.out.print("\n"+i);
	}
	} else if ( num1 > num2){
	    for(int i = num2; i < num1; i++){
	    System.out.print("\n"+i);
	}
	}
	    
	    
	}
	}


