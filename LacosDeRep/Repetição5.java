package Exercicios.LacosDeRep;

import java.util.Scanner;

public class Repetição5 {
	public static void main(String args[])
	{
		int x,contN=0,n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um número do teclado: ");
		n = leia.nextInt();
		
		do
		{
			if(n < 0 || n > 9)
			{
				System.out.println("\nValor inválido.");
			}
			else if(n!=0)
			{
				contN+= n;
			}
			else
			{
				System.out.println("\nOperação encerrada.");

			}

			System.out.println("\nEscreva um número do teclado: ");
			n = leia.nextInt();
			
		}while(n!=0);
		
		System.out.println("\nA soma dos números digitados é :"+contN+".");
	}
	}


