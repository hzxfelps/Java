/** 
Leia a idade de cinco pessoas e exiba a soma e a média das idades. 
***/
import java.util.Scanner;

public class exloop8    {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int [] yo = new int [5];
        int addyo = 0;
        int avrg = 0;

        for (int i = 0; i < yo.length; i++){
            System.out.print("Insira a idade da "+ (i+1)+"° idade: ");
            yo[i] = ler.nextInt();

            addyo += yo[i];

        }

        avrg = addyo / yo.length;

        System.out.print("A soma das idades é igual a: "+ addyo+".\nA média das idades é igual a: "+ avrg);
    }
}