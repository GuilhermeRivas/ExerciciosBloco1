package Exercicios.LacosDeDecisao;

import java.util.Scanner;

public class Laços2 {
	public static void main(String args[])
	{
		
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número inteiro: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número inteiro: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o terceiro número inteiro: ");
		num3 = leia.nextInt();
		
		if(num1 >= num2 && num1 >= num3 && num2 >= num3)
		{
			System.out.println("\n"+num3+", "+num2+", "+num1+".");
		}
		else if(num1 >= num2 && num1 >= num3 && num3 >= num2)
		{
			System.out.println("\n"+num2+", "+num3+", "+num1+".");
		}
		else if(num3 >= num2 && num3 >= num1 && num2 >= num1)
		{
			System.out.println("\n"+num1+", "+num2+", "+num3+".");
		}
		else if(num3 >= num2 && num3 >= num1 && num1 >= num2)
		{
			System.out.println("\n"+num2+", "+num1+", "+num3+".");
		}
		else if(num2 >= num1 && num2 >= num3 && num1 >= num3)
		{
			System.out.println("\n"+num3+", "+num1+", "+num2+".");
		}
		else
		{
			System.out.println("\n"+num1+", "+num3+", "+num2+".");
		}
	}

}
