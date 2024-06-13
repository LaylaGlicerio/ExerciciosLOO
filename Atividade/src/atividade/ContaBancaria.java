/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author 70463550617
 */
    public class ContaBancaria {
     String titular;
     double saldo;
     int numeroConta;
     String agencia;
     String tipoConta;
     String cpf;
     String endereco;


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor + "!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para a conta de " + destino.titular + " realizada com sucesso!");
        } else if (valor <= 0) {
            System.out.println("Valor de transferência inválido!");
        } else {
            System.out.println("Saldo insuficiente para transferência de R$ " + valor + "!");
        }
    }
     // Métodos getters para os atributos, se necessário
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
}
   