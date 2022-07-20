package exer4;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        try{
            ContaBancaria conta = new ContaBancaria();

            conta.depositar(3000);
            conta.sacar(150);
            conta.sacar(3500);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
