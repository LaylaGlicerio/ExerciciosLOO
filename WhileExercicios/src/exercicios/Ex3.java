package exercicios;
/**
 *Exercício 3
 * Data: 26/03/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Desenvolva um programa que calcule a soma dos números pares de 1 a 100 usando um loop `while`.
 */
public class Ex3 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            
            if (numero % 2 == 0) {
                
                soma += numero;
            }
           numero++;
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}

