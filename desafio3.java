/******************************************************************************
desafio3
Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.

*******************************************************************************/
import java.util.Scanner;

public class desafio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double grade1;
        double grade2 = 0;
        int amountgrades = 0;
        double average;

        System.out.print("--- Cadastro de notas ---\n(Insira -1 para encerrar.)\n");

        do {
            System.out.print("Insira uma nota e/ou insira -1 para encerrar o programa.\nNota: ");
            grade1 = ler.nextInt();
            
            if ( grade1 == -1){
                break;
            }

            amountgrades++;

            if (grade1 >= 9) {
                System.out.print("A nota foi classificada como excelente. ");
            } else if (grade1 >= 7 && grade1 < 9) {
                System.out.print("A nota foi classificada como Boa.");
            } else if (grade1 >= 5 && grade1 < 7 ) {
                System.out.print("A nota foi classificada como Regular. ");
            } else if (grade1 < 5 && grade1 >= 0) {
                System.out.print("A nota foi classificada como Insuficiente. ");
            }
            
            grade2 += grade1;

        } while (grade1 != -1);

        average = (int) grade2 / amountgrades;

        System.out.print("\nSistema encerrado. A média das notas é igual a: " + average);
    }
}
