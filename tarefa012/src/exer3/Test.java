package exer3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner s = new Scanner( System.in );
        String usuario;
        String senha;

        try{
            System.out.println("Usuário:");
            usuario = s.next();

            System.out.println("Senha:");
            senha = s.next();

            Login login = new Login();

            System.out.println(login.realizarLogin(usuario,senha));

        }catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Tamanho do vetor excedido.");

        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
