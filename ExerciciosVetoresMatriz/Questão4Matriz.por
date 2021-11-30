programa
{
	
	funcao inicio()
	{
		real somaValores = 0.0,somaDiagonal = 0.0,matriz[3][3]
		inteiro linha,coluna
		
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEscreva um valor para a matriz: ")
				leia(matriz[linha][coluna])

				somaValores+= matriz[linha][coluna]
				se(matriz[linha][coluna] == matriz[0][0] ou matriz[linha][coluna] == matriz[2][2] ou matriz[linha][coluna] == matriz[1][1])
				{
					somaDiagonal+= matriz[linha][coluna] 
				}
			}
		}
		escreva("\nO valor da soma de todos os números da matriz é de: ",somaValores,".")
		escreva("\nO valor da soma de todos os números da diagonal principal é de: ",somaDiagonal,".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 44, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, funcao;
 */