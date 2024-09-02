package com.banco;

public abstract class Conta {
    private String numero;
    protected double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public abstract void sacar(double valor);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [Número: " + numero + ", Saldo: " + saldo + "]";
    }
}
