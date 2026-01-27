import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = read.nextInt();

        if (num1 >= 1) {
            System.out.println("O número inserido é positivo.");
        } else if (num1 == 0) {
            System.out.println("O número é nulo.");
        } else {
            System.out.println("O número inserido é negativo.");
        }
    }
}