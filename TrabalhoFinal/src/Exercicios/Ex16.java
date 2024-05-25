
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 17/05/2024
 * @author: Layla Glicério
 *  Exercício 16 - Construa um algoritmo que leia do usuário o salário e exiba uma
 *                  mensagem de acordo com as seguintes condições: se o salário for até R$
 *                  1442,00, escreva a mensagem “Até 1 salário mínimo; se o salário for acima de
 *                  R$ 2884,00 e até R$ 4320,00 escreva a mensagem “Até 3 salários mínimos”;
 *                  se for acima de R$ 4320,00, escreva a mensagem “Já é um profissional de TI”.
 */

public class Ex16 {
    public static void main(String[] args) {

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário:"));
        
        if (salario <= 1442.00) {
            JOptionPane.showMessageDialog(null, "Até 1 salário mínimo");
        } else if (salario > 2884.00 && salario <= 4320.00) {
            JOptionPane.showMessageDialog(null, "Até 3 salários mínimos");
        } else if (salario > 4320.00) {
            JOptionPane.showMessageDialog(null, "Já é um profissional de TI");
        } else {
            JOptionPane.showMessageDialog(null, "Salário fora das faixas especificadas");
        }
    }

}
