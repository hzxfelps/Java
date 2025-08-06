import java.util.Scanner;
import java.util.ArrayList;

public class ex05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayList<String> palavras = new ArrayList<>();
        String frase;

        System.out.println("Insira a frase: ");
        frase = read.nextLine();

        String[] palavrasArray = frase.split(" ");
        for (String word : palavrasArray) {
            palavras.add(word);
        }

        System.out.println("A frase contém " + palavras.size() + " palavras.");

        System.out.println("Palavras que começam com a letra 'A':");
        for (String palavra : palavras) {
            if (palavra.toLowerCase().startsWith("a")) {
                System.out.println(palavra);
            }
        }

    }
}
