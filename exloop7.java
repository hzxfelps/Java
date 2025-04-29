/** 
7.    
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
informado pelo usuário, utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.
Ex:
Base: 2
Expoente:7 
Resultado:128

Base: 5
Expoente:3 
Resultado:125
***/
import java.util.Scanner;

public class exloop7    {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int num;
        int exp;
        int result = 1;

        System.out.print("Insira o número (base): ");
        num = ler.nextInt();

        System.out.print("\nInsira o expoente desejado: ");
        exp = ler.nextInt();

        for (int i = 0; i < exp; i++){
            result *= num;
        }

        System.out.print("Base: "+num+"\nExpoente: "+exp+"\nResultado: "+result);
    }
}