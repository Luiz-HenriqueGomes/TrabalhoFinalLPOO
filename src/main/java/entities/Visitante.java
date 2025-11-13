package entities;

import java.util.List;

public class Visitante extends Pessoa{
	protected double divida;

	public Visitante(String nome, String cpf, String email, String celular) {
		super(nome, cpf, email, celular);
		this.divida = 0;
	}

	public double getDivida() {
		return divida;
	}
	public void setDivida(double divida) {
		this.divida = divida;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Visitante [divida=" + divida + "]";
	}
	
	public void tornarAssociado(String cpf, String matriculaAssociado, String senha) {
		Visitante aux = bancoDados.find(cpf);
		Associado novo = new Associado(aux, matriculaAssociado, senha);
		
		bancoDados.novoAssociado(novo);
		bancoDados.excluirVisitante(cpf);
		
		//se tudo der certo: System.out.println("Novo Associado criado.");
		//se der errado: NÃO SEI AINDA
	}

	public List<Documento> consultarCatalogo() {
		List<Documento> documentos = bancoDados.todosDocumentos();
		
		return documentos;
	}
	
	
	
	
	
	
	
	
	
	
}
