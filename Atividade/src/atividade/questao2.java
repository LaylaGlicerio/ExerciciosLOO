/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;


public class questao2 {
    public static void main(String[] args) {
        // Criação de objetos da classe ContaBancaria
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular="Lucimar";
        conta1.saldo=12345;
        conta1.numeroConta=001;
        conta1.agencia="208";
        conta1.tipoConta="Poupanca";
        conta1.cpf="107.420.689-58";
        conta1.endereco="Rua C, 12";
        
        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular="Joao";
        conta2.saldo=2744;
        conta2.numeroConta=050;
        conta2.agencia="001";
        conta2.tipoConta="Poupanca";
        conta2.cpf="903.741.023-00";
        conta2.endereco="Avenida Itapua , 740";

        // Realizando operações na conta1
        conta1.depositar(1050.00);
        conta1.exibirSaldo();

        conta1.sacar(250.00);
        conta1.exibirSaldo();

        // Realizando transferência da conta1 para a conta2
        conta1.transferir(conta2, 500.00);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
