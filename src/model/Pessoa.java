package model;

/* Classe Pessoa:
Crie uma classe Pessoa com os atributos nome, idade e genero. 
Encapsule os atributos e implemente métodos para definir e obter os valores de forma segura.*/

public class Pessoa {

	private String nome;
	private String genero;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
