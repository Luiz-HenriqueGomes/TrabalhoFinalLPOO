package entities;

import jakarta.persistence.*;

@Entity //MARCA COMO UMA ENTIDADE JPA E SERÁ A TABELA PRINCIPAL
@Table(name = "dvd")  

public class DVD extends DocDigital{

	public DVD(String nome, String assunto, String descricao, boolean playable) {
		super(nome, assunto, descricao, playable);
	
	}
	
	public DVD() {
		
	}

}
