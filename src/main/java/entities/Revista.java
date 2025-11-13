package entities;

public class Revista extends DocFisico {
	private String edicao;
	private String fotografo;
	
	public Revista(String nome, String assunto, String descricao, String localizacao, String edicao, String fotografo) {
		super(nome, assunto, descricao, localizacao);
		this.edicao = edicao;
		this.fotografo = fotografo;
	}

	public String getEdicao() {
		return edicao;
	}

	public String getFotografo() {
		return fotografo;
	}

	

	
}
