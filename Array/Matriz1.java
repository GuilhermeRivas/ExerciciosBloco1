package HelloWorld;

import java.util.Scanner;

public class Matriz1 {
	public static void main(String args[]) {
		
		int [][] tres = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int linha,coluna,maior=0;
		
		for(linha= 0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEscreva um valor: ");
				tres[linha][coluna] = leia.nextInt();
				
				if(tres[linha][coluna] > 10 )
				{
					maior++;
				}
			}
		}
		System.out.println("Na matriz temos "+maior+" números maior que 10.");
		
	}

}
