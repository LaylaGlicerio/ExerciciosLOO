
package Exercicios;
import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 07/05/2024
 * @author: Layla Glicério
 *  Exercício 3 - Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias
 *                   essa pessoa já viveu, Baseando que o ano tem sempre 365 dias.
 */

public class Ex03 {
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        int diasdeVida = idade*365; 
        
        String mensagem = "Você tem no total: " + diasdeVida + " dias de vida!";
        
        JOptionPane.showMessageDialog(null,mensagem);

    }
}
