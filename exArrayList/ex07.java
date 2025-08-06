import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class ex07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*Desenvolva um programa que leia vários números do teclado até que o usuário digite -1.
        Armazene os valores em um ArrayList e, ao final, exiba o maior e o menor número da lista.*/

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Insira os números inteiros (Insira -1 para encerrar o programa)");

        while ( true ){
            int n1 = read.nextInt();

            if (n1 == -1){
                break;
            }
            numbers.add(n1);
        }

        System.out.println("Lista de números");
        System.out.println(numbers);

        double nummin = Collections.min(numbers);
        double nummax = Collections.max(numbers);

        System.out.println("O menor valor da lista é: "+nummin);
        System.out.println("O maior valor da lista é: "+nummax);
    }
}