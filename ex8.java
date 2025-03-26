/******************************************************************************

ex.08

*******************************************************************************/
import java.util.Scanner;
public class ex8
{
	public static void main(String[] args) {
	    Double h, pesoideal1, pesoideal2, sexo;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Por favor, informe seu sexo (1 para masculino e 2 para feminino): ");
		sexo = ler.nextDouble();
		System.out.println("Por favor informe sua altura: ");
		h = ler.nextDouble();
		
		pesoideal1 = 72.7 * h;
		pesoideal2 = 62.1 * h;
		
		if(sexo == 1){
		 System.out.println("Seu peso ideal é de: "+ pesoideal1);
		} else 
		   System.out.println("Seu peso ideal é de: "+ pesoideal2);
		
	}
}
