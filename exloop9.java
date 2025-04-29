/** 
9.   
Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.
***/
import java.util.Scanner;

public class exloop9    {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int [] num = new int [20];
        int higherthan10 = 0;

        for (int i = 0; i < num.length; i++){
            System.out.print("Insira o "+ (i+1)+"° número: ");
            num[i] = ler.nextInt();

            if (num[i] > 10){
                higherthan10++;
            }

        }

        System.out.print("A quantidade de números maiores que 10 é igual a: "+ higherthan10);
    }
}