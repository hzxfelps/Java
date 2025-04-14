
public class exampleArray
{
	public static void main(String[] args) {
		int [] num = new int[5];
		
		num [0] = 10;
		num [1] = 20;
		num [2] = 30;
		num [3] = 40;
		num [4] = 50;
		
		for ( int i = 0; i<num.length; i++){
		    System.out.println("O "+ (i+1) + "° numero é: "+ num[i]);
		}
	}
}
