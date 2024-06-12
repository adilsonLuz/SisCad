package br.com.projeto.model;

/**
 * Classe criada para 
 * @author Adilson Luz
 * @since Classe Criada em 12/06/2024, 10:05:27
 */
public class Votacao {
    //Atributos
    private int id;
    private String dataCad;
    private String zona;
    private String secao;
    private String colegio;
    
    //Metodo construtor vazio
    public Votacao(){
        
    }
    
    //Metodo construtor
    public Votacao(int id, String dataCad, String zona, String secao, String colegio){
        this.id = id;
        this.dataCad = dataCad;
        this.zona = zona;
        this.secao = secao;
        this.colegio = colegio;
    }
    
    //Geters e Seters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataCad() {
        return dataCad;
    }

    public void setDataCad(String dataCad) {
        this.dataCad = dataCad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    

}//fim da classe