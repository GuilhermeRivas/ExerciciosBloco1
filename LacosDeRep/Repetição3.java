package Exercicios.LacosDeRep;

import java.util.Scanner;

public class Repetição3 {
	public static void main(String args[])
	{
		int idade,totalV=0,totalC=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade < 21)
			{
				totalV++;
				System.out.println("\nEscreva sua idade: ");
				idade = leia.nextInt();
			}
			else if(idade > 50)
			{
				totalC++;
				System.out.println("\nEscreva sua idade: ");
				idade = leia.nextInt();
			}
			else
			{
			System.out.println("\nEscreva sua idade: ");
			idade = leia.nextInt();
		}
		
	}
		System.out.println("\nO total de pessoas com menos de 21 anos é :"+totalV+".");
		System.out.println("\nO total de pessoas com mais de 50 anos é :"+totalC+".");
	}
}
