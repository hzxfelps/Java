/******************************************************************************
desafio6
Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       
        Usar a biblioteca:
          import java.lang.Math;
          Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
          Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
          *Usar double se resultar em números decimais
*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1;
        double x2;

        System.out.print("Insira o valor de A: ");
        double v1 = scanner.nextDouble();
        System.out.print("Insira o valor de B: ");
        double v2 = scanner.nextDouble();
        System.out.print("Insira o valor de C: ");
        double v3 = scanner.nextDouble();
        
        double Δ = Math.pow(v2, 2) - 4 * v1 * v3;

        if (Δ < 0) {
            System.out.println("A equação de segundo grau não tem raizes.");
        } else if (Δ == 0) {
            double x0 = -v2 / (2 * v1);
            System.out.println("O valor de delta é: " + Δ);
            System.out.println("A equação tem somente uma raiz.");
            System.out.println("x:" + x0);
        } else {
             x1 = (-v2 + Math.sqrt(Δ)) / (2 * v1);
             x2 = (-v2 - Math.sqrt(Δ)) / (2 * v1);
            System.out.println("O valor de delta é:" + Δ);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}