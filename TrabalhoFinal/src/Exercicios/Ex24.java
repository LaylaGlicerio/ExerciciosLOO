package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 20/05/2024
 * Autor: Layla Glicério
 * Exercício - Escreva um algoritmo que leia 15 números do usuário e exiba quantos
 *             números são pares.
 */

public class Ex24 {
    public static void main(String[] args) {
   
     int contadorPar = 0;
        int QntNum = 15;
        
        for(int i = 0; i < QntNum; i++) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número: "));
            if(num % 2 == 0) {
                contadorPar++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de números pares é: " + contadorPar);
    }        
    }


