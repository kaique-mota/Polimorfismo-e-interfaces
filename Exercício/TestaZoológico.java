package Exerc�cio;

public class TestaZool�gico {

	public static void main(String[] args) {
		
		Pregui�a pregui�a1 = new Pregui�a();
		Cachorro cao1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		
        cao1.setNome("Jeremias");
        cao1.setIdade(20);
        cao1.somAnimal();
        cao1.correr();
        
        System.out.println("Nome: " + cao1.getNome() + "\nIdade: " + cao1.getIdade());
        System.out.println();
        
        cavalo1.setNome("Jacinto");
        cavalo1.setIdade(10);
        cavalo1.somAnimal();
        cavalo1.correr();
        
        System.out.println("Nome: " + cavalo1.getNome() + "\nIdade: " + cavalo1.getIdade());
        System.out.println();
        
        pregui�a1.setNome("Brigitte");
        pregui�a1.setIdade(140);
        pregui�a1.somAnimal();
        pregui�a1.subir();
        
        System.out.println("Nome: " + pregui�a1.getNome() + "\nIdade: " + pregui�a1.getIdade());
	}

}
