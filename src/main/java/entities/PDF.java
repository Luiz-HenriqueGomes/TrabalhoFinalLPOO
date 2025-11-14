package entities;

import jakarta.persistence.*;

@Entity //MARCA COMO UMA ENTIDADE JPA E SERÁ A TABELA PRINCIPAL
@Table(name = "pdf")  
public class PDF extends DocDigital{

	public PDF(String nome, String assunto, String descricao, boolean playable) {
		super(nome, assunto, descricao, playable);
		
	}
	
	public PDF() {
		
	}

}
