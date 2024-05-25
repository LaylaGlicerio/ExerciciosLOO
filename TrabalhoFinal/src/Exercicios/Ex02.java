
package Exercicios;
import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 07/05/2024
 * @author: Layla Glicério
 * Exercício 2 - Crie um algoritmo que lê dois números inteiros, A e B, e mostre o resultado
 *                   da soma, subtração, multiplicação, multiplicação , divisão , 
 *                   Potencia e o Mode % de A por B;
 */

public class Ex02 {
      public static void main(String[] args) {
        
        String mensagem = "Este programa irá calcular o resultado da \n"
                +" - Soma\n"
                +" - Subtração\n"
                +" - Multiplicação\n" 
                +" - Divisão\n" 
                +" - Potencia\n"
                +" - Mode\n"
                + "dos dois números que você vai escolher!";
        
        JOptionPane.showMessageDialog(null,mensagem);
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("O primeiro número escolhido é:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("O segundo número escolhido é:"));
        
        int somar = num1 + num2;
        int subtrair = num1 - num2;
        int multiplicar = num1 * num2;
        int dividir = num1 / num2;
        int potencia = (int) Math.pow(num1, num2);
        int modulo = num1 % num2;
        
         String resultados = "A soma é igual a = " + somar + "\n"
                            +       
                "A subtração é igual a = " + subtrair + "\n"
                            +  
                "A multiplicação é igual a = " + multiplicar + "\n"
                            + 
                "A divisão é igual a = " + dividir + "\n"
                            + 
                "A potenciação é igual a = " + potencia + "\n"
                            + 
                "O módulo é igual a = " + modulo + "\n";
                            
        JOptionPane.showMessageDialog(null, resultados); 
            
      }
}

