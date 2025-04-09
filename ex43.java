/******************************************************************************

ex43
Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

*******************************************************************************/
import java.util.Scanner;

public class ex43 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
double rmnrt;
double increase;
double taxation;
double rmnrt1;
double rmnrt2;
System.out.println("Insira o valor do salário do funcionário: R$");
rmnrt = ler.nextDouble();
            
increase = rmnrt*15/100;
rmnrt1 = increase + rmnrt;
taxation = rmnrt1*8/100;
rmnrt2 = rmnrt1-taxation;

System.out.println("\nSeu salário inicial: R$" + rmnrt + "\nAumento de 15%: R$" + increase + "\nSalário com o aumento: R$" + rmnrt1 + "\nImposto cobrado de 8%: R$" + taxation + "\nSalario com imposto descontado: R$" + rmnrt2);
    } 
}