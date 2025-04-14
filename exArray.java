//é para ler o nome e idade de 5 pessoas e mostrar o nome e a idade das pessoas maiores de idade. 
import java.util.Scanner;

public class exArray
{
	public static void main(String[] args) {
		String [] name = new String[5];
		int [] yo = new int [5];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < name.length; i++){
		    System.out.println("Insira o nome da "+ (i+1) + "° pessoa: ");
		    name[i] = ler.nextLine();
		    System.out.println("Insira a idade do aluno(a) ("+ name[i] +"):");
		    yo[i] = ler.nextInt();
		    ler.nextLine();
		}
		for (int i = 0; i < name.length; i++){
		    if (yo[i] >= 18) { 
                System.out.println(name[i] + " tem " + yo[i] + " anos.");
		}
		
		}
	}
}

