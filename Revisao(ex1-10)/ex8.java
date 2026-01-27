import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Insira o "+i+"° Número: ");
            int num1 = read.nextInt();
            num += num1;
        }
         System.out.println("A média dos números inseridos é: "+num/5);
    }
}