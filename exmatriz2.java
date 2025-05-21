/******************************************************************************

2) Faça um programa que leia uma matriz 3x4 de inteiros
, substitua seus elementos negativos por 0 e imprima a matriz original e a modificada.


*******************************************************************************/
import java.util.Scanner;
public class exmatriz2
{
public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int [][] matrizoriginal = new int[3][4];
int [][] matrizmod = new int [3][4];

for(int i = 0; i < matrizoriginal.length; i++){
   for(int j = 0; j < matrizoriginal[i].length; j++){
   System.out.println(" linha: "+ i + " coluna: "+ j);
   matrizoriginal[i][j] = ler.nextInt();
   
}
}



for(int i = 0; i < matrizoriginal.length; i++){
for(int j = 0; j < matrizoriginal[i].length; j++){
 matrizmod[i][j] = matrizoriginal[i][j];
}
}


for(int i = 0; i < matrizmod.length; i++){
for(int j = 0; j < matrizmod[i].length; j++){
if(matrizmod[i][j] < 0){
   matrizmod[i][j] = 0;
}
}
}

for(int i = 0; i < matrizoriginal.length; i++){
for(int j = 0; j < matrizoriginal[i].length; j++){
 System.out.println("Matriz original:\n"+matrizoriginal[i][j]);
 System.out.println("Matriz modificada:\n"+matrizmod[i][j]);
}
}


}
}