/******************************************************************************

exercicio 19 github
  Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

*******************************************************************************/
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        
        String nmn = "";
        int imn = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++){
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String name = ler.nextLine();
            
            System.out.print("Digite a idade de " + name + ": ");
            int age = ler.nextInt();
            ler.nextLine();
            
            if ( age < imn ) {
                imn = age;
                nmn = name;
            }
        }
        
        System.out.println("\nA pessoa mais nova é: " + nmn + " com " + imn + " anos.");

    }
}
