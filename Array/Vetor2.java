package HelloWorld;

import java.util.Scanner;

public class Vetor2 {
	public static void main(String args[])
	{
		
		int [] num = new int [6];
		int [] impares = new int [6];
		int x,pares=0,somaP=0,qImpares=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInsira um valor inteiro: ");
			num[x]= leia.nextInt();
			
			if(num[x]%2 == 0)
			{
				pares++;
				somaP+= num[x];
			}
			qImpares++;
			}
		
		System.out.println("\nA quantidade de numeros pares é: "+pares+".");
		System.out.println("\nO a soma dos numeros pares é: "+somaP+".");
		System.out.println("\nO numeros impares são: ");
		for(x=0;x<6;x++)
		{
			if(num[x]%2 == 1)
				System.out.println(num[x]);
				
		}
		System.out.println("\nA quantidade de números impares é: "+qImpares+".");
		
		
	}

}
