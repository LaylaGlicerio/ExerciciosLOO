
package Exercicios;
import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 07/05/2024
 * @author: Layla Glicério
 *  Exercício 6 - Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais.
 *                          Considere que a cotação é US$ 1 = R$ 5,12 centavos.
 */

public class Ex06 {
    public static void main(String[] args) {
        
        double ValorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dolar que você deseja converter para real: "));
        
        double ValorReal = ValorDolar * 5.12;
        
        String mensagem = "Convertendo US$" + ValorDolar + " dolares para reais é: R$" + ValorReal + " reais!";
                        
        JOptionPane.showMessageDialog(null, mensagem);
        
      
    }
}
