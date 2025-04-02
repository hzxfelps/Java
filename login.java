/******************************************************************************

8) Desenvolva um programa em Java que simule um sistema de login simples para uma conta corrente. 
O programa deve:Solicitar ao usuário que insira um nome de usuário e senha.Comparar o nome de usuário
e senha inseridos com um nome de usuário e senha predefinidos.Permitir que o usuário tente fazer login no 
máximo 3 vezes.Exibir uma mensagem de sucesso se o login for bem-sucedido ou uma mensagem de erro se o login falhar após 3 tentativas.

*******************************************************************************/
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String login;
        String password;
        int tentativas = 0;
        String usuarioCorreto = "matheusinreidelas";
        String senhaCorreta = "CarlosSalgados12";

        System.out.println("Bem-vindo! Insira o login e a senha para utilizar o sistema.");
        
        for (tentativas = 0; tentativas < 3; tentativas++) {
            System.out.print("Login: ");
            login = ler.nextLine();
            System.out.print("Senha: ");
            password = ler.nextLine();

            if (login.equals(usuarioCorreto) && password.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");
                break; 
            } else {
                if (tentativas < 2) {
                    System.out.println("Login ou senha incorretos. Tente novamente!");
                }
            }
        }

        if (tentativas == 3) {
            System.out.println("Número máximo de tentativas atingido. Tente novamente mais tarde.");
        }

    }
}
