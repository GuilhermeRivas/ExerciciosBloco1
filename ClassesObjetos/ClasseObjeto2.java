package HelloWorld;

import java.util.Scanner;

public class ClasseObjeto2 {
	
	/*2) Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/

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
		System.out.println("\n\tVocê deseja iniciar o procedimento?");
		System.out.println("\t1 - Sim");
		System.out.println("\t2 - Não");
		res = leia.nextInt();
		if(res == 2)
		{
			System.out.println("\nObrigado por usar nosso programa, se quiser iniciar o procedimento por favor acione o comando novamente.");
		}
		if (res == 1)		
	{
			System.out.print("\nA manutenção foi realizada?");
			System.out.println("\nSim");
			System.out.println("\nNão");
			man = leia.next();
			System.out.print("\nO clima está apropriado para vôo?");
			System.out.println("\nSim");
			System.out.println("\nNão");
			tem = leia.next();
			System.out.print("\nA quantidade de combustivel é suficiente?");
			System.out.println("\nSim");
			System.out.println("\nNão");
			com = leia.next();
			System.out.print("\nO número de pessoas à bordo é o necessário?");
			System.out.println("\nSim");
			System.out.println("\nNão");
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
			System.out.println("O avião está pronto para decolar.");
		}
		else 
		{
			System.out.println("Por favor cheque todas as condições para autorização do vôo.");
		}
		
	}


	private boolean ClasseObjeto2(boolean b, boolean c, boolean d, boolean e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
		
			
}
