import java.util.Scanner;
public class matriz2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("Elemento [" + i + "]["+j+"]");
                System.out.println("Entre com um número inteiro qualquer:");
                mat[i][j] = scan.nextInt();

                soma1 += mat[0][0];
                soma2 += mat[1][0];
                soma3 += mat[2][0];
                
                }
            }
        
        
        System.out.println("A soma das colunas é igual a?");
        System.out.println("Soma 1 : " + soma1);
        System.out.println("Soma 2 : " + soma2);
        System.out.println("Soma 3 : " + soma3);
        

            }
        }