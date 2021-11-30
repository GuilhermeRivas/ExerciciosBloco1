package Exercicios.LacosDeRep;

import java.util.Scanner;

public class Repetição6 {
	public static void main(String args[])
	{
		int n,media,contN=0,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um número do teclado: ");
		n = leia.nextInt();
		
		do
		{
			if(n < 0 || n > 9)
			{
				System.out.println("\nValor inválido.");
			}
			else if(n%3 == 0)
			{
				soma+= n;
				contN++;
			}
			

			System.out.println("\nEscreva um número do teclado: ");
			n = leia.nextInt();
			
		}while(n!=0);
		media = soma/contN;
		System.out.println("\nA média dos números múltiplos de 3 é : "+media+".");
	}

}
