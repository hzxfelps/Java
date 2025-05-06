/*
Exercicio 017- Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
*/
import java.util.Scanner;
public class rev017
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Os numeros impares são: ");
	
	for(int i=0; i < 50; i++) {
	if( i % 2 != 0){
	System.out.print("\n"+i);
	}
	}
}
}
