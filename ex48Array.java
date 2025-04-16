/******************************************************************************
ex48
 Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.
*******************************************************************************/

import java.util.Scanner;
public class ex48 {
    public static void main(String[] args) {
        int[] kfc = new int[5];
        int ofc = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n.length; i++) {
            System.out.println("Insira um número inteiro qualquer:");
            kfc[i] = scan.nextInt();
        }



        for (int i = 0; i < n.length; i+=2) {
            ofc += kfc[i];

        }

        System.out.println("A soma de todos os valores em posições ímpares é igual a " + ofc + ".");

    }
}