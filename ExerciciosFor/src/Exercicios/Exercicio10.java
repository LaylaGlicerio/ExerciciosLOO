
package Exercicios;

/**
 *Exercício 10
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estrutura de Controle de Fluxo
 * Atividade: 10: Imprima os números de 1 a 100, substituindo os múltiplos de 3 por "Fizz", 
 *                 os múltiplos de 5 por "Buzz" e os múltiplos de ambos por "FizzBuzz".
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
          for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); 
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); 
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); 
            } else {
                System.out.println(i); 
            }
        } 
} }

    
