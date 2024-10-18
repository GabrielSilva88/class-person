package view;

import model.Pessoa;

public class MainPerson {
	/* Classe Pessoa:
	Crie uma classe Pessoa com os atributos nome, idade e genero. 
	Encapsule os atributos e implemente métodos para definir e obter os valores de forma segura.*/

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setGenero("Masculino");
		p.setNome("Gabriel");
		p.setIdade(36);
		
		System.out.println("Dados\nNome: "+ p.getNome()+"\nIdade: "+ p.getIdade() + "\nGenero: "+ p.getGenero());
		
	}
}
