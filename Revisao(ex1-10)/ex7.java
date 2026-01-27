import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = read.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1+" x "+i+":"+num1 * i);
        }
    }
}