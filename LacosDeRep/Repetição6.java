package Exercicios.LacosDeRep;

import java.util.Scanner;

public class Repeti��o6 {
	public static void main(String args[])
	{
		int n,media,contN=0,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um n�mero do teclado: ");
		n = leia.nextInt();
		
		do
		{
			if(n < 0 || n > 9)
			{
				System.out.println("\nValor inv�lido.");
			}
			else if(n%3 == 0)
			{
				soma+= n;
				contN++;
			}
			

			System.out.println("\nEscreva um n�mero do teclado: ");
			n = leia.nextInt();
			
		}while(n!=0);
		media = soma/contN;
		System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 � : "+media+".");
	}

}
