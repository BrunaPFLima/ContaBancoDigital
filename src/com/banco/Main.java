package com.banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("Ana Oliveira", "98765432100");
        Cliente cliente2 = new Cliente("João Silva", "12345678901");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        ContaCorrente contaCorrente = new ContaCorrente("003", 1000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("004", 0.05);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Teste de operações
        contaCorrente.depositar(500.00);
        contaCorrente.sacar(200.00);
        contaPoupanca.depositar(1000.00);
        contaPoupanca.aplicarJuros();

        // Mostrar dados
        banco.mostrarClientes();
        banco.mostrarContas();
    }
}
