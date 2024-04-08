
package exercicios;

/**
 *Exercício 8
 * Data: 01/04/2024
 * @author: Layla Glicério
 * Disciplina: Linguagem Orientada a Objeto
 * Matéria: Estruturas de Repetição (While) 
 * Atividade: Crie um programa que simule uma contagem regressiva de 10 até 1, 
 *             imprimindo os números em cada iteração, usando um loop `while`. 
 */

public class Ex8 {
    public static void main(String[] args) {
        int contador = 10;

        System.out.println("Iniciando contagem regressiva...");

        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("Contagem regressiva concluída!");
    }
}
