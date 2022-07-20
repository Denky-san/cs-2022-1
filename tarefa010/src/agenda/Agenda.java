package agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void addContato(Contato contato){
        contatos.add(contato);
    }

    public Contato buscarContato(String valor){
        Contato contato = new Contato();

        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getEmail().equals(valor)  || contatos.get(i).getNome().equals(valor) ){
                contato =  contatos.get(i);
            }
        }
        return contato;
    }

    public void excluirContato(String nome){
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nome)){
                contatos.remove(contatos.get(i));
            }
        }
    }

    public String listarContatos(){
        String lista = "";
        for(int i = 0; i < contatos.size(); i++){
            lista += "Nome:" + contatos.get(i).getNome() +" - Email: " + contatos.get(i).getEmail() + "\n";
        }
        return lista;
    }



}