
package exercicios;

/**
 *Exercício 6
 * Data: 01/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade:Desenvolva um programa que imprima os primeiros 10 números da sequência de Fibonacci usando um loop `while`. 
 */
public class Ex6 {
    public static void main(String[] args) {
        int qntExibida = 10; 
        int primeiro = 0;
        int segundo = 1;
        int i = 1;

        System.out.println("Os " + qntExibida + " primeiros números da sequência de Fibonacci são:");

        while (i <= qntExibida) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            i++;
        }
    }
}
    
