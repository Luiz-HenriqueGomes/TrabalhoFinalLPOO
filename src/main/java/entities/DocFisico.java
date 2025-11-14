package entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public class DocFisico extends Documento {
	
	@Column(name = "local_na_estante")
	private String localizacao;

	public DocFisico(String nome, String assunto, String descricao, String localizacao) {
		super(nome, assunto, descricao);
		this.localizacao = localizacao;
	}
	
	public DocFisico() {
		
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	
	
}
