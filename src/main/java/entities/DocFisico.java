package entities;

public class DocFisico extends Documento {
	private String localizacao;

	public DocFisico(String nome, String assunto, String descricao, String localizacao) {
		super(nome, assunto, descricao);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	
	
}
