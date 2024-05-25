
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 17/05/2024
 * @author: Layla Glicério
 *  Exercício 14 - Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.
 */

public class Ex14 {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        
        
        if (num % 5 == 0) {
            JOptionPane.showMessageDialog(null, num + " é múltiplo de 5!");
        }else {
           JOptionPane.showMessageDialog(null, num + " não é múltiplo de 5!"); 
        }
    }
}
