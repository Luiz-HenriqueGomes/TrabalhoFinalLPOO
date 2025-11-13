package entities;

import java.util.Date;

public class Emprestimo {
	
	private String cpfMutuario;
	private Date inicioEmprestimo, fimEmprestimo, dataRealDevolucao;
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
