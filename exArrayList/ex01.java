import java.util.Scanner;
import java.util.ArrayList;

public class ex01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*Elabore um programa que receba uma lista de inteiros e adicione os números de 1 a 10.
         Em seguida, percorra a lista e imprima cada elemento multiplicado por 2.*/

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            System.out.println("Adicione o "+(i+1)+"° Número.");
            int numerousuario = read.nextInt();
            numbers.add(numerousuario);
        }
        System.out.println("Lista com números:");
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++){
            int numbersmultipertwo = numbers.get(i);
            numbers.set(i, numbersmultipertwo * 2);
        }

        System.out.println("Lista Atualizada (Multiplicado por 2)");
        System.out.println(numbers);
    }
}