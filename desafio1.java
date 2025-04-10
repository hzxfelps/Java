/******************************************************************************
desafio1
Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. O programa deve validar se o voto é válido (1, 2, 3)
e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.

*******************************************************************************/
import java.util.Scanner;

public class desafio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vote;
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        System.out.print("--- Sistema de votação ---\n(Insira 0 para encerrar.)\n");

        do {
            System.out.print("Vote em um candidato ou digite 0 para encerrar.\n1) Gerin Bolsonabo\n2) Luisio Lule\n3) Cinto Gomes\n");
            vote = ler.nextInt();

            if (vote == 1) {
                candidate1++;
            } else if (vote == 2) {
                candidate2++;
            } else if (vote == 3) {
                candidate3++;
            } else if (vote != 0) {
                System.out.print("Voto inválido! Digite o número correspondente ao candidato.\n");
            }

        } while (vote != 0);

        System.out.print("--- Resultado da votação ---\n1) Gerin Bolsonabo = " + candidate1 + " voto(s)\n2) Luisio Lule = " + candidate2 + " voto(s)\n3) Cinto Gomes = " + candidate3 + " voto(s)\n");

        if (candidate1 > candidate2 && candidate1 > candidate3) {
            System.out.print("O candidato vencedor é: Gerin Bolsonabo");
        } else if (candidate2 > candidate1 && candidate2 > candidate3) {
            System.out.print("O candidato vencedor é: Luisio Lule");
        } else if (candidate3 > candidate1 && candidate3 > candidate2) {
            System.out.print("O candidato vencedor é: Cinto Gomes");
        } else {
            System.out.print("A eleição terminou em empate.");
        }
    }
}
