package com.banco;

public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 5.00;

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor + TAXA_SAQUE <= getSaldo()) {
            saldo -= (valor + TAXA_SAQUE);
        }
    }
}
