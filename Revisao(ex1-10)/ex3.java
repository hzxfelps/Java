import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int num1 = read.nextInt();

        System.out.println("Insira o segundo número: ");
        int num2 = read.nextInt();

        int soma  = num1 + num2;
        System.out.println("A soma dos números inseridos é: "+soma);


    }
}