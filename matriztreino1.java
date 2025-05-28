/******************************************************************************

 1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.

*******************************************************************************/
import java.util.Scanner;
public class matriztreino1
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);

    int [][] matriz = new int [5][5];
    int numpar = 0;

    System.out.println("Entre com os números da matriz: ");
    for (int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++){
            matriz [i][j] = ler.nextInt();
        }
    }
    
    System.out.println("Os números pares presentes na matriz são:\n");

    for (int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++){
            if (matriz[i][j] % 2 == 0){
                numpar++;
                for (int k = 0; k < 1; k++){
                    for (int b = 0; b < 1; b++){
                        System.out.println(matriz[i][j]+" ");
                    }
                }
            }
        }
    }

    System.out.println("Quantidade de números pares: "+ numpar);
    
	}
    }


