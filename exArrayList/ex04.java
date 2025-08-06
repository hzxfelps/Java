import java.util.Scanner;
import java.util.ArrayList;

public class ex04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*Implemente um programa que armazene notas de alunos em um ArrayList de Double.
        Depois, calcule e exiba a média das notas e quantas notas estão acima da média.*/

        ArrayList<Double> listanotas = new ArrayList<>();
        ArrayList<Double> notasacimadamedia = new ArrayList<>();
        int n1;
        double notasacumuladas = 0;

        System.out.println("Insira a quantidade de notas a serem inseridas:");
        n1 = read.nextInt();

        // Coleta as notas
        for (int i = 0; i < n1; i++) {
            System.out.println("Adicione a " + (i + 1) + "° nota.");
            Double nota = read.nextDouble();
            listanotas.add(nota);
        }
        for (int i = 0; i < n1; i++) {
            double num = listanotas.get(i);
            notasacumuladas += num;
        }

        double media = notasacumuladas / n1;
        for (int i = 0; i < n1; i++) {
            double num = listanotas.get(i);
            if (num > media) {
                notasacimadamedia.add(num);
            }
        }
        System.out.println("Média: " + media);
        System.out.println("Quantidade de notas acima da média: " + notasacimadamedia.size());
    }
}
