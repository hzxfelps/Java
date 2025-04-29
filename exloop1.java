/******************************************************************************
1.   
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize while.
Se um número % 2 == 0, ele é par; se % 2 != 0, é ímpar.
*******************************************************************************/
public class exloop1
{
	public static void main(String[] args) {
        int pares = 1;
        int impares = 50;
        
        System.out.print("Números pares:");

		while ( pares <= 50){
            if (pares % 2 == 0){
            System.out.print("\n" + pares);
        }
        pares++;
    }
    
    System.out.print("\nNúmeros Impares:");

    while (impares <= 100){
        if (impares % 2 != 0){
            System.out.print("\n" + impares);
        }
        impares++;
    }

	}
}
