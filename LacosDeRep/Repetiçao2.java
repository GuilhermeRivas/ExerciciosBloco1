package Exercicios.LacosDeRep;

import java.util.Scanner;

public class Repetiçao2 {
	public static void main(String args[])
	{
		int impares= 0,pares= 0,x,n;
		
		Scanner leia = new Scanner(System.in);
		for(x=0;x<10;x++)
		{
		System.out.println("\nDigite um número: ");
		n = leia.nextInt();
				if(n%2==0)
				{
					pares++;
				}
				else
				{
					impares++;
				}
		}
		System.out.println("\nO total de números pares é: "+pares+", e o total de números ímpares é: "+impares+".");
	}

}
