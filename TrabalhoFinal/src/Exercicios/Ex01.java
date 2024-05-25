
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 07/05/2024
 * @author: Layla Glicério
 *  *Exercício 1 - Crie um algoritmo que leia um número inteiro e pergunte o ao usuário qual o
 *                   numero ele quer que imprima na tela o Antecessor ou sucessor.
 */

public class Ex01 {
    public static void main(String[] args) {
        int numEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' para conhecer o antecessor do número digitado ou '2' para conhecer o sucessor:"));
       
        String invalido = "Opção escolhida inválida!";
        
        switch (escolha) {
            
            case 1:
                int antecessor = numEscolhido - 1;
                    JOptionPane.showMessageDialog(null, antecessor);
                break;
                
            case 2:
                int sucessor = numEscolhido + 1;
                    JOptionPane.showMessageDialog(null, sucessor);
                break;
                
            default:
                JOptionPane.showMessageDialog(null,invalido);
                break;

    }
    }
}

    
