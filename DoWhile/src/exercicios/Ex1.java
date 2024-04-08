
package exercicios;
/**
 *Exercício 1
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (Do-While) 
 * Atividade: Desenvolva um programa que calcule a soma dos números pares de 1 a 100 usando um loop ` do-while`.
 */

public class Ex1 {
    public static void main(String[] args) {
        int num = 1;
        int soma = 0;
        
        do {
            if (num % 2 == 0) { 
                soma += num; 
            }
            num++; 
        } while (num <= 100);

        
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma); 
    }
}
