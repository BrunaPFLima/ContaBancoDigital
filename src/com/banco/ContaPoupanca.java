package com.banco;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, double taxaJuros) {
        super(numero, 0.00);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            saldo -= valor;
        }
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }
}
