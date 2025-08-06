import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class ex06 {
    /*Elabore um programa que adicione 10 números aleatórios (entre 1 e 100) em um ArrayList
     Em seguida, ordene os números em ordem crescente e imprima o resultado.*/
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i<10; i++) {
            int numeroAleatorio = random.nextInt(100);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Números aleatórios de 1 a 100 (desordenado):");
        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println("Números aleatórios de 1 a 100 (crescente):");
        System.out.println(numeros);


    }
}