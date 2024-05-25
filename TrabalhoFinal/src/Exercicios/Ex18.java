package Exercicios;

import javax.swing.JOptionPane;


/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 20/05/2024
 * @author: Layla Glicério
 *  Exercício 18 - Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar java! , 
 *                               Utilizei a estrutura de repetição “While”
 */

public class Ex18 {
    public static void main(String[] args) {
        
        int cont = 1;
        
        String mensagem = "Eu gosto de estudar Java!";
        while (cont <= 20) {
            JOptionPane.showMessageDialog(null, mensagem);
            
            cont++;
        }
    }

}
