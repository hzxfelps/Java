/******************************************************************************

7)Desenvolva um programa que calcule a área de um circulo utilizando a constante Math.PI
   // Define PI como uma constante --> final double PI = Math.PI;

*******************************************************************************/
import java.util.Scanner;
public class JavaPesquisaex7
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        double raio ;

        System.out.print("Olá! Insira o raio do circulo (em cm): ");
        raio = ler.nextDouble();
        
        double area = Math.PI * ( raio * raio );

        System.out.println("A área do círculo é: " + area +"cm²");
        		
	}
}
