package entities;

import jakarta.persistence.*;

@Entity //MARCA COMO UMA ENTIDADE JPA E SERÁ A TABELA PRINCIPAL
@Table(name = "livro")  
public class Livro extends DocFisico {

	@Column(name = "autor")
	private String autor;

	public Livro(String nome, String assunto, String descricao, String localizacao, String autor) {
		super(nome, assunto, descricao, localizacao);
		this.autor = autor;
	}
	public Livro() {
		
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	
	
}
