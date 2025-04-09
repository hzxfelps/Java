/******************************************************************************
ex40
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
*******************************************************************************/
import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double total;
        double price;
        double value;

        System.out.println("Qual o preço do litro da gasolina?");
        price = ler.nextDouble();

        System.out.println("Qual o valor desejado para abastecer?");
        value = ler.nextInt();

        total = value / price;

        System.out.println("Você conseguiu colocar " + total + " litros de gasolina.");
    }
}
