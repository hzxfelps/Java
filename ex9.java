/******************************************************************************

Github
Ex09
*******************************************************************************/
import java.util.Scanner;
public class ex9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int HE, ME, HS, MS, n1, n2, taxaextra;
        System.out.print("Qual era a hora durante a entrada? ");
        HE = ler.nextInt();
       
        System.out.print("Qual a minutagem inicial? ");
        ME = ler.nextInt();
       
        System.out.print("Qual o horario de saida? ");
        HS = ler.nextInt();
       
        System.out.print("Qual a minutagem final? ");
        MS = ler.nextInt();
       
        n1 = HS - HE;
       
        n2 = MS - ME;
       
        taxaextra = (n1 - 2) + 6;
       
        if ( n1 < 1 && n2 <= 59){
           System.out.println("O preco cobrado devido a permanencia de "+ n1 +" Hora e "+ n2 +" Minutos sera de: R$4,00");
        }
        else if ( n1 == 2 && n2 <= 59){
            System.out.println("O preco cobrado devido a permanencia de"+ n1 +" Hora e "+ n2 +" Minutos sera de: R$6,00");
        }
        else if ( n1 == 1 && n2 <= 59){
            System.out.println("O preco cobrado devido a permanencia de"+ n1 +" Hora e "+ n2 +" Minutos sera de: R$6,00");
        }
        else{
            System.out.println("O preco cobrado devido a permanencia de"+ n1 +" Hora e "+ n2 +" Minutos sera de: R$"+ taxaextra);
        }
     
    }
}