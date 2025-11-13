package entities;

public abstract class Pessoa {
	protected String nome, cpf, email, celular;

	public Pessoa(String nome, String cpf, String email, String celular) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.celular = celular;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", celular=" + celular + "]";
	}
}
