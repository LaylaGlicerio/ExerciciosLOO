/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;


public class questao5 {
    public static void main(String[] args) {
        // Criação de um objeto da classe Retangulo
        Retangulo retangulo = new Retangulo();
        retangulo.largura=5.0;
        retangulo.altura=6.0;
        retangulo.cor="Amarelo";
        retangulo.preenchido=true;
        retangulo.material="Madeira";
        retangulo.espessura=1.7;
        retangulo.estiloBorda="Solido";
        // Exibindo as informações do retângulo
        retangulo.exibirInformacoes();

        // Aumentando o tamanho do retângulo
        retangulo.aumentarTamanho(2.0);

        // Exibindo as informações do retângulo após o aumento de tamanho
        retangulo.exibirInformacoes();
    }

}
