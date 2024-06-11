package br.com.projeto.resources;

import javax.swing.JOptionPane;

/**
 * Classe criada para testar a conexão do sistema com banco de dados
 * @author Adilson Luz
 * @since Classe Criada em 11/06/2024, 13:49:16
 */
public class TestaConexao {
    
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops aconteceu um erro!!!" + e);
            
        }
    }

}//fim da classe
