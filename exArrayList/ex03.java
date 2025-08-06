import java.util.Scanner;
import java.util.ArrayList;

public class ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*Escreva um programa que preencha um ArrayList com os 20 primeiros números pares.
        Em seguida, remova todos os elementos divisíveis por 4.*/

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 40; i++){
            if ( i % 2 == 0){
                numbers.add(i);
            }
        }
        System.out.println("Lista com números pares:");
        System.out.println(numbers);

        numbers.removeIf( num -> num % 4 == 0);
        System.out.println("Lista Atualizada (Sem elementos divisíveis por 4)");
        System.out.println(numbers);
    }
}