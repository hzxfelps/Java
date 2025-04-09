/******************************************************************************
ex36
 Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair
  * A cada ação favor montar o menu novamente.
login do usuario
 menu das 4 opções
 em deposito
 valor do deposito
 avisar sobre a taxa
 calcular a taxa sobre o valor que o cliente quer depositar
 deposito feito
 em saque
 mostrar quanto dinheiro pessoa tem em conta
 quanto gostaria de sacar
 saque feito
 em saldo
 qual o saldo da conta
 mostrar saldo da conta
 em sair
 login desfeito
*******************************************************************************/
import java.util.Scanner;
public class ex36 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String login;
        String password;
        int tentativas = 0;
        String usuarioCorreto = "matheusinreidelas";
        String senhaCorreta = "CarlosSalgados12";
        String option;
        double valordep;
        double valorsaq;
        double contabancaria;
        int saircont;

        contabancaria = 1518;  

        do {

            System.out.println("Bem-vindo! Insira o login e a senha para utilizar o sistema bancario.");
            System.out.print("Login: ");
            login = ler.nextLine();
            System.out.print("Senha: ");
            password = ler.nextLine();

            if (login.equals(usuarioCorreto) && password.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");

                do {
                    System.out.println("Qual opção o usuário gostaria de acessar?\na) Depósito bancário\nb) Saque\nc) Saldo\nd) Sair");
                    option = ler.nextLine().toLowerCase();

                    if (option.equals("a")) {
                        System.out.println("Qual valor será depositado?");
                        valordep = ler.nextDouble();
                        System.out.println("O valor de R$" + valordep + " foi depositado com sucesso.");
                        contabancaria += valordep;

                    } else if (option.equals("b")) {
                        System.out.println("Qual o valor do saque?");
                        valorsaq = ler.nextDouble();

                        while (valorsaq <= contabancaria) {
                            System.out.println("O valor de R$" + valorsaq + " foi sacado com sucesso.");
                            contabancaria -= valorsaq;
                            break;  
                        }
                        if (valorsaq > contabancaria) {
                            System.out.println("O saldo bancário é insuficiente para sacar a quantia desejada.");
                        }

                    } else if (option.equals("c")) {
                        System.out.println("O saldo presente em sua conta é de R$" + contabancaria);

                    } else if (option.equals("d")) {
                        System.out.println("O usuário deseja sair da conta?\n1) Sim\n2) Não");
                        saircont = ler.nextInt();

                        if (saircont == 1) {  
                            System.out.println("Login desfeito.");
                            break;  
                        } else if (saircont == 2) {  
                            System.out.println("Voltando para a interface.");
                        } else {
                            System.out.println("Opção incorreta!");
                        }
                    } else {
                        System.out.println("Opção incorreta! Insira uma opção válida.");
                    }

                } while (!option.equals("d"));
            } else {
                if (tentativas < 2) {
                    System.out.println("Login ou senha incorretos. Tente novamente!");
                }
            }

            tentativas++;
        } while (tentativas < 3);

        if (tentativas == 3) {
            System.out.println("Número máximo de tentativas atingido. Tente novamente mais tarde.");
        }
    }
}
