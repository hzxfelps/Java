/******************************************************************************
 ex37
 Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
*******************************************************************************/
import java.util.Scanner;

public class ex37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero de cavalos no haras: ");
        int horse = scanner.nextInt();
        
        int fncssary = horse * 4;
        
        System.out.println("O número total de ferraduras necessárias é: " + fncssary);
    }
}
