package ex2;

import java.util.ArrayList;

public class ProdutoTeste {

    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<Produto>();

        Livro livro1 = new Livro("Capitaes de areia");
        livro1.setAutor("Jorge Amado");
        carrinho.add(livro1);

        Livro livro2 = new Livro("Percy Jackson e o ladrao de raios");
        livro2.setAutor("Rick Riordan");
        carrinho.add(livro2);

        Mouse mouse1 = new Mouse("Mouse gamer Warrior");
        mouse1.setTipo("Tipo 1");
        carrinho.add(mouse1);

        Mouse mouse2 = new Mouse("Mouse gamer Logitech");
        mouse2.setTipo("Tipo 2");
        carrinho.add(mouse2);

        for(int i = 0; i < carrinho.size(); i++){
            System.out.println(carrinho.get(i).getDescricao());
        }
    }
}