
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 19/05/2024
 * @author: Layla Glicério
 *  Exercício 13 - Escreva um algoritmo que pergunte o nome e que leia uma letra que
 *                  represente o sexo de uma pessoa (M para Masculino e F para feminino). Se for
 *                  masculino, mostra a mensagem “Seja bem-vindo, Senhor Fulano de Tal!”, se
 *                  for feminino, mostra a mensagem “Seja bem-vinda, Senhora Fulana de Tal!”.
 */

public class Ex13 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String sexo = JOptionPane.showInputDialog("Digite o sexo: \n Obs: M para Masculino, F para Feminino");
        
        String mensagem;
        
        if ("M".equals(sexo)) {
            mensagem = "Seja bem-vindo, " + nome + "!";
        } else if ("F".equals(sexo)) {
            mensagem = "Seja bem-vinda, " + nome + "!";
        } else {
            mensagem = "Sexo inválido!";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
