package exer4;

public class ContaBancaria {
    private double saldo;

    ContaBancaria(){
        saldo = 0;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        saldo = saldo - valor;
        throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque!");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
