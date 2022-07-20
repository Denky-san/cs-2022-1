package exer3;

public class Login {

    public boolean realizarLogin(String usuario, String senha) throws LoginInvalidoException {
        boolean valido = false;
        if(usuario.equals("pedro") && senha.equals("1234")){
            valido = true;
        }
        if(!valido){
            throw new LoginInvalidoException("Usuário e/ou senha inválidos");
        }else{

        }
        return true;

    }
}
