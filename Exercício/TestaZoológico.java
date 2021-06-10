package Exercício;

public class TestaZoológico {

	public static void main(String[] args) {
		
		Preguiça preguiça1 = new Preguiça();
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
        
        preguiça1.setNome("Brigitte");
        preguiça1.setIdade(140);
        preguiça1.somAnimal();
        preguiça1.subir();
        
        System.out.println("Nome: " + preguiça1.getNome() + "\nIdade: " + preguiça1.getIdade());
	}

}
