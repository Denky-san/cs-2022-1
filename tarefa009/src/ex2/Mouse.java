package ex2;

public class Mouse extends Produto{
    private String tipo;

    public Mouse(String descricao) {
        super(descricao);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return super.getDescricao() + " - " + getTipo();
    }
}