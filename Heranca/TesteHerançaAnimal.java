package Exercicios.Heranca;

public class TesteHeran�aAnimal {
	public static void main(String args[])

	{
		
		
		Cachorro dog = new Cachorro("Billy",12,"late",true,false);
		
		dog.queAnimal();
				
		Cavalo cav=new Cavalo("Spirit",8,"relincha",true,false);
		
		cav.queAnimal();
		
		Pregui�a preg = new Pregui�a("Soneca",5,"boceja",false,true);
		
		preg.queAnimal();
		
	}
}
