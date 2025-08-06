import java.util.Scanner;
import java.util.ArrayList;

public class ex02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*Crie um programa que leia 5 nomes do teclado e os armazene em um ArrayList.
        Depois, imprima todos os nomes em ordem inversa.*/

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.println("Adicione o "+(i+1)+"° Nome.");
            String name = read.nextLine();
            names.add(name);
        }
        System.out.println("Lista com nomes (Ao contrário):");
        for (int i = names.size() - 1; i >= 0; i--){
            System.out.println(names.get(i));
        }
    }
}