package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 20/05/2024
 * @author: Layla Glicério
 *  Exercício 17 - Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando
 *                   o dia da semana e informe o nome do dia correspondente.
 */

public class Ex17 {
    public static void main(String[] args) {
        
         String mensagem1 = "Vamos descobrir qual dia da semana é de acordo com um numero!";
            JOptionPane.showMessageDialog(null, mensagem1);
        
         int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7: "));
         
         String dia;
         
         switch (num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Número inválido! Por favor, insira um número de 1 a 7.";
        }
         JOptionPane.showMessageDialog(null, dia + "!");
         
         
    }

}
