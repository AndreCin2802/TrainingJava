package Atividades.banco;

import lombok.Getter;

public class Banco {
    private Titular titular;


    @Getter
    private double balance;

    public Banco(Titular titular, double depositoInicial) {
        this.titular = titular;
        deposit(depositoInicial);

    }

    public void deposit(double valor) {
        balance = balance + valor;

    }

    public Banco(Titular titular) {
        this.titular = titular;
    }

    public void widthdraw(double valor) {
        balance = balance - (valor + 5);

    }

    @Override
    public String toString() {

        return "Account data: \n" + "Account " + titular.getAccount() + ", Holder: " +
                titular.getTitular() + ", Balance: $ " + String.format("%.2f", balance);
    }
}
