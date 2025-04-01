/******************************************************************************

exercicio 16 github
 Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

*******************************************************************************/
import java.util.Scanner;
public class ex16 {

    public static void main(String[] args) {
        int soma = 0;
        String nome;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o nome do usuario: ");
        nome = ler.nextLine();
         
         for (int i = 1; i <= 10; i++) {
            
           System.out.println("O nome do usuario é: " + nome);
       }
    }
}