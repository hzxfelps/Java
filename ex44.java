/******************************************************************************

44 - Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.

*******************************************************************************/
import java.util.Scanner;
public class ex44
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		System.out.println("Qual o valor da conta que Carlos, André e Felipe devem pagar: ");
		double value = ler.nextDouble();
		int AndreandCarlos = (int) value / 3;
		double felipe = value - 2 * AndreandCarlos;
		System.out.println("Valor a pagar (individualmente):\nAndré: "+ AndreandCarlos +"\nCarlos: "+ AndreandCarlos +"\nFelipe: "+ felipe);
	
		
	}
}
