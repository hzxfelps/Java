
import java.util.Scanner;
public class matriz1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] mat = new int[5][5];
        int contagempar = 0;



        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("Elemento [" + i + "]["+j+"]");
                System.out.println("Entre com um número inteiro qualquer:");
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 0) {
                    contagempar++;
                    System.out.print(mat[i][j] + " ");
                        }
                    }  System.out.println();
                }

        System.out.println("A quantidade de números pares inseridos é:");
        System.out.println(contagempar);

            }
        }
