package entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public class DocDigital extends Documento{
	
	@Column(name = "playable")
	private boolean playable;

	public DocDigital(String nome, String assunto, String descricao, boolean playable) {
		super(nome, assunto, descricao);
		this.playable = playable;
	}
	
	public DocDigital() {
		
	}

	public boolean isPlayable() {
		return playable;
	}

	public void setPlayable(boolean playable) {
		this.playable = playable;
	}
	
}
