package Exercicios.LacosDeDecisao;

import java.util.Scanner;

public class La�os1 {
	
	public static void main(String args[]) {
		
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o primeiro n�mero inteiro: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo n�mero inteiro: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o terceiro n�mero inteiro: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) 
		{
			System.out.println("\nO primeiro n�mero("+num1+") � o maior.");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("\nO segundo n�mero("+num2+") � o maior.");
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println("\nO terceiro n�mero("+num3+") � o maior.");
		}
		else
		{
			System.out.println("\nOs valores informados s�o invalidos para a opera��o.");
		}
	}

}



