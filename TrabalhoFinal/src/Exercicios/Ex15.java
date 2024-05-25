
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 17/05/2024
 * @author: Layla Glicério
 *  Exercício 15 - Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma
mensagem informando o tipo do clima, de acordo com as seguintes condições:
se a temperatura estiver até 18 graus, o clima é frio; se a temperatura estiver
entre 19 e 23 graus, o clima é agradável; se a temperatura estiver entre 24 e 35
graus, o clima é quente; se a temperatura estiver acima de 35 graus, o clima é
muito quente.
 */

public class Ex15 {
    public static void main(String[] args) {
        
        double Temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura em Celsius: "));
        
        if (Temperatura <= 18) {
            JOptionPane.showMessageDialog(null, "O clima está frio.");
        } else if (Temperatura >= 19 && Temperatura <= 23) {
            JOptionPane.showMessageDialog(null, "O clima está agradável.");
        } else if (Temperatura >= 24 && Temperatura <= 35) {
            JOptionPane.showMessageDialog(null, "O clima está quente.");
        } else {
            JOptionPane.showMessageDialog(null, "O clima está muito quente.");
        }
    }
}
