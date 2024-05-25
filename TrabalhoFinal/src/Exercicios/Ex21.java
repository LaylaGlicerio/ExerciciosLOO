package Exercicios;

import javax.swing.JOptionPane;

/**
 * TRABALHO FINAL
 * Disciplina: Linguagem Orientada a Objeto 
 * Data: 21/05/2024
 * @author: Layla Glicério
 *  Exercício 21 - Faça um programa Utilizando o Switch case , escolhendo os exercícios 18, 19 e 20. Da seguinte maneira:
 *                     Escolha Entrada das estruturas
 *                     1 – While
 *                     2 – Do While
 *                     3 - For
 */

public class Ex21 {
    public static void main(String[] args) {
        
       String opcao = "Escolha Entrada das estruturas: \n\n" +
                "1 - While\n" +
                "2 - Do while\n" +
                "3 - For\n"; 
        JOptionPane.showMessageDialog(null, opcao);
         
         int escolha =  Integer.parseInt(JOptionPane.showInputDialog("Informe a opção escolhida: "));

          
          switch(escolha){
                case 1:
                  int cont = 1;
        
                    String mensagem1 = "Eu gosto de estudar Java!";
                    while (cont <= 20) {
                        JOptionPane.showMessageDialog(null, mensagem1);

                        cont++;
                    }
                break;
                
                case 2:
                    int contador = 1;

                    String mensagem2 = "Eu odeio estudar Java!";
                    while (contador <= 20) {
                        JOptionPane.showMessageDialog(null, mensagem2);

                        contador++;
                    }
                 break;
                    
                case 3:
                    String mensagem3 = "Eu gosto de estudar Algoritmos em Java!";
                        for (int i = 1; i <= 20; i++) {
                            JOptionPane.showMessageDialog(null, mensagem3);
                        }
                break; 
          
        }
          }

}
