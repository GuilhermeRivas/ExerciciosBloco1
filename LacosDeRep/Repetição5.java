package Exercicios.LacosDeRep;

import java.util.Scanner;

public class Repeti��o5 {
	public static void main(String args[])
	{
		int x,contN=0,n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um n�mero do teclado: ");
		n = leia.nextInt();
		
		do
		{
			if(n < 0 || n > 9)
			{
				System.out.println("\nValor inv�lido.");
			}
			else if(n!=0)
			{
				contN+= n;
			}
			else
			{
				System.out.println("\nOpera��o encerrada.");

			}

			System.out.println("\nEscreva um n�mero do teclado: ");
			n = leia.nextInt();
			
		}while(n!=0);
		
		System.out.println("\nA soma dos n�meros digitados � :"+contN+".");
	}
	}


