/******************************************************************************
ex 39
Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
DIAS

*******************************************************************************/
import java.util.Scanner;

public class ex39 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
int age, days;
String name;

System.out.println("Insira seu nome: ");
name = ler.nextLine();
              
System.out.println("Insira sua idade: ");
age = ler.nextInt();
               
days = age * 365;
                
System.out.println("O usuário "+ name +" de "+age+" anos de idade viveu "+ days +" dias até o dia atual.");
    } 
}