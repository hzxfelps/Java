import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = read.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O número inserido é par.");
        } else {
            System.out.println("O número inserido é impar.");
        }
    }
}