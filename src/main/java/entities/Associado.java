package entities;

public class Associado extends Visitante {
	private String matriculaAssociado, senha;
	
	public Associado(Visitante vis, String matriculaAssociado, String senha) {
		super(vis.getNome(), vis.getCpf(), vis.getEmail(), vis.getCelular());
		this.divida = vis.getDivida();
		this.matriculaAssociado = matriculaAssociado;
		this.senha = senha;
	}

	public Associado(String nome, String cpf, String email, String celular, String matriculaAssociado, String senha) {
		super(nome, cpf, email, celular);
		this.matriculaAssociado = matriculaAssociado;
		this.senha = senha;
	}

	public String getMatriculaAssociado() {
		return matriculaAssociado;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
