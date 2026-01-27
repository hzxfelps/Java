import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) throws Exception{
        Scanner read = new Scanner(System.in);

        pessoa pessoa1 = new pessoa();
        pessoa1.nome = "Vinicius";
        pessoa1.idade = 17;

        System.out.println("Nome: "+pessoa1.nome);
        System.out.println("Idade: "+pessoa1.idade);

        System.out.println("Insira uma mensagem: ");
        String msg = read.nextLine();

        pessoa1.mensagem = msg;

        pessoa1.mostrarMensagem();
        System.out.println("\nTestando method mostrar dados: \n");

        pessoa1.mostrarDados();
        pessoa1.mostrarMensagem();
    }
}