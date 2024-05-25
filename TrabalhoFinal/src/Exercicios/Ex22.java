package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 20/05/2024
 * @author: Layla Glicério
 *  Exercício 22 - Escreva um algoritmo que leia 15 números do usuário. Ao final exiba a
 *                  média dos 15 números. Utilize o comando de repetição (For).
 */

public class Ex22 {
    public static void main(String[] args) {
        
        double soma = 0;
        int QntNum = 15;
        
        for(int i = 0; i < QntNum; i++) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número: "));
            soma += num;
        }
        double media = soma / QntNum;
        JOptionPane.showMessageDialog(null, "A média dos 15 números é: " + media);
        }

}
