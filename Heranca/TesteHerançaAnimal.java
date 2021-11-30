package Exercicios.Heranca;

public class TesteHerançaAnimal {
	public static void main(String args[])

	{
		
		
		Cachorro dog = new Cachorro("Billy",12,"late",true,false);
		
		dog.queAnimal();
				
		Cavalo cav=new Cavalo("Spirit",8,"relincha",true,false);
		
		cav.queAnimal();
		
		Preguiça preg = new Preguiça("Soneca",5,"boceja",false,true);
		
		preg.queAnimal();
		
	}
}
