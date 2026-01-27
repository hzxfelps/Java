import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira a sua idade: ");
        int num1 = read.nextInt();

        if (num1 >= 18) {
            System.out.println("Você é maior de idade!");
        }else {
            System.out.println("Você é menor de idade.");
        }
    }
}