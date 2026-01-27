import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = read.nextInt();

        int num1 = num * 2;

        System.out.println("O dobro do número:("+num+") é igual a: "+num1);
    }
}