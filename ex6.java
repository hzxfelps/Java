/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class ex6{
public static void main (String[] args) {
    int a, par, impar, resto;
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite um numero");
    a = ler.nextInt();
    resto = a % 2;
    if (resto == 0){
        System.out.println("O numero é par");
    } else
        System.out.println("O numero é impar");
    
    
}
}