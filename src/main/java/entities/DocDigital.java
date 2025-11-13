package entities;

public class DocDigital extends Documento{
	
	private boolean playable;

	public DocDigital(String nome, String assunto, String descricao, boolean playable) {
		super(nome, assunto, descricao);
		this.playable = playable;
	}

	public boolean isPlayable() {
		return playable;
	}

	public void setPlayable(boolean playable) {
		this.playable = playable;
	}
	
}
