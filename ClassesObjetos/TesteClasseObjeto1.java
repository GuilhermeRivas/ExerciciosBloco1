package HelloWorld;

public class TesteClasseObjeto1 {
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.	
	*/
	public static void main(String args[])
	{
		ClasseObjeto1 client1 = new ClasseObjeto1("Apolo", 130, 110, 180);
		client1.imprimirInfo();
		System.out.println("\nA medida da altura foi feita incorretamente, refazer a medição.");
		client1.setAltura(182);
		client1.imprimirInfo();
		
		
		ClasseObjeto1 client2 = new ClasseObjeto1("Aurora");
		client2.imprimirInfo();
		System.out.println("\nA(O) cliente "+client2.getNomeCliente()+" chegou para tirar as medidas");
		client2.setAltura(167);
		client2.setBusto(140);
		client2.setCintura(78);
		client2.imprimirInfo();
			
	}
}
