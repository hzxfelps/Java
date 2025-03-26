/******************************************************************************

github
ex.04

*******************************************************************************/
import java.util.Scanner;
public class ex4
{
	public static void main(String[] args) {
	    Double salario, bonus1, bonus2, tempo, salariot1, salariot2;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Por favor, Informe seu salario: ");
		salario = ler.nextDouble();
		System.out.println("Por favor, informe seu tempo na empresa: ");
		tempo = ler.nextDouble();
		bonus1 = salario * 0.2;
		bonus2 = salario * 0.1;
		salariot1 = salario + bonus1;
		salariot2 = salario + bonus2;
		if (tempo >= 5) {
            System.out.println("Você tem mais 5 anos de empresa, seu bonus salarial é de: "+ bonus1 +" E seu salario total é de: "+ salariot1);
        } else {
            System.out.println("Você tem menos que 5 anos de empresa, seu bonus salarial é de: "+ bonus2 +" E seu salario total é de: "+ salariot2);
        }
		
		
	}
}