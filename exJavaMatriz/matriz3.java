import java.util.Scanner;
public class matriz3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int indexmax = 0;
        int indexmin = 100000;


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int min = mat[i][j];
                System.out.println("Elemento [" + i + "][" + j + "]");
                System.out.println("Entre com um número inteiro qualquer:");
                mat[i][j] = scan.nextInt();

                if (mat[i][j] >= indexmax) {
                    indexmax = mat[i][j];
                }
                if (mat[i][j] <= indexmin) {
                    indexmin = mat[i][j];

                }
            }
        }
            System.out.println("Maior número: " + indexmax);
            System.out.println("Menor número: " + indexmin);
        }
    }