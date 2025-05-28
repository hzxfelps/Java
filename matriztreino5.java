/******************************************************************************
 5. Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
 com o valor da soma dos elementos de mesmo índice.
 *******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matrizsoma = new int[2][2];
        int[][] matriz=new int[2][2];


        System.out.println("Digite os numeros da matriz: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        int[][] matriz2= new int[2][2];


        System.out.println("Digite os numeros da outra matriz: ");
        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = ler.nextInt();
            }
        }

      for(int i = 0; i < matriz2.length; i++){
          for(int j = 0; j < matriz2.length; j++){
              matrizsoma[i][j] = matriz[i][j] + matriz2[i][j];
          }
      }
        System.out.println("soma das matrizes: ");
        for(int i = 0; i < matrizsoma.length; i++) {
            for (int j = 0; j < matrizsoma.length; j++) {
                System.out.println(matrizsoma[i][j]+"");
            }
        }

    }
}
