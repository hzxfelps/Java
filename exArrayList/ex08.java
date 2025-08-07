import java.util.Scanner;
import java.util.ArrayList;

public class ex08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /* Crie um programa que leia nomes de produtos e seus respectivos preços.
           Armazene os nomes em um ArrayList<String> e os preços em um ArrayList<Double>.
           Depois, exiba todos os produtos com preços superiores a R$ 50,00. */

        ArrayList<Double> value = new ArrayList<>();
        ArrayList<String> product = new ArrayList<>();
        ArrayList<String> productmorethan50 = new ArrayList<>();

        System.out.println("Insira os produtos e seus respectivos preços (Insira -1 para encerrar o programa)");

        while (true) {
            System.out.print("Produto: ");
            String p1 = read.nextLine();
            if (p1.equals("-1")) {
                break;
            }

            System.out.print("Preço: ");
            double n2 = read.nextDouble();
            read.nextLine();

            product.add(p1);
            value.add(n2);

            if (n2 > 50) {
                productmorethan50.add(p1);
            }
        }

        System.out.println("\nProdutos com valor maior que R$ 50,00:");
        //SE NAO estiver vazia (a lista de produtos que custam mais de 50) ele retorna como true e vai para o for, se estiver vai para o else
        if (!productmorethan50.isEmpty()) {
            for (String prod : productmorethan50) {
                System.out.println(prod);
            }
        } else {
            System.out.println("Nenhum produto com preço superior a R$ 50,00.");
        }

        read.close();
    }
}

