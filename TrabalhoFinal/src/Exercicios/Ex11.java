
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 19/05/2024
 * @author: Layla Glicério
 *  Exercício 11 - Crie um algoritmo que leia um número do usuário e informe se e o número é par ou ímpar
 */

public class Ex11 {
    public static void main(String[] args) {
        
        String mensagem1 = "Vamos descobrir se o número é impar ou par?!";
        JOptionPane.showMessageDialog(null, mensagem1);
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        
        if (num % 2 == 0){
            String par = "O numéro " + num + " é par!";      
        JOptionPane.showMessageDialog(null,par);
        } else{
            String impar = "O numéro " + num + " é impar!";      
        JOptionPane.showMessageDialog(null,impar);
        }
        }
        
    }
