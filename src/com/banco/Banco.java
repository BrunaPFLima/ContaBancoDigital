package com.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void mostrarClientes() {
        System.out.println("Clientes do banco " + nome + ":");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void mostrarContas() {
        System.out.println("Contas do banco " + nome + ":");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    @Override
    public String toString() {
        return "Banco: " + nome;
    }
}
