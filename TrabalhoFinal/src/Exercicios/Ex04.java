
package Exercicios;

import javax.swing.JOptionPane;

    
/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 07/05/2024
 * @author: Layla Glicério
 *  Exercício 4 - Crie um algoritmo que lê o salário de um funcionário, informe para ele que
 *                  ele receberá um reajuste para o salário novo salario em 7%, mostrar na saída ,
 *                  O nome do Funcionário, O Salario Antigo , e o novo salario após reajuste.
 */

public class Ex04 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário:");
        double salarioInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario do funcionário"));
        
        double salarioFinal = salarioInicial * 1.07;
        
        String mensagem = " Nome do funcionário: " + nome +"\n"
                        + " Seu salario inicial: " + salarioInicial + "\n"
                        + " Seu salário final após o reajuste: " + salarioFinal + "\n";
                        
        JOptionPane.showMessageDialog(null, mensagem); 
                                       
    }

}
