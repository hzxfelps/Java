/******************************************************************************
2 - Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100)
.O programa gera um número aleatório(pesquisar) e o jogador tem 5 tentativas para acertar. A cada erro, o programa dá dicas: "maior" ou "menor".
*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class desafio2{
    
public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   Random gerador = new Random();
   int dificult;
   int easymode;
   int trys = 0;
   int rightnumeasy = gerador.nextInt(10) + 1;
   int rightnummed = gerador.nextInt(50) + 1;
   int rightnumhard = gerador.nextInt(100) + 1;
   
System.out.println("Bem-vindo ao jogo da adivinhação! antes de tudo, por favor selecione a dificuldade: \n 1) fácil: 1 a 10, 2) médio: 1 a 50, 3) difícil: 1 a 100 \n selecione a dificuldade:");
dificult = ler.nextInt();
switch(dificult){
  case 1:
  do{
  System.out.println("dificuldade facil selecionada, o jogador tem 5 tentativas para acertar");
  System.out.println("por favor escolha um numero entre 1 a 10: ");
  easymode = ler.nextInt();
  trys++;
  if(easymode == rightnumeasy){
  System.out.println("Parabéns! finalmente acertou uma pra Deus ver.");
  break;
  } else {
      if(easymode < rightnumeasy){
      System.out.println("Você errou...dica: o numero é maior!");
      } else
      System.out.println("Você errou...dica: o numero é menor!");
  }
} while (trys < 5);
System.out.println("Numero de tentativas maximas atingida, o numero correto era: "+ rightnumeasy);
break;

  case 2:
    do{
  System.out.println("dificuldade media selecionada, o jogador tem 5 tentativas para acertar");
  System.out.println("por favor escolha um numero entre 1 a 50: ");
  easymode = ler.nextInt();
  trys++;
  if(easymode == rightnummed){
  System.out.println("Parabéns! finalmente acertou uma pra Deus ver.");
  break;
  } else {
      if(easymode < rightnummed){
      System.out.println("Você errou...dica: o numero é maior!");
      } else
      System.out.println("Você errou...dica: o numero é menor!");
  }
} while (trys < 5);
System.out.println("Numero de tentativas maximas atingida, o numero correto era: "+ rightnummed);
break;

case 3:
    do{
  System.out.println("dificuldade dificil selecionada, o jogador tem 5 tentativas para acertar");
  System.out.println("por favor escolha um numero entre 1 a 100: ");
  easymode = ler.nextInt();
  trys++;
  if(easymode == rightnumhard){
  System.out.println("Parabéns! finalmente acertou uma pra Deus ver.");
  break;
  } else {
      if(easymode < rightnumhard){
      System.out.println("Você errou...dica: o numero é maior!");
      } else
      System.out.println("Você errou...dica: o numero é menor!");
  }
} while (trys < 5);
System.out.println("Numero de tentativas maximas atingida, o numero correto era: "+ rightnumhard);  
break;

}
}
}
