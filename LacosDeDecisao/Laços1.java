package Exercicios.LacosDeDecisao;

import java.util.Scanner;

public class Laços1 {
	
	public static void main(String args[]) {
		
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o primeiro número inteiro: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número inteiro: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o terceiro número inteiro: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) 
		{
			System.out.println("\nO primeiro número("+num1+") é o maior.");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("\nO segundo número("+num2+") é o maior.");
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println("\nO terceiro número("+num3+") é o maior.");
		}
		else
		{
			System.out.println("\nOs valores informados são invalidos para a operação.");
		}
	}

}



