package entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity //MARCA COMO UMA ENTIDADE JPA E SERÁ A TABELA PRINCIPAL
@Table(name = "empréstimo")  

public class Emprestimo {
	@Id //CHAVE PRIMÁRIA PARA ESTÁ CLASSE POIS ELA É INDEPENDENTE
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "cpf_do_mutuario")
	private String cpfMutuario;
	@Column(name = "inicio_do_emprestimo")
	private Date inicioEmprestimo;
	@Column(name = "fim_do_emprestimo")
	private Date fimEmprestimo;
	@Column(name = "data_da_real_devolucao")
	private Date dataRealDevolucao;
	@Column(name = "status")
	private boolean status;
	
	public Emprestimo(String cpfMutuario, Date inicioEmprestimo, Date fimEmprestimo, Date dataRealDevolucao,
			boolean status) {
		super();
		this.cpfMutuario = cpfMutuario;
		this.inicioEmprestimo = inicioEmprestimo;
		this.fimEmprestimo = fimEmprestimo;
		this.dataRealDevolucao = dataRealDevolucao;
		this.status = status;
	}
	
	public Emprestimo() {
		
	}

	public String getCpfMutuario() {
		return cpfMutuario;
	}

	public void setCpfMutuario(String cpfMutuario) {
		this.cpfMutuario = cpfMutuario;
	}

	public Date getInicioEmprestimo() {
		return inicioEmprestimo;
	}

	public void setInicioEmprestimo(Date inicioEmprestimo) {
		this.inicioEmprestimo = inicioEmprestimo;
	}

	public Date getFimEmprestimo() {
		return fimEmprestimo;
	}

	public void setFimEmprestimo(Date fimEmprestimo) {
		this.fimEmprestimo = fimEmprestimo;
	}

	public Date getDataRealDevolucao() {
		return dataRealDevolucao;
	}

	public void setDataRealDevolucao(Date dataRealDevolucao) {
		this.dataRealDevolucao = dataRealDevolucao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
