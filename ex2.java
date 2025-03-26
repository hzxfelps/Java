/******************************************************************************

github
ex.02

*******************************************************************************/
import java.util.Scanner;
public class ex2
{
	public static void main(String[] args) {
	    Double idade;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Por favor, Informe sua idade: ");
		idade = ler.nextDouble();
		if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
		
		
	}
}