/******************************************************************************

3) Faça um programa que leia uma matriz [5,5]de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.

*******************************************************************************/
import java.util.Scanner;
public class exmatriz3
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
    int [][] matriz = new int[5][5];
   
    
    
    for(int i = 0; i < matriz.length; i++){
     for(int j = 0; j < matriz[i].length; j++){
         System.out.println("linha: " + i + " Coluna: " + j);
          matriz[i][j] = ler.nextInt();
    }
    }
    
    boolean Nrepetidos = false;
    for(int i1 = 0; i1 < 5; i1++){
        for(int j1 = 0; j1 < 5; j1++){
            for(int i2 = 0; i2 < 5; i2++){
                for(int j2 = 0; j2 < 5; j2++){
                    if((i1 != i2 || j1 != j2) && matriz[i1][j1] == matriz[i2][j2]){
                        System.out.print("Elementos duplicados: " + matriz[i1][j1]);
                        Nrepetidos = true;
                    }
                }
            }
        }
    }
     if(Nrepetidos == false){
    System.out.println("Sem elementos duplicados.");
}
    
    
    System.out.println("Matriz:");
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
            System.out.println(matriz[i][j]+"");
        }
    }
    
    
    
    
    
	}
}