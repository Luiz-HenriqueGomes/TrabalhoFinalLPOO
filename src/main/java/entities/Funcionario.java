package entities;

public class Funcionario extends Pessoa {
	private String matriculaFuncionario;

	public Funcionario(String nome, String cpf, String email, String celular, String matriculaFuncionario) {
		super(nome, cpf, email, celular);
		this.matriculaFuncionario = matriculaFuncionario;
	}

	public String getMatriculaFuncionario() {
		return matriculaFuncionario;
	}
	public void setMatriculaFuncionario(String matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}

	
	public Visitante pesquisarVisitante(String CPF) {
		Visitante aux = bibliotecaDB.find(CPF); //bancoDados.find(), por agora, é só pra indicar que ocorrerá pesquisa
		
		if(aux != null) {
			return aux;
		}
		else {
			return null;
		}
	}
	
	public void criarVisitante(String nome, String cpf, String email, String celular) {
		if(pesquisarVisitante(cpf) != null) {
			System.out.println("Já existe visitante com este CPF.");
		}
		else {
			bancoDados.insert(new Visitante(nome, cpf, email, celular));
			System.out.println("Visitante registrado com sucesso.");
		}
	}
	
	public void alterarVisitante(String nome, String cpf, String email, String celular) {
		Visitante aux = pesquisarVisitante(cpf);
		
		if(aux != null) {
			if(nome != null) {aux.setNome(nome);}
			if(cpf != null) {aux.setCpf(cpf);}
			if(email != null) {aux.setEmail(email);}
			if(celular != null) {aux.setCelular(celular);}
			
			bancoDados.save(aux); //como já existe visitante com o CPF, deve ter algum método pronto
			                      //para alteração, mas a ideia geral é essa
		}
		else {
			System.out.println("Visitante não existe, impossível alterar.");
		}
	}
	
	public Visitante excluirVisitante(String cpf) {
		
		Visitante aux = pesquisarVisitante(cpf);
		
		if(aux =! null) {
			bancoDados.delete(cpf);
			System.out.println("Visitante excluído com sucesso.");
			return aux;
		}
		else {
			System.out.println("Vistante não existe, impossível excluir.");
			return null;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Funcionario [matriculaFuncionario=" + matriculaFuncionario + "]";
	}
	
	
}
