/******************************************************************************

exercicio 18 github
  Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.

*******************************************************************************/
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int soma = 0, pmaior18 = 0, pmenor18 = 0; //variavel e valor declarado ( é igual a 0 pois ele vai cntar de acordo com o loop)

        for(int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: "); 
            int idade = ler.nextInt();
            soma += idade; 
            
            if (idade >= 18) {
                pmaior18++; //se idade for maior que 18 vai somar adicionando a cada numero que seja maior que ele ou igual
            } else {
                pmenor18++; 
            }
        }

        double media = (double) soma / 20; //(double) converte variavel soma de int para double

        
        System.out.println("\nA soma das idades inseridas é: " + soma);
        System.out.println("A média das idades inseridas é: " + media);
        System.out.println("A quantidade de pessoas maiores de idade é: " + pmaior18);
        System.out.println("A quantidade de pessoas menores de idade é: " + pmenor18);

    }
}
