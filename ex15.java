/******************************************************************************

exercicio 15 github
 Escreva um programa que calcule a soma dos números de 1 a 15.

*******************************************************************************/
public class ex15 {

    public static void main(String[] args) {
        int soma = 0;
         for (int i = 1; i <= 15; i++) {
            soma += i; // Adiciona o valor de i à variável soma
           System.out.println("A soma dos numeros de 1 a 15: " + soma);
       }
    }
}