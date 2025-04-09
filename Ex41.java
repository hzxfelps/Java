/********************************************************************************************************* *
ex41
O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.

******************************************************************************************************************/

import java.util.Scanner;
public class ex41 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double priceperkg = 12.00;
        
        System.out.println("Insira o peso do prato montado (KG): ");
        double weight = ler.nextDouble();
        
        double value = (weight - 1.00) * priceperkg;
        
        System.out.println("O total a pagar pelo prato de "+weight"KG é de: R$"+value);
    }
}