package HelloWorld;

import java.util.Scanner;

public class ClasseObjeto2 {
	
	/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/

	public boolean manutencao;
	public boolean tempo;
	public boolean combustivel;
	public boolean passageiros;
	public String man;
	public String tem;
	public String com;
	public String pas;
	public int res;
	
	
	Scanner leia = new Scanner(System.in);
	
	public ClasseObjeto2(boolean manutencao,boolean tempo,boolean combustivel,boolean passageiros)
	{
		this.manutencao = manutencao;
		this.tempo = tempo;
		this.combustivel = combustivel;
		this.passageiros = passageiros;
	
	}
					
	
	public void preparar()
	{
		do
	{
		System.out.println("\n\tVoc� deseja iniciar o procedimento?");
		System.out.println("\t1 - Sim");
		System.out.println("\t2 - N�o");
		res = leia.nextInt();
		if(res == 2)
		{
			System.out.println("\nObrigado por usar nosso programa, se quiser iniciar o procedimento por favor acione o comando novamente.");
		}
		if (res == 1)		
	{
			System.out.print("\nA manuten��o foi realizada?");
			System.out.println("\nSim");
			System.out.println("\nN�o");
			man = leia.next();
			System.out.print("\nO clima est� apropriado para v�o?");
			System.out.println("\nSim");
			System.out.println("\nN�o");
			tem = leia.next();
			System.out.print("\nA quantidade de combustivel � suficiente?");
			System.out.println("\nSim");
			System.out.println("\nN�o");
			com = leia.next();
			System.out.print("\nO n�mero de pessoas � bordo � o necess�rio?");
			System.out.println("\nSim");
			System.out.println("\nN�o");
			pas = leia.next();
			
	if(man == "Sim")
	{
		boolean manutencao = true;
		}
	if(tem == "Sim")
	{
		boolean tempo = true;
		}
	if(com == "Sim")
	{
		boolean combustivel = true;
		}
	if(pas == "Sim")
	{
		boolean passageiros = true;
		}
	}
	}while(res != 2 && res !=1);
	}
	public void iniciar()
	{
		if(ClasseObjeto2(true,true,true,true))
		{
			System.out.println("O avi�o est� pronto para decolar.");
		}
		else 
		{
			System.out.println("Por favor cheque todas as condi��es para autoriza��o do v�o.");
		}
		
	}


	private boolean ClasseObjeto2(boolean b, boolean c, boolean d, boolean e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
		
			
}
