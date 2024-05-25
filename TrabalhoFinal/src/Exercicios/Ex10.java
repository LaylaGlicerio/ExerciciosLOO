
package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 17/05/2024
 * @author: Layla Glicério
 *  Exercício 10 - Crie um algoritmo que leia 3 valores e informe qual o maior número e qual
 *                   o menor número . Caso exista algum igual , informe a igualdade.
 */

public class Ex10 {
    public static void main(String[] args) {
        
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
        double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro valor: "));
        
        
        double maior = valor1;
        double menor = valor1;
        
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor2 < menor) {
            menor = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }
        if (valor3 < menor) {
            menor = valor3;
        }
        
        String igualdade = "Não há números iguais.";
        if (valor1 == valor2 && valor1 == valor3) {
            igualdade = "Todos os três números são iguais.";
        } else if (valor1 == valor2) {
            igualdade = "Os números " + valor1 + " e " + valor2 + " são iguais.";
        } else if (valor1 == valor3) {
            igualdade = "Os números " + valor1 + " e " + valor3 + " são iguais.";
        } else if (valor2 == valor3) {
            igualdade = "Os números " + valor2 + " e " + valor3 + " são iguais.";
        }
        
        String resultado = "Maior número: " + maior + "\nMenor número: " + menor + "\n" + igualdade;
        JOptionPane.showMessageDialog(null, resultado);
    }
}

