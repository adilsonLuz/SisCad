package br.com.projeto.dao;

import br.com.projeto.model.Municipe;
import br.com.projeto.resources.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe criada para criar interação com banco de dados
 *
 * @author Adilson Luz
 * @since Classe Criada em 12/06/2024, 09:11:39
 */
public class MunicipeDAO {

    private Connection con;

    public MunicipeDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Metodo cadastrar municipe
    public void cadastrarMunicipe(Municipe obj) {
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
    }//Fim do Metodo

    //Metodo Alterar municipe
    public void alterarMunicipe(Municipe obj) {
        try {
            //Criando SQL
            String sql = "UPDATE tb_municipes SET nome=?, rg=?, cpf=?, email=?, "
                    + "celular=?, cep=?, endereco=?, numero=?, bairro=?, complemento=?, "
                    + "cidade=?, estado=? WHERE id=?";
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
            stmt.setInt(13, obj.getId());

            //executando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
        }
    }//Fim do metodo

    //Metodo excluir municipe
    public void excluirMunicipe(Municipe obj) {
        try {
            //criar string SQL
            String sql = "DELETE FROM tb_municipes WHERE id = ?";

            //Conecta Banco de dados
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getId());

            //Executa SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!!!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Opss, aconteceu erro" + e);
        }
    }//Fim do metodo

    //Método que lista todos os Municipes
    public List<Municipe> listarMunicipes() {
        try {
            //Criar a lista
            List<Municipe> lista = new ArrayList<>();

            //Criar o SQL, organizar e executar
            String sql = "SELECT * FROM tb_municipes";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Municipe obj = new Municipe();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));

                //Adicionar objeto cliente a lista
                lista.add(obj);

            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, aconteceu o erro " + e);
            return null;
        }
    }//Fim do metodo

    //Método consultar municipe por nome
    public Municipe consultarPorNome(String nome) {
        try {
            //Criar o SQL, organizar e executar
            String sql = "SELECT * FROM tb_municipes WHERE nome = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            Municipe obj = new Municipe();

            if (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
            }
            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            return null;
        }
    }//Fim do metodo

    //Metodo busca municipe por nome
    public List<Municipe> buscarPorNome(String nome) {
        try {
            //Criar lista
            List<Municipe> lista = new ArrayList<>();

            //Criar o SQL, organizar e executar
            String sql = "SELECT * FROM tb_municipes WHERE nome LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Municipe obj = new Municipe();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                
                lista.add(obj);
            }
            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            return null;
        }
    }//Fim do metodo
    
    //Método consultar municipe por CPF
    public Municipe consultarPorCpf(String cpf) {
        try {
            //Criar o SQL, organizar e executar
            String sql = "SELECT * FROM tb_clientes WHERE cpf = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);

            ResultSet rs = stmt.executeQuery();

            Municipe obj = new Municipe();

            if (rs.next()) {
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setComplemento(rs.getString("complemento"));                
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));

            }
            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Municipe não encontrado");
            return null;
        }
    }//Fim do metodo

}//fim da classe
