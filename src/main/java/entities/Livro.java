package entities;

public class Livro extends DocFisico {
	private String autor;

	public Livro(String nome, String assunto, String descricao, String localizacao, String autor) {
		super(nome, assunto, descricao, localizacao);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	
	
}
