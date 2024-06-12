package br.com.projeto.dao;

import br.com.projeto.model.Municipe;
import br.com.projeto.resources.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 * Classe criada para criar interação com banco de dados
 * @author Adilson Luz
 * @since Classe Criada em 12/06/2024, 09:11:39
 */
public class MunicipeDAO {
    
    private Connection con;
    
    public MunicipeDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Metodo cadastrar municipe
    public void cadastrarMunicipe(Municipe obj){
        try {
            //Criando SQL
            String sql = "insert into tb_municipes(nome, rg, cpf, email, "
                       + "celular, cep, endereco, numero, bairro, complemento, "
                       + "cidade, estado) "
                       + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            //Conectar Banco de dados organizando comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getCelular());
            stmt.setString(6, obj.getCep());
            stmt.setString(7, obj.getEndereco());
            stmt.setInt(8, obj.getNumero());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getCidade());
            stmt.setString(12, obj.getEstado());
            
            //executando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
                
    }
    
    //Metodo Alterar municipe
    public void alterarMunicipe(){
        
    }
    
    
    //Metodo excluir municipe
    public void excluirMunicipe(){
        
    }
    

}//fim da classe
