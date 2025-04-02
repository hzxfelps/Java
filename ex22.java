/******************************************************************************

exercicio 22 github
   Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 

*******************************************************************************/
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int totalidade = 0, qntdmasc = 0, qntdfem = 0, totalidademasc = 0, totalidadefem = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("\nDigite a idade da " + i + "ª pessoa: ");
            int age = ler.nextInt();
            
            ler.nextLine();
            
            System.out.print("\nDigite o gênero da " + i + "ª pessoa (Masculino e Feminino): ");
            String gender = ler.nextLine().toLowerCase();
            
            totalidade += age;
            
            if (gender.equals("feminino")) {   
                totalidadefem += age;
                qntdfem++;
            } else if (gender.equals("masculino")) {
                totalidademasc += age;
                qntdmasc++;
            }
            
        }
        
        double idmediatotal = (double) totalidade / 7;
        double idmediafem = qntdfem > 0 ? (double) totalidadefem / qntdfem : 0 ;
        double idmediamasc = qntdmasc > 0 ? (double) totalidademasc / qntdmasc : 0;
        
        System.out.println("\nResultados:");
        System.out.print("\nA media das idades total é de: " + idmediatotal);
	    System.out.print("\nA media feminina é de: " + idmediafem);
		System.out.print("\nA media masculina é de: " + idmediamasc);

        }
    }