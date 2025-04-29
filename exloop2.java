/******************************************************************************
2.   
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize for.
*******************************************************************************/
public class exloop2
{
	public static void main(String[] args) {

        System.out.print("Números pares: ");
        for (int par = 0; par <= 50; par++){
            if (par % 2 == 0){
                System.out.print("\n"+ par);
            }
        }

        System.out.print("\nNúmeros impares: ");
        for (int impar = 51; impar <= 100; impar++){
            if (impar % 2 != 0){
                System.out.print("\n" + impar);
            }
        }

	}
}
