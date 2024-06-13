/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;


public class Produto {
    // Atributos privados
     String nome;
     double preco;
     int quantidade;
     String categoria;
     String fornecedor;
     String codigoBarras;
     String dataValidade;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Métodos adicionais
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
            System.out.println("Desconto de " + percentual + "% aplicado. Novo preço: R$ " + preco);
        } else {
            System.out.println("Percentual de desconto inválido!");
        }
    }

    public void reabastecer(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Reabastecimento de " + quantidade + " unidades realizado. Nova quantidade: " + this.quantidade);
        } else {
            System.out.println("Quantidade para reabastecimento inválida!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Categoria: " + categoria);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("Data de Validade: " + dataValidade);
    }
}
