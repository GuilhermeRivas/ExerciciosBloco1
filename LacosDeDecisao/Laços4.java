package Exercicios.LacosDeDecisao;

import java.util.Scanner;

public class La�os4 {
	public static void main(String args[])
	{
		double num,res;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um n�mero inteiro qualquer: ");
		num = leia.nextDouble();
		
		if(num%2 == 0)
		{
			res = Math.sqrt(num);
			System.out.println("\nO n�mero indicado � par, e a raiz quadrada do n�mero �: "+res+".");
		}
		else
		{
			res= Math.pow(num, 2);
			System.out.println("\nO n�mero indicado � �mpar, e ele elevado ao quadrado vale: "+res+".");
		}
	}

}
