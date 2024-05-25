package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 20/05/2024
 * @author: Layla Glicério
 *  Exercício 20 - Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar Algoritmos em Java ! 
 *                                       Utilizei o comando for ”. Utilize o comando (For).
 */

public class Ex20 {
    public static void main(String[] args) {
        
        String mensagem = "Eu gosto de estudar Algoritmos em Java!";
        
        for (int i = 1; i <= 20; i++) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

}
