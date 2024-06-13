/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;


public class questao3 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        // Usando setters para atribuir valores aos atributos
        produto.setNome("Arroz");
        produto.setPreco(30.0);
        produto.setQuantidade(50);
        produto.setCategoria("Alimentício");
        produto.setFornecedor("Fornecedor B");
        produto.setCodigoBarras("2563015895410");
        produto.setDataValidade("2024-08-01");

        // Usando getters para exibir os valores dos atributos
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Categoria: " + produto.getCategoria());
        System.out.println("Fornecedor: " + produto.getFornecedor());
        System.out.println("Código de Barras: " + produto.getCodigoBarras());
        System.out.println("Data de Validade: " + produto.getDataValidade());

        // Testando os métodos adicionais
        produto.aplicarDesconto(15.0);
        produto.reabastecer(30);
        produto.exibirInformacoes();
    }

}
