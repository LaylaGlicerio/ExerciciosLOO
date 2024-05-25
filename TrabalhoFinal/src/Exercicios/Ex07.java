
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 07/05/2024
 * @author: Layla Glicério
 *  Exercício 7 - Crie um algoritmo que leia as variáveis inteiras A e B e troque o valor destas
 *                 variáveis. Isto é, A deve ficar com o valor de B, e B deve ficar com o valor de A.
 *                 Mostre os valores de A e B - Antes e depois da troca. 
 *                            (dica usar uma variável auxiliar)
 */

public class Ex07 {
    public static void main(String[] args) {
         
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
        
        String mensagem1 = "A sequência inicial é: " + num1 + ", " + num2;
        JOptionPane.showMessageDialog(null, mensagem1);
        
        int auxiliar = num1;
        num1 = num2;
        num2 = auxiliar;
        
        String mensagem2 = "A sequência final é: " + num1 + ", " + num2;
        JOptionPane.showMessageDialog(null, mensagem2);
        
        
    }
    
}


