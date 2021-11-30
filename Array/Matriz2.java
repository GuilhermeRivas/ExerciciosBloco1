package HelloWorld;


import java.util.Scanner;

public class Matriz2 {
	public static void main(String args[]) 
	{
		float [][] matriz1 = new float [2][2];
		float [][] matriz2 = new float [2][2];
		float [][] matriz3 = new float [2][2];
		float constante;
		int op,linha,coluna,num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nInsira os valores para a primeira matriz: ");
				matriz1[linha][coluna] = leia.nextFloat();
			}
		}
		for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.println("\nInsira os valores para a segunda matriz: ");
					matriz2[linha][coluna] = leia.nextFloat();
				}	
			}
		
		for(int clear = 0; clear < 1000; clear++) {
		    System.out.println("\n") ;
		}


		do 
		{
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1- Somar as matrizes.");
		System.out.println("\n2- Subtrair a primeira matriz da segunda.");
		System.out.println("\n3- Adicionar uma constante nas duas matrizes.");
		System.out.println("\n4- Imprimir as matrizes.");
		System.out.println("\n5- Sair do programa.");
		
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		for(int clear = 0; clear < 1000; clear++) {
		    System.out.println("\n") ;
		}

		switch(op)
		{
		case 1:
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
					
				}
			}
			System.out.println("\nA soma das matrizes é igual :");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.println("M3["+num+"] = "+matriz3[linha][coluna]+".");
					num++;
				}
				
			}break;
		case 2:
			System.out.println("\nA subtração das matrizes é igual :");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matriz3[linha][coluna] = matriz2[linha][coluna] - matriz1[linha][coluna];
					
				}
				
			}for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("M3["+num+"] = "+matriz3[linha][coluna]+".");
						num++;
					}
					
				
			}break;
		case 3:
			System.out.println("\nPor favor digite uma constante: ");
			constante = leia.nextFloat();
			
			System.out.println("\nO valor da matriz somada à constante é: ");
			System.out.println("\n");
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matriz1[linha][coluna]+= constante;
					System.out.println("M1["+num+"] = "+matriz1[linha][coluna]+".");	
					num++;
				}
			}
			System.out.println("\n");
			num=0;
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matriz2[linha][coluna]+= constante;
					System.out.println("M2["+num+"] = "+matriz2[linha][coluna]+".");
					num++;
				}
			
		}break;
		case 4:
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.println("M1["+num+"] = "+matriz1[linha][coluna]+".");
					num++;
				}
			}
			System.out.println("\n");
			num=0;
			for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("M2["+num+"] = "+matriz2[linha][coluna]+".");
						num++;
					}
			}break;
		case 5:
		{
			System.out.println("\nObrigado por utilizar nosso programa!.");
		}break;
		default:
			System.out.println("\nOpção invalida, porfavor digite outra opção.");
			
		}
	}while(op!=5);
		}	
}

	
			


