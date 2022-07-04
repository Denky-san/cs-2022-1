package ex2;

public class Livro extends Produto{
    private String autor;

    public Livro(String descricao) {
        super(descricao);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return super.getDescricao() + " - " + getAutor();
    }
}
