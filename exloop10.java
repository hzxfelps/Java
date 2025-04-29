/** 
10.  Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos estão entre 0 e 100.
***/
import java.util.Scanner;

public class exloop10    {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int [] num = new int [10];
        int beetween0to100 = 0;

        for (int i = 0; i < num.length; i++){
            System.out.print("Insira o "+ (i+1)+"° número: ");
            num[i] = ler.nextInt();

            if (num[i] > 0 && num[i] <= 100){
                beetween0to100++;
            }

        }

        System.out.print("A quantidade de números entre 0 e 100 é igual a: "+ beetween0to100);
    }
}