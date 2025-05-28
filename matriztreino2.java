/******************************************************************************

 2. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
Ex:
Soma Coluna 1 = 8
Soma Coluna 2 = 5
Soma Coluna 3 = 6

*******************************************************************************/
import java.util.Scanner;
public class matriztreino2
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);

    int [][] lebron = new int [3][3];
    int somacoluna1 = 0;
    int somacoluna2 = 0;
    int somacoluna3 = 0;

    System.out.println("Entre com os números da matriz: ");
    for (int i = 0; i < lebron.length; i++){
        for (int j = 0; j < lebron[i].length; j++){
            lebron [i][j] = ler.nextInt();
        }
        somacoluna1 += lebron[0][0];
        somacoluna2 += lebron[0][1];
        somacoluna3 += lebron[0][2];
    }

    System.out.println("Soma das colunas:\nColuna 1: "+somacoluna1+"\nColuna 2: "+somacoluna2+"\nColuna 3: "+somacoluna3);


	}
}

