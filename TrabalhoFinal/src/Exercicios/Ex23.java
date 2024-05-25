package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 20/05/2024
 * Autor: Layla Glicério
 * Exercício - Escreva um algoritmo que leia 15 números do usuário e exiba quantos
 *             números são maiores do que 8.
 */

public class Ex23 {
    public static void main(String[] args) {
        
        int contadorMaiorQueOito = 0;
        int QntNum = 15;
        
        for(int i = 0; i < QntNum; i++) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número: "));
            if(num > 8) {
                contadorMaiorQueOito++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de números maiores do que 8 é: " + contadorMaiorQueOito);
    }

}
