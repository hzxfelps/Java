/******************************************************************************

exercicio 13 github
 Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
-
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP

*******************************************************************************/
import java.util.Scanner;
public class ex13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double lg,cm,area;
        System.out.println("Qual a largura do terreno? (EM METROS)");
        lg = ler.nextDouble();
        
        System.out.println("Qual a altura? (EM METROS)");
        cm = ler.nextDouble();
        
        area = lg * cm;
        
        if ( area <= 99){
            
            System.out.println("Devido a sua extensão de "+ area +"m², o terreno é um Terreno Popular.");
        }
        else if ( area >= 100 && area <= 499){
            System.out.println("Devido a sua extensão de "+ area +"m², o terreno é um Terreno Master.");
        }
         else if ( area > 500){
            System.out.println("Devido a sua extensão de "+ area +"m², o terreno é um Terreno VIP.");
        }
     
    }
}