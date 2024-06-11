package br.com.projeto.resources;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe criada para conectar o sistema ao banco de dados
 *
 * @author Adilson Luz
 * @since Classe Criada em 11/06/2024, 12:57:23
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/siscadrubensalves", "admin", "123");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
    }

}//fim da classe
