package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	//DEFININDO AS CONEXÕES 
	
	private static final String URL = "jdbc:mysql://localhost:3306/bibliotecadb?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	public static Connection getConnection() {
        try {
            // TENTA ESTABELECER A CONEXÃO COM O BANCO USANDO AS CREDENCIAS E A URL
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // SE FALHAR, LANÇA UMA CONEXÃO PARA AVISAR A APLICAÇÃO
            System.err.println("❌ ERRO: Falha ao conectar com o banco de dados.");
            System.err.println("Verifique se o MySQL Server está rodando e se a URL/credenciais estão corretas.");
            throw new RuntimeException("Erro na conexão com o banco de dados.", e);
        }
    }

	
	// ======= !!!!!!!!!!!!! MAIN USADO APENAS PARA VERIFICAÇÃO RÁPIDA SE O BANCO DE DADOS ESTÁ FUNCIONANDO !!!!!!! =========
	public static void main(String [] args) {
		Connection conexao = null;
        try {
            //TENTA OBTER UMA CONEXÃO
            conexao = getConnection();
            System.out.println("🎉 Conexão com o MySQL Workbench bem-sucedida!");
        } catch (RuntimeException e) {
            
        } finally {
            //GARANTE QUE A CONEXÃO FOI FEHCADA
            if (conexao != null) {
                try {
                    conexao.close();
                    System.out.println("Conexão fechada com segurança.");
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
	}
	// ====================================================================================================================
}
