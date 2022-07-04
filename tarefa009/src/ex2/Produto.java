package ex2;

public class Produto {
    private String nomeLoja;
    private double preco;
    private String descricao = "Produto de informática";

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getDescricao() {
        return descricao;
    }
}