/******************************************************************************
 4. Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
 transposta da primeira (troque as linhas por colunas)
 *******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz=new int[3][3];


        System.out.println("Digite os numeros da matrix: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Matriz: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + "");
            }
            System.out.println();
        }


        int[][] transposta= new int[3][3];

        for(int i = 0; i < transposta.length; i++) {
            for(int j = 0; j < transposta[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }


        System.out.print("Matriz tranposta: ");
        for(int i = 0; i < transposta.length; i++) {
            for(int j = 0; j < transposta[i].length; j++) {
                System.out.println(transposta[i][j] + "");
            }
            System.out.println();
        }


    }
}
