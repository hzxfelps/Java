/******************************************************************************

exercicio 17 github
 Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

*******************************************************************************/
import java.util.Scanner; 

public class ex17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int soma = 0;

        // Loop para ler 10 números do usuário
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: "); //adiciona um a cada numeração
            int numero = ler.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos numeros inseridos é igual a: " + soma);
    }
}
