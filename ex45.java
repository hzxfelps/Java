/******************************************************************************
ex45
A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 
*******************************************************************************/
import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int option = 0, amountsandwich, amountcheese, amountham, amountmeat, x = 1000;

        System.out.println("Insira a quantidade de sanduíches a serem feitos:");
        amountsandwich = ler.nextInt();

        while (option != 5){

            System.out.println("\nEntre com uma opção: \n1)Quantidade necessária de Queijo;\n2)Quantidade necessária de Presunto;\n3)Quantidade necessária de Carne;\n4) Sair.");
            option = ler.nextInt();
            switch(option) {
                case 1:
                    amountcheese = 50*amountsandwich;
                    if(amountcheese >= x) {
                        x = amountcheese / 1000;
                        amountcheese = x;
                        System.out.println("\nPara preparar " + amountsandwich + " sanduíches serão necessários " + amountcheese + "KG's de queijo.");
                    } else
                        System.out.println("\nPara preparar " + amountsandwich + " sanduíches serão necessários " + amountcheese + " Gramas de queijo.");
                    break;

                case 2:
                    amountham = 50*amountsandwich;
                    if(amountham >= x) {
                        x = amountham / 1000;
                        amountham = x;
                        System.out.println("\nPara preparar " + amountsandwich + " sanduíches serão necessários " + amountham + "KG's de presunto.");
                    } else
                        System.out.println("\nPara preparar " + amountsandwich + " sanduíches serão necessários " + amountham + " Gramas de presunto.");
                    break;

                case 3:
                    amountmeat = 100*amountsandwich;
                    if(amountmeat >= x) {
                        x = amountmeat / 1000;
                        amountmeat = x;
                        System.out.println("\nPara preparar " + amountsandwich + " sanduíches serão necessários " + amountmeat + "KG's de carne.");
                    } else
                        System.out.println("\nPara preparar " + amountsandwich + " sanduíches serão necessários " + amountmeat + " Gramas de carne.");
                    break;

                case 4:
                    System.out.println("\nSaindo do programa....");
                    break;
                default:
                    System.out.println("\nNúmero inserido inválido! Escolha somente de 1 a 4.");
                    break;
            }
        }
    }
}
