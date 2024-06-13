/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;


public class Retangulo {
     double largura;
     double altura;
     String cor;
     boolean preenchido;
     String material;
     double espessura;
     String estiloBorda;


    // Método para calcular a área do retângulo
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para exibir as informações do retângulo
    public void exibirInformacoes() {
        System.out.println("Informações do Retângulo:");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Cor: " + cor);
        System.out.println("Preenchido: " + (preenchido ? "Sim" : "Não"));
        System.out.println("Material: " + material);
        System.out.println("Espessura: " + espessura);
        System.out.println("Estilo da Borda: " + estiloBorda);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    // Método para aumentar a largura e altura pelo fator especificado
    public void aumentarTamanho(double fator) {
        if (fator > 0) {
            largura *= fator;
            altura *= fator;
            System.out.println("Tamanho aumentado pelo fator " + fator + ". Nova largura: " + largura + ", Nova altura: " + altura);
        } else {
            System.out.println("Fator de aumento inválido!");
        }
    }
}