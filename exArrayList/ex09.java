import java.util.Scanner;
import java.util.ArrayList;

public class ex09 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String word;

        for (int i = 0; i < 10; i++) {
            System.out.println("insira a palavra:");
            word = read.nextLine().toLowerCase();
            palavras.add(word);
        }

        palavras.removeIf(numero -> numero.length() < 4 );

        System.out.println("lista de palavras:");
        System.out.println(palavras);



    }
}