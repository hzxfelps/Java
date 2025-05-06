/*
Exercicio 008- João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limitee na variável multa o valor da multa 
que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*/
import java.util.Scanner;
public class rev008
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double total = 0;
	double multa;
	
	System.out.print("O preço do Kg é de R$30.00.\nDigite o peso total dos peixes : ");
	double pesoPeixe = scanner.nextDouble();
	total = pesoPeixe * 30;
	if(pesoPeixe > 50) {
	multa = (pesoPeixe - 50) * 4;
	System.out.print("O valor da multa a ser pago é de: "+multa+"\nO valor total a ser pago é de: "+ (total+multa));
	} else {
	    System.out.print("O valor total a ser pago é: "+total );
	}
	
	}
}
