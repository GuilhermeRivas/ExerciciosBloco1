programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		
		inteiro x,soma = 0,media = 0,maiorVezes =0, maiorNumero = 0,dado[10]
		
	
		para(x=0;x<10;x++)
		{
			
			
			dado[x] = Util.sorteia(1,6)
			soma+= dado[x]
			
			se(maiorNumero < dado[x]){
				maiorVezes = 0
			}
			se(maiorNumero < dado[x]){ 
				maiorNumero = dado[x]	
			}
			se(dado[x] == maiorNumero){
				maiorVezes++
			}
			
				
			}
			media = soma/10
			escreva("\nA média dos números lançados no dado é de: ",media,".")
			escreva("\nO maior número lançado foi ",maiorNumero,", e ele foi lançado ",maiorVezes," vezes.")
		
			
		}
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorVezes, 8, 31, 10}-{maiorNumero, 8, 46, 11}-{dado, 8, 62, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */