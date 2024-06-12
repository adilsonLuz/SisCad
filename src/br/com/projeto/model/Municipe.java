package br.com.projeto.model;

/**
 * Classe criada para
 *
 * @author Adilson Luz
 * @since Classe Criada em 12/06/2024, 09:19:15
 */
public class Municipe {

    //Atributos
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String email;
    private String celular;
    private String cep;
    private String endereco;
    private int numero;
    private String Complemento;
    private String bairro;
    private String cidade;
    private String estado;

    //Metodo construtor vazio
    public Municipe() {

    }

    //Metodo construtor
    public Municipe(int id, String nome, String rg, String cpf, String email,
            String celular, String cep, String endereco, int numero, String complemento,
            String bairro, String cidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.Complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
}

//getters e Setters
public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
    

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}//fim da classe
