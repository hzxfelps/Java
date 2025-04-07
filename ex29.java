//29. Escreva um programa que pergunte ao usuário quantos alunos ele tem em sua academia. Em seguida, através de um laço while, o usuário digita o peso de todos os alunos, um por vez, e por fim, o programa deve mostrar a média de peso dos clientes.

import java.util.Scanner;

public class ex29 {
 public static void main (String[] args) {
     Scanner ler = new Scanner(System.in);

     int numstudent, pesostudent, mediapeso = 0, pesototal = 0;

     //QNTS ALUNOS
     System.out.println("Qual o numero de alunos cadastrados na academia?");
     numstudent = ler.nextInt();

     int numppls = 1;

     //peso um por um
     while ( numppls <= numstudent) {
     System.out.println("Qual o peso do " + numppls +"° aluno(a)?");
     pesostudent = ler.nextInt();

    pesototal += pesostudent;
    numppls++;
     }

     mediapeso = pesototal / numstudent;
     System.out.println("A média do peso dos alunos é de: " + mediapeso);

}
}



