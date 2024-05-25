
package Exercicios;
import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 17/05/2024
 * @author: Layla Glicério
 *  Exercício 8 - Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo.
 */

public class Ex08 {
    public static void main(String[] args) {
        
        String mensagem1 = "Vamos descobrir se o número é poditivo ou negativo!";
        JOptionPane.showMessageDialog(null, mensagem1);
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        
        if (num >= 0){
            String positivo = "O número " + num + " é positivo!";
                JOptionPane.showMessageDialog(null, positivo);
        
        }else{
            String negativo = "O número " + num + " é negativo!";
                 JOptionPane.showMessageDialog(null, negativo);
         }
    }
}
