package Exercicios.LacosDeDecisao;

import java.util.Scanner;

public class Laços4 {
	public static void main(String args[])
	{
		double num,res;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um número inteiro qualquer: ");
		num = leia.nextDouble();
		
		if(num%2 == 0)
		{
			res = Math.sqrt(num);
			System.out.println("\nO número indicado é par, e a raiz quadrada do número é: "+res+".");
		}
		else
		{
			res= Math.pow(num, 2);
			System.out.println("\nO número indicado é ímpar, e ele elevado ao quadrado vale: "+res+".");
		}
	}

}
