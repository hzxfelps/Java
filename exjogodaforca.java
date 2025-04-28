/******************************************************************************

1) Desenvolver o jogo da Forca. Favor seguir algumas regras:
    a) Pedir para o jogador 1 digitar a palavra que será adivinhada pelo jogador 2
    b) Digitar o nome do jogador 2 para iniciar o jogo.
    c) A cada letra digitada mostrar a letra certa / errada e um desenho mostrando a perda de uma parte do corpo, se a letra estiver errada.
    d) O jogador 2 terá 5 tentativas de adivinhar a palavra correta.
    e) Se o jogo finalizar, mostrar o nome do jogador 2 e se ele ganhou ou perdeu.

*Spoiler


                        System.out.println("                _____");
                        System.out.println("                |   |");
                        System.out.println("                |  (ツ)");
                        System.out.println("                |  -|-");
                        System.out.println("                |  /'\\");
                        System.out.println("                |   ");
                        System.out.println("             __|__ ");
                        System.out.println ("!!!! GAME OVER !!!");

*******************************************************************************/
import java.util.Scanner;

public class exjogodaforca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tentativas = 5;
        String letrasErradas = "";

        System.out.print("Jogador 1, digite seu nome: ");
        String jogador1 = ler.next();

        System.out.print("Digite a palavra secreta: ");
        String palavra = ler.next().toLowerCase();

        System.out.print("Jogador 2, digite seu nome: ");
        String jogador2 = ler.next();

        StringBuilder palavraAdivinhada = new StringBuilder("_".repeat(palavra.length()));

        System.out.println("\n################ Jogo da Forca ################");
        System.out.println("A palavra tem " + palavra.length() + " letras.");

        while (tentativas > 0 && palavraAdivinhada.toString().contains("_")) {
            System.out.println("\nPalavra: " + palavraAdivinhada);
            System.out.println("Letras erradas: " + letrasErradas);
            System.out.print(jogador2 + ", digite uma letra: ");
            String letra = ler.next().toLowerCase();

            if (letrasErradas.contains(letra) || palavraAdivinhada.toString().contains(letra)) {
                System.out.println("Você já tentou essa letra. Tente outra.");
                continue;
            }

            boolean acertou = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra.charAt(0)) {
                    palavraAdivinhada.setCharAt(i, letra.charAt(0));
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("Você acertou!");
            } else {
                letrasErradas += letra + " ";
                tentativas--;
                System.out.println("Errou! Tentativas restantes: " + tentativas);
            }
        }

        if (palavraAdivinhada.toString().equals(palavra)) {
            System.out.println("\nParabéns, " + jogador2 + "! Você acertou: " + palavra);
        } else {
            System.out.println("\nGame Over! A palavra era: " + palavra);
        }

        
    }
}