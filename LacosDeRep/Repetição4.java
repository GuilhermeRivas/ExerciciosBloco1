package Exercicios.LacosDeRep;

import java.util.Scanner;

public class Repetição4 {
	public static void main(String args[])
	{
		int idade,sexo,humor,calmas=0,nervosasQ=0,calmasD=0,pessoa=0,mulheresN=0,homensA=0,outrosC=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual sua idade?");
		idade = leia.nextInt();
		
		System.out.println("\nQual seu gênero?");
		System.out.println("\n1 - Feminino.");
		System.out.println("\n2 - Masculino.");
		System.out.println("\n3 - Outros.");
		sexo = leia.nextInt();
				
		System.out.println("\nQual seu humor?");
		System.out.println("\n1 - Calma.");
		System.out.println("\n2 - Nervosa.");
		System.out.println("\n3 - Agressiva.");
		humor = leia.nextInt();
		
		while(pessoa!=150)
		{
			if(humor == 1)
			{
				calmas++;
			}
			if(sexo == 1 && humor == 2)
			{
				mulheresN++;
			}
			if(sexo == 2 && humor == 3)
			{
				homensA++;
			}
			if(sexo == 3 && humor == 1)
			{
				outrosC++;
			}
			if(idade > 40 && humor == 2)
			{
				nervosasQ++;
			}
			if(idade < 18 && humor == 1)
			{
				calmasD++;
			}
			pessoa++;
			System.out.println("\nQual sua idade?");
			idade = leia.nextInt();
			
			System.out.println("\nQual seu gênero?");
			System.out.println("\n1 - Feminino.");
			System.out.println("\n2 - Masculino.");
			System.out.println("\n3 - Outros.");
			sexo = leia.nextInt();
					
			System.out.println("\nQual seu humor?");
			System.out.println("\n1 - Calma.");
			System.out.println("\n2 - Nervosa.");
			System.out.println("\n3 - Agressiva.");
			humor = leia.nextInt();
			
		}
		System.out.println("\nO quantidade de pessoas calmas na região é: "+calmas+".");
		System.out.println("\nO quantidade de mulheres nervosas na região é: "+mulheresN+".");
		System.out.println("\nO quantidade de homens agressivos na região é: "+homensA+".");
		System.out.println("\nO quantidade de pessoas de outros gêneros são calmas na região é: "+outrosC+".");
		System.out.println("\nO quantidade de pessoas nervosas com mais de 40 anos na região é: "+nervosasQ+".");
		System.out.println("\nO quantidade de pessoas calmas com menos de 18 anos na região é: "+calmasD+".");
		
	}
	

}
