/******************************************************************************

exercicio 21 github
   Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos 
   (P – Preto, C- Castanho, L – Louro e R-Ruivo) 
   de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 

*******************************************************************************/
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int olhosazuis = 0, olhospretos = 0, olhosverdes = 0, olhoscastanhos = 0;
        int cabelopreto = 0, cabelocastanho = 0, cabelolouro = 0, cabeloruivo = 0;
        int mais50menos60 = 0, somaidadeanoes = 0, qtddeanoes = 0, qtdruivossemazul = 0;
        int totalolhosazuis = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = ler.nextInt();

            System.out.print("Digite o peso da " + i + "ª pessoa: ");
            double peso = ler.nextDouble();

            System.out.print("Digite a altura da " + i + "ª pessoa: ");
            double altura = ler.nextDouble();

            ler.nextLine();

            System.out.print("Digite a cor dos olhos (A – Azul, P - Preto, V - Verde, C - Castanho): ");
            String corolhos = ler.nextLine().toLowerCase();

            System.out.print("Digite a cor do cabelo (P – Preto, C - Castanho, L - Louro, R - Ruivo): ");
            String corcabelo = ler.nextLine().toLowerCase();

            if (idade > 50 && peso < 60) {
                mais50menos60++;
            }

            if (altura < 1.50) {
                somaidadeanoes += idade;
                qtddeanoes++;
            }

            if (corolhos.equals("a")) {
                totalolhosazuis++;
                olhosazuis++;
            } else if (corolhos.equals("p")) {
                olhospretos++;
            } else if (corolhos.equals("v")) {
                olhosverdes++;
            } else if (corolhos.equals("c")) {
                olhoscastanhos++;
            }

            if (corcabelo.equals("r") && !corolhos.equals("a")) {
                qtdruivossemazul++;
            }

            if (corcabelo.equals("p")) {
                cabelopreto++;
            } else if (corcabelo.equals("c")) {
                cabelocastanho++;
            } else if (corcabelo.equals("l")) {
                cabelolouro++;
            } else if (corcabelo.equals("r")) {
                cabeloruivo++;
            }
        }

        double mediaidadebaixos = (qtddeanoes > 0) ? (double) somaidadeanoes / qtddeanoes : 0; //? (if else) se qtddeanoes maior que 0 a media da idade vai ser calculada, se qntd de anoes for 0 a media vai ser 0 ja q n tem
        double porcentolhoazul = (totalolhosazuis > 0) ? (double) totalolhosazuis / 20 * 100 : 0;

        System.out.println("\nResultados:");
        System.out.println("1) Pessoas com mais de 50 anos e menos de 60 kg: " + mais50menos60);
        System.out.printf("2) Média das idades das pessoas com altura < 1,50m: %.2f anos\n", mediaidadebaixos); //%.2f diz que é um numero decimal com ate duas casas
        System.out.printf("3) Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentolhoazul);
        System.out.println("4) Quantidade de pessoas ruivas que não possuem olhos azuis: " + qtdruivossemazul);

        ler.close();
    }
}
