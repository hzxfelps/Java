import java.util.Scanner;
public class matriz5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] mat = new int [3][3];
        int[][] transposta = new int[3][3];
        int[][] soma = new int [3][3];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Elemento [" + i + "]["+j+"]");
                System.out.println("Entre com um número inteiro qualquer:");
                mat [i][j]= scan.nextInt();
                transposta[j][i] = mat[i][j];
            }
        }

        System.out.println("Matriz Padrão");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
            }  System.out.println();
        }



        System.out.println();
        System.out.println();

        System.out.println("Matriz transposta:");
            for (int i = 0; i < transposta.length; i++) {
                for (int j = 0; j < transposta[i].length; j++) {
                    System.out.print(transposta[i][j] + " ");
                }
                System.out.println();
            }

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
            soma[i][j] = (mat[i][j] + transposta[i][j]);


            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Soma das Matrizes:");
        for(int i = 0; i < soma.length; i++){
            for(int j = 0; j < soma[i].length; j++) {
                    System.out.print(soma[i][j] + " ");
            }  System.out.println();
        }


        }
    }