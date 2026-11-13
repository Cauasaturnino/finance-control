package model;

public class Categoria {
    private int id;
    private String nomeCategoria;
    private String descricao;
    private boolean receita = true; //se for false é despesa


    // Construtor
    public Categoria (int id, String nomeCategoria, String descricao, boolean receita){
        this.id = id;
        this.nomeCategoria= nomeCategoria;
        this.descricao = descricao;
        this.receita = receita;
    }

    //GET-SET
    public int getId(){ return id;}

    public void setId (int id) {this.id = id; }

    public String getNomeCategoria() {return nomeCategoria;}

    public void setNomeCategoria(String nomeCategoria) {this.nomeCategoria = nomeCategoria;}

    public String getDescricao () {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public boolean isReceita() {return receita;}

    public void setReceita(boolean receita) {this.receita = receita;}
}
