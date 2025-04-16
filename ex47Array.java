/******************************************************************************
ex47array
 Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.

*******************************************************************************/
import java.util.Scanner;
public class ex47 {
    public static void main(String[] args) {
        int[] ufc = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < ufc.length; i++) {
            System.out.println("Insira um número inteiro qualquer:");
            ufc[i] = scan.nextInt();


        }
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(ufc[i] + " ");


        }
    }
}