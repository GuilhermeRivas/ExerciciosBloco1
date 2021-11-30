programa
{
	inclua biblioteca Util-->ut
	
	funcao inicio()
	{
	 real maiorValor=0, valores[5]
	 inteiro x

	 para(x=0;x<5;x++)
	 {
	 	escreva("\nEscreva um valor: ")
	 	leia(valores[x])
	 	 }
	
	 	escreva("\nOs valores das pontuações são: ",valores[0],", ",valores[1],", ",valores[2],", ",valores[3],", ",valores[4],".")
	
	 	 
	 para(x=0;x<5;x++)
	{
		se(valores[x]>maiorValor){
			maiorValor = valores[x]
		}
		
	}
	escreva("\nO maior valor é : ",maiorValor,".")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorValor, 7, 7, 10}-{valores, 7, 21, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */