/******************************************************************************

exercicio 1
calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado.

*******************************************************************************/
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double nota1, nota2, soma, media;
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = ler.nextLine();
       
        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextDouble();
       
        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();
       
        soma = nota1 + nota2;
        media = soma / 2;
       
        System.out.println("\nResultado para o aluno " + nomeAluno + ":");
        System.out.println("Média das notas: " + media);
       
        if (media >= 5) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
     
    }
}