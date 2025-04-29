/****************************************************************************** 
5.   
 Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize while. 
*******************************************************************************/
import java.util.Scanner;

public class exloop5 {
    public static void main(String[] args) {
        int somanumpar = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {    
                somanumpar += i; 
            }
            i++;
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + somanumpar);
    }
}